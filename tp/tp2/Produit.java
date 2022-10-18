public class Produit {
    private int id;
    private String libelle;
    private float prix;

    public Produit(String libelle, float prix) {
        this.libelle = libelle;
        this.prix = prix;
    }

    public Produit() {
    }

    public Produit(int id, String libelle, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", libelle=" + libelle + ", prix=" + prix + "]";
    }

}
