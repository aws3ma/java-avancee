package ex1;

import java.util.ArrayList;
import java.util.List;

public class Section{
    private int num;
    private List<Etudiant> listEtudiant;
    public Section(int num){
        this.num=num;
        listEtudiant = new ArrayList<>();
    }
    public boolean ajoutEtudiant(Etudiant e){
        return listEtudiant.add(e);
    }
    public boolean suppEtudiant(Etudiant e){
        return listEtudiant.remove(e);
    }
    public float moySection(){
        float moy=0f;
        for (Etudiant etudiant : listEtudiant) {
            moy+=etudiant.getMoy();
        }
        return moy/listEtudiant.size();
    }
    public float getMoyMax(){
        float moyMax=0f;
        for (Etudiant etudiant : listEtudiant) {
            if(etudiant.getMoy()>moyMax){
                moyMax=etudiant.getMoy();
            }
        }
        return moyMax;
    }
    @Override
    public String toString() {
        return "Numero : "+num+"\nNombre etudiants : "+listEtudiant.size()+"\nMoyenne section : "+moySection()+"\nMoyenne maximal : "+getMoyMax();
    }
}