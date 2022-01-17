import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class displayCustomer {
    static Scanner sc = new Scanner(System.in) ;
    public static void mainCustormer (String handle , String password) throws SQLException, IOException {
        int chose ;
        do {

            System.out.println("\n-----------Welcome,"+ handle +"!--------------------");
            System.out.println("1.View personal information !");
            System.out.println("2.Top Rank codeforces !");
            System.out.println("3.View Problem !");
            System.out.println("4.View custormer list !");
            System.out.println("5.View status !");
            System.out.println("6.Log out !");
            System.out.print("Enter your chose : ");
            chose = sc.nextInt();
            while(chose<1 || chose>6) {
                System.out.println("Please enter your chose ( from 1 to 6 ) : ");
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
                    display.viewCustomerList() ;
                    break ;
                }
                case 5 : {
                    display.viewStatus() ;
                    break ;
                }
                case 6 : {
                    System.exit(0);
                    break ;
                }
            }
        }while (chose !=6) ;
    }
}
