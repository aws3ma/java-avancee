public class ExecuteAbonnement {
    public static void main(String[] args) {
        Produit p1 = new Produit("P1","Produit un",120f);
        Produit p2 = new Produit("P2","Produit deux",90f);
        Produit p3 = new Produit("P3","Produit trois",1200f);
        Produit p4 = new Produit("P4","Produit quatre",10f);
        Commande c1 = new Commande();
        Commande c2 = new Commande();
        c1.ajouterProduit(p4);
        c1.ajouterProduit(p1);
        c2.ajouterProduit(p3);
        c2.retirerProduit(p3.getNumProd());
        c1.ajouterProduit(p3);
        Commandes cmdes = new Commandes();
        cmdes.ajouterCommande("c2", c2);
        cmdes.ajouterCommande("c1", c1);
        cmdes.ajouterProduit("c2", p2);
        cmdes.affiche();
    }
}
