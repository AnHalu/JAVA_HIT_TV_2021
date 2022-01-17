import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class displayAdminstrator {
    static Scanner sc = new Scanner(System.in) ;
    public static void mainAdminstrator (String handle , String password) throws SQLException, IOException {
        int chose ;
        do {

            System.out.println("\n-----------Welcome,"+ handle +"!--------------------");
            System.out.println("1.View personal information !");
            System.out.println("2.Top Rank codeforces !");
            System.out.println("3.View Problem !");
            System.out.println("4.Add Problem !");
            System.out.println("5.Set adminstrator ! ");
            System.out.println("6.View custormer list !");
            System.out.println("7.View status !");
            System.out.println("8.Log out !");
            System.out.print("Enter your chose : ");
            chose = sc.nextInt();
            while(chose<1 || chose>8) {
                System.out.println("Please enter your chose ( from 1 to 8 ) : ");
                chose = sc.nextInt() ;
            }
            switch (chose) {
                case 1 : {
                    display.viewInfo(handle);
                    break ;
                }
                case 2 : {
                    display.topRank();
                    break ;
                }
                case 3 : {
                    display.viewProblem(handle);
                    break ;
                }
                case 4 : {
                    display.addProblem();
                    break ;
                }
                case 5 : {
                    display.setAdmin();
                    break ;
                }
                case 6 : {
                    display.viewCustomerList() ;
                    break ;
                }
                case 7 : {
                    display.viewStatus() ;
                    break ;
                }
                case 8 : {
                    System.exit(0);
                    break ;
                }

            }
        }while (chose !=8 ) ;
    }
}
