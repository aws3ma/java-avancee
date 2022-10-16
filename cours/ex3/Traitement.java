import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Traitement {
    private Connection cnx;
    private static final String INSERT_PRODUCT = "insert into produit" + " values " + " (?, ?, ?, ?);";
    private static final String SELECT_ALL_PRODUCTS = "select * from produit";
    private static final String SELECT_PRODUCT_BY_REF = "select * from produit where reference =?";
    private static final String UPDATE_PRODUCT = "update produit set nom = ?, description=?, prixu=? where reference = ?";
    private static final String DELETE_PRODUCT = "delete from produit where reference = ?";
    public Traitement(){
        try {
            cnx = new Connexion().getInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean createProduit(Produit p) throws SQLException{
        try{
        PreparedStatement pd = cnx.prepareStatement(INSERT_PRODUCT);
        pd.setString(1, p.getRef());
        pd.setString(2, p.getNom());
        pd.setString(3, p.getDescription());
        pd.setFloat(4, p.getPrixU());
        pd.executeUpdate();
        return true;
    }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public void selectAllProduit(){
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(SELECT_ALL_PRODUCTS);
            while(rs.next()){
                Produit p = new Produit(rs.getString(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public Produit selectProduitByRef(String ref){
        Produit p=null;
        try {
            PreparedStatement pd = cnx.prepareStatement(SELECT_PRODUCT_BY_REF);
            pd.setString(1, ref);
            ResultSet rs = pd.executeQuery();
            while(rs.next()){
                p = new Produit(rs.getString(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return p;
    }
    public boolean updateProduct(Produit p){
        try {
            PreparedStatement pd = cnx.prepareStatement(UPDATE_PRODUCT);
            pd.setString(1, p.getNom());
            pd.setString(2, p.getDescription());
            pd.setFloat(3, p.getPrixU());
            pd.setString(4, p.getRef());
            System.out.println(pd);
            pd.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean deleteProduct(String ref){
        try {
            PreparedStatement pd = cnx.prepareStatement(DELETE_PRODUCT);
            pd.setString(1, ref);
            pd.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
