package ex2;

public class Client extends Personne {
    private int numero;
    public Client(String nom, String prenom, int numero) {
        super(nom, prenom);
        this.numero=numero;
    }
    public void identite() {
        super.identite();
        System.out.println("Numero "+numero);
    }
    
}
