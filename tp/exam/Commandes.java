import java.util.ArrayList;
import java.util.HashMap;

public class Commandes {
    private HashMap<String,ArrayList<Produit>> cmds;
    private int N;
    public int getN() {
        return N;
    }
    public Commandes() {
        cmds = new HashMap<>();
        N=0;
    }
    public void ajouterLigne() {
        N++;
        cmds.put("Commande n"+N, new ArrayList<>());
    }
    public void ajouter(String x,Produit p) {
        cmds.get(x).add(p);
    }
    public void afficher() {
        for (String key : cmds.keySet()) {
            System.out.println(key);
            for (Produit p : cmds.get(key)) {
                System.out.println(p);
            }
        }
    }
}
