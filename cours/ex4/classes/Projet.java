package classes;

public class Projet {
    private String langages;
    private String titre;
    public Projet(String langages, String titre) {
        this.langages = langages;
        this.titre = titre;
    }
    public String getLangages() {
        return langages;
    }
    public String getTitre() {
        return titre;
    }
    
}
