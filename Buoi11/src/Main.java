import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.util.logging.FileHandler;



public class Main {

    public static List<Account> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in) ;
    public static Scanner scan ;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static Date date;
    static Pattern pattern;
    static FileControl file = new FileControl();

    static final String REGEX_USERNAME = "^[a-zA-Z0-9]{6,}$";
    static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
    static final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    static final String REGEX_PHONE = "^[0-9\\-\\+]{9,15}$";
    static final String  ACCOUNT_FILE_NAME = "ACC.dat";

    public static void main(String[] args) throws IOException {
        int choice ;
        do{
            System.out.println("1.Create new account.");
            System.out.println("2.Login to an existing account.");
            System.out.println("3.Sort accounts by username.");
            System.out.println("4.Exit.");
            choice = sc.nextInt() ;
            switch (choice) {
                case 1 : CreatNewAccount(); break ;
                case 2 : LoginToAccount(); break ;
                case 3 : SortAccout() ; break ;
                case 4 : System.exit(0); ; break ;
            }
        }while(true) ;
    }
    public static void CreatNewAccount() throws IOException {
        long id;
        String fullName, username, password, rePassword, email, phone, createAt;
        do {
            System.out.print("Nhap ID : "); id = sc.nextInt() ;
            if(check(id)) System.out.println("ID da ton tai !");
        }while(check(id)) ;
        sc.nextLine();
        System.out.print("Nhap fullname : "); fullName = sc.nextLine() ;
        boolean checkemail ,checkpass , checkphone ,checkuser;
        pattern = Pattern.compile(REGEX_USERNAME) ;

        do{
            System.out.print("Nhap username : "); username = sc.nextLine() ;
            Matcher matcher = pattern.matcher(username) ;
            checkuser = matcher.find() ;
            if(!checkuser){
                System.out.println("Nhap thieu ky tu!");
            } else if(check(username)) System.out.println("Usernaem da ton tai !");
        }while (check(username) && !checkuser ) ;



        pattern = Pattern.compile(REGEX_PASSWORD);
        do {
            System.out.print("Nhap password : "); password = sc.nextLine();
            checkpass = pattern.matcher(password).find() ;
            if(!checkpass) {
                System.out.println("Nhap thieu ky tu !");
            } else {
                System.out.print("Nhap lai password : "); rePassword = sc.nextLine() ;
                checkpass = pattern.matcher(rePassword).find() ;
                if(!checkpass)  {
                    System.out.println("Khong chinh xac ! Yeu cau nhap lai");
                }
            }
        }while(!checkpass) ;

        pattern = Pattern.compile(REGEX_EMAIL) ;
        do{
            System.out.print("Nhap email : "); email = sc.nextLine() ;
            Matcher matcher = pattern.matcher(email) ;
            checkemail = matcher.find() ;
            if(!checkemail) {
                System.out.print("Nhap thieu ky tu");
            }
        }while(!checkemail) ;

        pattern = Pattern.compile(REGEX_PHONE) ;
        do{
            System.out.print("Nhap Phone : "); phone = sc.nextLine() ;
            checkphone = pattern.matcher(phone).find() ;
            if(!checkphone) {
                System.out.print("Chi nhap 0 - 9 !");
            }
        }while(!checkphone) ;

        date = new Date();
        createAt = simpleDateFormat.format(date);

        Account naccount = new Account(id, fullName, username, password, email, phone, createAt);
        file.writeAccountToFile(ACCOUNT_FILE_NAME, naccount);
    }

    public static boolean check(long id) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id) return true;
        }
        return false;
    }
    public static boolean check(String username) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getUsername() == username) return true;
        }
        return false;
    }

    public static void LoginToAccount() throws IOException {
        sc.nextLine();
        System.out.print("username: ");
        String username = sc.nextLine();
        System.out.print("password: ");
        String password = sc.nextLine();
        if (checkAccount(username, password)) {
            System.out.println("1. Show info.\n"
                    + "2. Change password.");
            System.out.print("Enter select: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    showInfo(username, password);
                    break;
                case 2:
                    changePassword(username, password);
                    break;
                default:
                    break;
            }
        } else {
            do {
                System.out.println("Nhap sai ! Yeu cau nhap lai !");
                System.out.print("username: ");
                username = sc.nextLine();
                System.out.print("password: ");
                password = sc.nextLine();
            } while (!checkAccount(username, password));
        }
    }

    public static boolean checkAccount(String username, String password) throws IOException {
        list = file.readAccountFromFile("Account.dat");
        for (Account acc : list) {
            if (username.compareTo(acc.getUsername()) == 0 && password.compareTo(acc.getPassword()) == 0) {
                return true;
            }
        }
        return false;
    }
    public static void showInfo(String username, String password) {
        list = file.readAccountFromFile("Account.dat");
        for (Account acc : list) {
            if (username.compareTo(acc.getUsername()) == 0 && password.compareTo(acc.getPassword()) == 0) {
                acc.output();
            }
        }
    }

    public static void changePassword(String username, String password) throws IOException {
        list = file.readAccountFromFile("Account.dat");
        for (Account acc : list) {
            if (username.compareTo(acc.getUsername()) == 0 && password.compareTo(acc.getPassword()) == 0) {
                System.out.println("Enter new password: ");

                boolean checkpass;
                pattern = Pattern.compile(REGEX_PASSWORD);
                do {
                    System.out.print("Nhap password : "); password = sc.nextLine();
                    checkpass = pattern.matcher(password).find() ;
                    if(!checkpass) {
                        System.out.print("Nhap thieu ky tu !");
                    } else {
                        System.out.print("Nhap lai password : "); String rePassword = sc.nextLine() ;
                        checkpass = pattern.matcher(rePassword).find() ;
                        if(!checkpass)  {
                            System.out.println("Khong chinh xac ! Yeu cau nhap lai");
                        }
                    }
                }while(!checkpass) ;
                acc.setPassword(password);
                file.updateAccountToFile("Account.dat", list);
            }
        }
        System.out.println("Change password success!");
    }


    public static void SortAccout() throws IOException {
        list = file.readAccountFromFile("Account.dat");
        Collections.sort(list);
        System.out.println("List account after sort: ");
        file.updateAccountToFile("Account.dat", list);
        for (Account acc : list) {
            acc.output();
        }
    }



}
