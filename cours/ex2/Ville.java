import java.util.ArrayList;
import java.util.List;

public class Ville {
    private String nom;
    private int max;
    private List<Delegation> listDelegation;

    public Ville(String nom, int max) {
        this.nom = nom;
        this.max = max;
        listDelegation = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public boolean ajouterDelegation(Delegation d) {
        if (nbrHabitant() + d.getNbrHabitant() <= max) {
            return listDelegation.add(d);
        } else
            return false;
    }

    public boolean deleteDelegation(String nom) {
        Delegation d = rechercheDelegation(nom);
        if (d != null)
            return listDelegation.remove(d);
        return false;
    }

    public int nbrHabitant() {
        int s = 0;
        for (Delegation delegation : listDelegation) {
            s += delegation.getNbrHabitant();
        }
        return s;
    }

    private Delegation rechercheDelegation(String nom) {
        for (Delegation delegation : listDelegation) {
            if (delegation.getNom().equals(nom)) {
                return delegation;
            }
        }
        return null;
    }

    public Delegation rechercheMax() {
        Delegation d = listDelegation.get(0);
        for (Delegation delegation : listDelegation) {
            if (delegation.getNbrHabitant() > d.getNbrHabitant()) {
                d = delegation;
            }
        }
        return d;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + "\nNombre habitant : " + nbrHabitant();
    }
}