package ex2;

public class Personne implements Homme {
    private String nom;
    private String prenom;
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public void identite() {
        System.out.println("Nom : "+nom+"\nPrenom "+prenom);
    }
    
}
