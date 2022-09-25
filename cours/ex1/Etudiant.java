package ex1;
import java.util.ArrayList;
import java.util.List;
public class Etudiant{
    private String cin;
    private String nom;
    private String prenom;
    private List<Float> notesList;
    public List<Float> getNotesList() {
        return notesList;
    }
    public void setNotesList(List<Float> notesList) {
        this.notesList = notesList;
    }
    public Etudiant(String nom,String prenom,String cin){
        this.nom=nom;
        this.prenom=prenom;
        this.cin=cin;
        notesList = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public float getMoy(){
        float moy=0;
        for (Float note : notesList) {
            moy+=note;
        }
        return moy/notesList.size();
    }
    public String resultat(){
        float moy=getMoy();
        String res="";
        if(moy<10){
            res= "redoublant";
        }else{
            if(moy<12)
                res= "passable";
            if(moy<14)
                res= "bien";
            if(moy<16)
                res ="tres bien";
            if(moy<18)
                res ="excellent";
            if(moy>18)
                res= "honorable";
        }
        return res;
    }
    @Override
    public String toString() {
        return "Cin ; "+cin+"\nNom : "+nom+"\nPrenom : "+prenom+"\nMoy : "+getMoy()+" "+resultat();
    }
    
}