import java.util.TreeMap;

public class Commandes {
    private TreeMap<String,Commande> cmde;
    public Commandes(){
        cmde = new TreeMap<>();
    }
    public void ajouterCommande(String code, Commande c){
        cmde.put(code, c);
    }
    public void retirerCommande(String code){
        cmde.remove(code);
    }
    public void ajouterProduit(String code, Produit p){
        cmde.get(code).ajouterProduit(p);
    }
    public void retirerProduit(String code, Produit p){
        cmde.get(code).retirerProduit(p.getNumProd());
    }
    public float calculRecette(){
        float recette = 0;
        for (Commande cmd : cmde.values()) {
            recette+=cmd.getPrixTotal();
        }
        return recette;
    }
    public void affiche(){
        for (String ch : cmde.keySet()) {
            System.out.println("Code commande : "+ch);
            System.out.println(cmde.get(ch));
        }
        System.out.println("Recette : "+calculRecette());
    }
}
