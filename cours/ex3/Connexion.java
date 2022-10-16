import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    private Connection cnx;
    public Connexion(){
        try {
            Class.forName("org.postgresql.Driver");
            cnx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/stock", "java", "java");
            System.out.println("Working");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public Connection getInstance() {
        return cnx;
    }
}
