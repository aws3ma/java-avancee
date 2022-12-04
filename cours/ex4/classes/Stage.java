package classes;
public class Stage {
    private String lieu,periode,tache;

    public Stage(String lieu, String periode, String tache) {
        this.lieu = lieu;
        this.periode = periode;
        this.tache = tache;
    }

    public String getLieu() {
        return lieu;
    }

    public String getPeriode() {
        return periode;
    }

    public String getTache() {
        return tache;
    }
}
