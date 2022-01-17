import java.io.IOException;
import java.sql.*;
import java.util.Scanner ;

public class Main {

    static Scanner sc = new Scanner(System.in) ;

    public static void main(String[] args) throws SQLException, IOException {

        int chose ;
        System.out.println("-----------------------------------------------");
        System.out.println("------------WELCOME_TO_CODEFORCES--------------");
        System.out.println("1.Log in ");
        System.out.println("2.Register");
        System.out.println("3.Exit!");
        System.out.print("Enter your chose : ");
        chose = sc.nextInt() ;
        while(chose >3 || chose <1)
        {
            System.out.print("Please enter your chose! (1->3) : ");
            chose = sc.nextInt() ;
        }
        switch (chose) {
            case 1:
            {
                System.out.println("-----------LOG_IN_BOX-------------------------");
                LogIn() ;
                break ;
            }
            case 2:
            {
                System.out.println("-----------RESGISTER_BOX-----------");
                Resgister();
                break ;
            }
            case 3:
            {
                System.exit(0);
            }
        }
    }

    public static void LogIn() throws SQLException, IOException {
        String handle ;
        String password ;
        sc.nextLine();
        System.out.print("Enter Your Handle : "); handle = sc.nextLine() ;
        System.out.print("Enter Your Password : "); password = sc.nextLine() ;
        if(!SQLProcessing.checkHandleExits(handle , password , 0)){
            System.out.println("Wrong handle or password !") ;
            System.out.print("Do you want log in again ? [y/n] : ");
            Character chose ;
            chose = (char) System.in.read() ;
            if(chose.equals('y') || chose.equals('Y') ) {
                LogIn();
            }

        }
        else {
            // main
            if(SQLProcessing.checkHandleAdmin(handle)) {
                displayAdminstrator.mainAdminstrator(handle,password);
            }
            else {
                displayCustomer.mainCustormer(handle,password);
            }
        }


    }
    public static void Resgister() throws SQLException, IOException {
        String handle ;
        String password ;
        String repassword ;
        sc.nextLine();
        System.out.print("Enter Your Handle : "); handle = sc.nextLine() ;
        System.out.print("Enter Your Password : "); password = sc.nextLine() ;
        System.out.print("Enter Your Repassword : "); repassword = sc.nextLine() ;

        if(repassword.equals(password)) {
            if(SQLProcessing.checkHandleExits(handle , password,1)){
                System.out.println("Handle already exist !") ;
                System.out.print("Do you want resgister again ? [y/n] : ");
                Character chose ;
                chose = (char) System.in.read() ;
                if(chose.equals('y') || chose.equals('Y') ) {
                    Resgister();
                }

            }
            else {
                System.out.println("Resgister successfull !");
                System.out.print("Do you want log in ? [y/n] : ");
                Character chose ;
                chose = (char) System.in.read() ;
                if(chose.equals('y') || chose.equals('Y') ) {
                    LogIn();
                }

            }
        }
    }
}
