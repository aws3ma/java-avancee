public class Produit {
    private String ref;
    private String nom;
    private String description;
    private float prixU;
    public Produit(String ref, String nom, String description, float prixU) {
        this.ref = ref;
        this.nom = nom;
        this.description = description;
        this.prixU = prixU;
    }
    public String getRef() {
        return ref;
    }
    public String getNom() {
        return nom;
    }
    public String getDescription() {
        return description;
    }
    public float getPrixU() {
        return prixU;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrixU(float prixU) {
        this.prixU = prixU;
    }
    @Override
    public String toString() {
        return "Ref=" + ref + ", Nom=" + nom + ", Description=" + description + ", Prix unitaire=" + prixU;
    }
    
}
