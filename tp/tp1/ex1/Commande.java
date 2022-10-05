import java.util.LinkedList;

public class Commande {
    private LinkedList<Produit> list;
    private float prixTotal;
    public Commande(){
        prixTotal=0;
        list = new LinkedList<>();
    }
    public float getPrixTotal() {
        return prixTotal;
    }
    public boolean ajouterProduit(Produit p){
        if(list.add(p)){
            prixTotal+=p.getPrixProd();
            return true;
        }
        return false;
    }
    public boolean retirerProduit(int num){
        Produit toDelete = getProduitByNum(num);
        if(toDelete !=null){
            prixTotal-=toDelete.getPrixProd();
            return list.remove(toDelete);
        }
        return false;
    }
    private Produit getProduitByNum(int num){
        for (Produit produit : list) {
            if(produit.getNumProd()==num){
                return produit;
            }
        }
        return null;
    }
    public int nombreProduit(){
        return list.size();
    }
    public boolean estPresent(Produit p){
        Produit toFind = getProduitByNum(p.getNumProd());
        if(toFind != null){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String ch ="";
        for (Produit produit : list) {
            ch+=produit+"\n";
        }
        ch+="\nNombre des produits : "+nombreProduit()+" \tPrix Total : "+prixTotal+"\n\n";
        return ch;
    }
}
