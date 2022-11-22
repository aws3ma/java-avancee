import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
public class Traitement {
    private Connection con;
    private final String SELECT_ALL = "select * from produit";
    private final String SELECT_BY_ID = "select * from produit where id = ?";
    private final String FILTER_BY_NAME = "select * from produit where libelle like ?";
    private final String INSERT_PRODUCT = "insert into produit values(?,?,?)";
    private final String UPDATE_PRODUCT = "update produit set libelle = ?, prix=? where id = ?";
    private final String DELETE_PRODUCT = "delete from produit where id = ?";

    public Traitement() {
        con = Connect.getConnection();
    }

    public void save(Produit p) {
        try {
            PreparedStatement pd = con.prepareStatement(INSERT_PRODUCT);
            pd.setInt(1, p.getId());
            pd.setString(2, p.getLibelle());
            pd.setFloat(3, p.getPrix());
            pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Produit> produitsParMC(String mc) {
        List<Produit> listProduit = new ArrayList<>();
        try {
            PreparedStatement pd = con.prepareStatement(FILTER_BY_NAME);
            pd.setString(1, "%"+mc+"%");
            System.out.println(pd.toString());
            ResultSet rs = pd.executeQuery();
            while (rs.next()) {
                Produit p = new Produit(rs.getInt(1), rs.getString(2), rs.getFloat(3));
                listProduit.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduit;
    }

    public Produit geProduit(int id) {
        Produit p = null;
        try {
            PreparedStatement pd = con.prepareStatement(SELECT_BY_ID);
            pd.setInt(1, id);
            ResultSet rs = pd.executeQuery();
            while(rs.next()){
                p = new Produit(rs.getInt(1), rs.getString(2), rs.getFloat(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void updateProduit(Produit p){
        try {
            PreparedStatement pd = con.prepareStatement(UPDATE_PRODUCT);
            pd.setString(1, p.getLibelle());
            pd.setFloat(2, p.getPrix());
            pd.setInt(3, p.getId());
            pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProduit(int id){
        try {
            PreparedStatement pd = con.prepareStatement(DELETE_PRODUCT);
            pd.setInt(1, id);
            pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Produit> getAllProduits() {
        List<Produit> listProduit = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SELECT_ALL);
            while (rs.next()) {
                Produit p = new Produit(rs.getInt(1), rs.getString(2), rs.getFloat(3));
                listProduit.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduit;
    } 
}
