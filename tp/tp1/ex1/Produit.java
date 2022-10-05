public class Produit{
    private String libelle;
    private String designation;
    private static int numProdG=0;
    private int numProd;
    private float prixProd;
    public Produit(String lib, String des,float prix){
        numProdG+=1;
        numProd=numProdG;
        libelle=lib;
        designation=des;
        prixProd=prix;
    }
    public String getLibelle() {
        return libelle;
    }
    public String getDesignation() {
        return designation;
    }
    public int getNumProd() {
        return numProd;
    }
    public float getPrixProd() {
        return prixProd;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setPrixProd(float prixProd) {
        this.prixProd = prixProd;
    }
    @Override
    public String toString() {
        return "\nNumero produit : "+numProd+"\tLibelle produit : "+libelle+"\tDesignation produit : "+designation+"\tPrix produit : "+prixProd;
    }
}