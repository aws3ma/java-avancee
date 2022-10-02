public class Delegation {
    private String nom;

    private int nbrHabitant;
    private int max;

    public boolean setNbrHabitant(int nbrHabitant) {
        if (nbrHabitant <= max) {
            this.nbrHabitant = nbrHabitant;
            return true;
        }
        return false;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrHabitant() {
        return nbrHabitant;
    }

    public Delegation(String nom, int nbrHabitant, int max) {
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + "\nNombre habitant : " + nom;
    }
}
