import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    private static Connection con;
    static{
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK");
            String url = "jdbc:postgresql://localhost:5432/catalogue";
            String user = "java";
            String pwd = "java";
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return con;
    }
}
