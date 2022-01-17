import java.io.IOException;
import java.sql.SQLException;

public class display {
    public static void viewInfo(String handle) throws SQLException {
        SQLProcessing.getInfor(handle);
    }
    public static void topRank() throws SQLException {
        SQLProcessing.gettopRank();
    }
    public static void viewProblem(String handle) throws SQLException, IOException {
        SQLProcessing.getProblemList(handle);
    }

    public static void addProblem() throws SQLException, IOException {
        SQLProcessing.addPromblem();
    }

    public static void setAdmin() throws SQLException, IOException {
        SQLProcessing.setAdmin();
    }


    public static void viewCustomerList() throws SQLException {
        SQLProcessing.viewCustomerList();
    }

    public static void viewStatus() throws SQLException {
        SQLProcessing.viewStatus();
    }
}
