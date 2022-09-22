package ex2;

import java.util.ArrayList;
import java.util.List;

public class Peuple {
    private List<Homme> pays;
    private int nbHommes;
    public Peuple() {
        this.pays = new ArrayList<>();
        this.nbHommes = 0;
    }
    public void naissance(Homme h){
        pays.add(h);
        nbHommes++;
    }
    public void explorer(){
        for (Homme homme : pays) {
            homme.identite();
        }
        System.out.println("\nNombre hommes : "+nbHommes);
    }
    
}
