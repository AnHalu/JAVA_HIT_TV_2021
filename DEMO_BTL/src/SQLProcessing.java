import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class SQLProcessing {

    static Connection con = SQLConnection.getJDBCconnection();
    static Statement statement;
    static Scanner sc = new Scanner(System.in);

    static {
        try {
            statement = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //check handle
    public static boolean checkHandleExits(String Handle, String Password, int check) throws SQLException {
        String SQLselectHandle = "select * from Handlelist";
        ResultSet resultSet = statement.executeQuery(SQLselectHandle);
        Handle = Handle.toLowerCase();
        Password = Password.toLowerCase();
        if (check == 0) {//log in
            while (resultSet.next()) {
                String han = resultSet.getString(1);
                String pass = resultSet.getString(2);
                if (Handle.toLowerCase().equals(han) && Password.toLowerCase().equals(pass)) {
                    return true;
                }
            }
            return false;
        } else if (check == 1) {
            while (resultSet.next()) {//resgister
                String han = resultSet.getString(1);
                if (Handle.toLowerCase().equals(han)) {
                    return true;
                }
            }
            //insert vo bang neu chua co handle
            String SQLinsertHandle = "insert into handlelist values ('" + Handle + "','" + Password + "', 0)";
            statement.executeUpdate(SQLinsertHandle);
            //insert thong tin none vo handle
            String SQLinfro = "insert into infor values ('" + Handle + "','none',0,'none','none',0,0)";
            statement.executeUpdate(SQLinfro);
            return false;
        }

        return true;
    }


    //check admin
    public static boolean checkHandleAdmin(String Handle) throws SQLException {
        String SQLselectHandle = "select * from Handlelist where admins=1 ";
        ResultSet resultSet = statement.executeQuery(SQLselectHandle);
        Handle = Handle.toLowerCase();
        while (resultSet.next()) {
            if (resultSet.getString("Handle").toLowerCase().equals(Handle)) return true;
        }
        return false;
    }

    //get infor
    public static void getInfor(String Handle) throws SQLException {
        String SQLgetinfor = "select * from infor where handle = '" + Handle + "'";
        ResultSet resultSet = statement.executeQuery(SQLgetinfor);
        resultSet.next();
        System.out.println("\nInformation !");
        System.out.println("Handle : " + resultSet.getString(1));
        System.out.println("Fullname : " + resultSet.getString(2));
        System.out.println("NumberPhone : " + resultSet.getInt(3));
        System.out.println("Gmail : " + resultSet.getString(4));
        System.out.println("Address : " + resultSet.getString(5));
        System.out.println("Rating : " + resultSet.getInt(6));
        System.out.println("Number AC : " + resultSet.getInt(7));
        System.out.println("1.Edit information !");
        System.out.println("2.Back!");
        int chose;
        chose = sc.nextInt();
        if (chose == 1) {
            String fullname, gmail, address;
            int num;
            System.out.print("Fullname : ");
            sc.nextLine();
            fullname = sc.nextLine();
            System.out.print("NumberPhone : ");
            num = sc.nextInt();
            System.out.print("Gmail : ");
            sc.nextLine();
            gmail = sc.nextLine();
            System.out.print("Address : ");
            address = sc.nextLine();
            editInfor(Handle, fullname, num, gmail, address);
            System.out.println("Edit successfull ! ");
        }

    }


    //edit infor
    public static void editInfor(String handle, String fullname, int number, String gmail, String address) throws SQLException {
        String SQLupdateinfor = "update infor set fullname = '" + fullname + "' , numberphone = " + number + " ," +
                " gmail = '" + gmail + "' , address = '" + address + "'  where handle = '" + handle + "' ";
        statement.executeUpdate(SQLupdateinfor);
    }


    //get top rank
    public static void gettopRank() throws SQLException {
        System.out.println("\nRating codeforces : ");
        System.out.printf("%10s%10s \n","Handle", "Rating ");
        String SQLgetTopRank = "select handle , rating from infor order by Rating desc";
        ResultSet resultSet = statement.executeQuery(SQLgetTopRank);
        while (resultSet.next()) {
            System.out.printf("%10s%10d \n", resultSet.getString(1), resultSet.getInt(2));
        }

        System.out.println("1.Back!"); sc.nextLine() ;
    }


    //get problem
    public static void getProblemList(String handle) throws SQLException, IOException {
        System.out.println("\nList Problem !");
        String SQLproblemList = "select * from problemlist";
        ResultSet resultSet = statement.executeQuery(SQLproblemList);
        System.out.printf("%20s%20s%20s%20s\n","Code" ,"Score","AC","NameProblem");
        while (resultSet.next()) {
            System.out.printf("%20s%20d%20d%20s\n", resultSet.getString(1), resultSet.getInt(3), resultSet.getInt(4), resultSet.getString(2));
        }
        System.out.println("1.Open problem !");
        System.out.println("2.Back!");
        int chose;
        chose = sc.nextInt();
        if (chose == 1) {
            openProblem(handle);
        }

    }


    //check code problem
    public static int checkCode(String code) throws SQLException {
        String SQLcheckCode = "select * from problemlist";
        ResultSet resultSet = statement.executeQuery(SQLcheckCode);
        while (resultSet.next()) {
            if (resultSet.getString(1).toLowerCase().equals(code.toLowerCase())) {
                return resultSet.getInt(3);
            }
        }
        return -1;
    }


    //open and submit
    public static void openProblem(String handle) throws SQLException {
        sc.nextLine();
        String code;
        System.out.print("\nEnter code problem : ");
        code = sc.nextLine();
        int Score = checkCode(code);
        if (Score == -1) {
            System.out.println("Wrong code !");
            /*System.out.print("Do you want open again ? [y/n] : ");
            Character chose;
            chose = (char) System.in.read();
            if (chose.equals('y') || chose.equals('Y')) {
                openProblem(handle);
            }*/
        } else {
            String SQLgetContent = "select * from Content where code = '" + code + "'";
            ResultSet resultSet = statement.executeQuery(SQLgetContent);
            resultSet.next();
            System.out.println("Code : " + code);
            System.out.println("Name : " + resultSet.getString(2));
            System.out.println("Content : " + resultSet.getString(3));
            System.out.println("Input : " + resultSet.getString(4));
            int output;
            System.out.print("Enter your answer : ");
            output = sc.nextInt();
            //insert status ;
            String res = "Wrong";
            if (resultSet.getInt(5) == output) {
                res = "Correct!";
                System.out.println("Correct Answer !");
                String SQLupdateProblem = "update problemlist set AC = AC+1 where Code = '"+code+"'";
                statement.executeUpdate(SQLupdateProblem);
                String SQLupdateInfor = "update infor set rating = rating + " + Score + " , NumberAC = NumberAC + 1 where handle = '" + handle + "'";
                statement.executeUpdate(SQLupdateInfor);
            } else {
                System.out.println("Wrong Answer !");
            }
            String SQLUpdateStatus = "insert into status values ('" + handle + "' , '" + code + "' , '" + res + "')";
            statement.executeUpdate(SQLUpdateStatus);
        }
    }

    //addProbem
    public static void addPromblem() throws SQLException {
        String code , name ,content , inp  ;
        int outp , score;
        System.out.print("\nEnter code : "); code = sc.nextLine() ;
        if(checkCode(code)==-1) {
            System.out.print("Enter name : "); name = sc.nextLine() ;
            System.out.print("Enter content : "); content = sc.nextLine() ;
            System.out.print("Enter input : "); inp = sc.nextLine() ;
            System.out.print("Enter output :"); outp = sc.nextInt() ;
            System.out.print("Enter score : "); score = sc.nextInt() ;
            String SQLAddProblem = "insert into content values ('"+code+"' ,'"+name+"' ,'"+content+"' , '"+inp+"' , "+outp+")" ;
            statement.executeUpdate(SQLAddProblem) ;
            String SQLAppProblemlist = "insert into problemlist values ('"+code+"' , '"+name+"' , "+score+" ,0 ) " ;
            statement.executeUpdate(SQLAppProblemlist) ;
            System.out.println("Add problem successful !");
        }
        else {
            System.out.println("Code already exist!");
        }

    }


    //set admin
    public static void setAdmin() throws SQLException {
        System.out.print("\nEnter handle you want to set : ");
        String handle;
        handle = sc.nextLine();
        String SQLgetHandle = "select handle from handlelist " ;
        ResultSet resultSet = statement.executeQuery(SQLgetHandle) ;
        boolean check = false ;
        while(resultSet.next()) {
            if(resultSet.getString(1).toLowerCase().equals(handle.toLowerCase())) {
                check = true ;
                break ;
            }
        }
        if(check) {
            System.out.println("Set successful!");
            String SQLUpdateAdmin ="update handlelist set Admins = 1 where handle = '"+handle+"' " ;
            statement.executeUpdate(SQLUpdateAdmin) ;
        }
        else {
            System.out.println("Handle does not exist !");
        }
    }


    //view customer list
    public static  void viewCustomerList() throws SQLException {
        String SQLgetHandleCustomer = "select * from handlelist inner join infor on handlelist.Handle = Infor.Handle where admins = 0  " ;
        ResultSet resultSet = statement.executeQuery(SQLgetHandleCustomer) ;
        System.out.printf("\n%10s%10s%10s%10s\n" , "Handle" , "Fullname" , "Rating" , "NumberAC");
        while(resultSet.next()) {
            System.out.printf("%10s%10s%10d%10d\n" , resultSet.getString("Handle") , resultSet.getString("Fullname") ,
                    resultSet.getInt("Rating") , resultSet.getInt("NumberAC"));
        }
        System.out.println("1.Back!"); sc.nextLine() ;
    }


    //view Status
    public static void viewStatus() throws SQLException {
        String SQLgetStatus = "select * from status" ;
        ResultSet resultSet = statement.executeQuery(SQLgetStatus) ;
        System.out.println("\nStatus list !");
        System.out.printf("%10s%15s%10s\n" , "Handle" ,"CodeProblem" , "Result" );
        while (resultSet.next()) {
            System.out.printf("%10s%15s%10s\n" , resultSet.getString(1), resultSet.getString(2),resultSet.getString(3));
        }

        System.out.println("1.Back!"); sc.nextLine() ;
    }
}
