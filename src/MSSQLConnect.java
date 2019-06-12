import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class MSSQLConnect {
	public static void main(String[] args) {
                try {
                        // not required for JDBC 4.0
                        // Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
                        String userName = "user";
                        String password = "pass";
                        String url = "jdbc:sqlserver://10.240.1.1:1433"+";databaseName=ACS4";
                        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
                        Connection con = DriverManager.getConnection(url, userName, password);
                        Statement s1 = con.createStatement();
                        ResultSet rs = s1.executeQuery("SELECT @@VERSION");
                        while (rs.next()) {
                                System.out.println(rs.getString(1));
                        }

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
