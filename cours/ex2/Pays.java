import java.util.HashMap;
import java.util.Map;

public class Pays {
    private String nom;
    private Map<Ville, Integer> mapVille;

    public Pays(String nom) {
        this.nom = nom;
        mapVille = new HashMap<>();
    }
    
    private void update() {
        for (Ville v : mapVille.keySet()) {
            mapVille.replace(v, mapVille.get(v), v.nbrHabitant());
        }
    }

    public void ajouterVille(Ville v) {
        mapVille.put(v, v.nbrHabitant());
    }

    public void supprimerVille(String nom) {
        Ville v = rechercheVille(nom);
        if (v != null) {
            mapVille.remove(v);
        }
    }

    public int getNbrHabitant() {
        update();
        int s = 0;
        for (Ville v : mapVille.keySet()) {
            s += mapVille.get(v);
        }
        return s;
    }

    private Ville rechercheVille(String nom) {
        for (Ville ville : mapVille.keySet()) {
            if (ville.getNom().equals(nom)) {
                return ville;
            }
        }
        return null;
    }

    public Ville rechercheMax() {
        update();
        Ville v = (Ville) mapVille.keySet().toArray()[0];
        for (Ville ville : mapVille.keySet()) {
            if (mapVille.get(v) < mapVille.get(ville)) {
                v = ville;
            }
        }
        return v;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + "\nNombre habitant : " + getNbrHabitant();
    }
}
