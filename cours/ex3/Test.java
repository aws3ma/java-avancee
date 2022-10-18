import java.sql.SQLException;

class Test {
    public static void main(String[] args) throws SQLException {
        Traitement t = new Traitement();
        // Produit p = new Produit("P3", "Produit 3", "Produit trois", 100f);
        t.selectAllProduit();
        // if(t.createProduit(p)) System.out.println("created");
        // if(t.updateProduct(p)) System.out.println("updated");
        // if(t.deleteProduct("P3")) System.out.println("delated");

        // System.out.println(t.selectProduitByRef("P3"));
    }
}