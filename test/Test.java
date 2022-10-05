import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) {
        try {
            Connection cnx = null;
            Class.forName("org.postgresql.Driver");
            cnx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
            if(cnx!=null) System.out.println("workiing");
            else System.out.println("not working");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}