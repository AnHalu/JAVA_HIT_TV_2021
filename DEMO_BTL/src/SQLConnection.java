
import java.sql.*;
public class SQLConnection {
    public static Connection getJDBCconnection(){
        final String url = "jdbc:sqlserver://localhost:1433;database=ANHALU;user=sa;password=123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver") ;
            return DriverManager.getConnection(url) ;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null ;
    }
}
