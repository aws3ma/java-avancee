package classes;

import java.util.ArrayList;

public class Personne {
    private String nom,prenom,sexe,age,adr,nationalite;
    private ArrayList<String> loisir;
    public Personne(String nom, String prenom, String sexe, String age, String adr, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.adr = adr;
        this.nationalite = nationalite;
        loisir = new ArrayList<>();
    }
    public Personne(){
        loisir = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getSexe() {
        return sexe;
    }
    public String getAge() {
        return age;
    }
    public String getAdr() {
        return adr;
    }
    public String getNationalite() {
        return nationalite;
    }
    public ArrayList<String> getLoisir() {
        return loisir;
    }
    public void addLoisir(String l){
        loisir.add(l);
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setAdr(String adr) {
        this.adr = adr;
    }
    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
}
