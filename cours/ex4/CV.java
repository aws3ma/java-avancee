import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import classes.Personne;
import classes.Projet;
import classes.Stage;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class CV extends JFrame {
    private String ch="";
    public CV(Personne p, ArrayList<Stage> stages, ArrayList<Projet> projets, ArrayList<String> competances) {
        this.setSize(1050, 700);
        this.setLayout(null);
        add(addJlabel(p.getNom(), 100, 100));
        add(addJlabel(p.getPrenom(), 200, 100));
        add(addJlabel(p.getSexe(), 300, 100));
        add(addJlabel(p.getNationalite(), 400, 100));
        add(addJlabel(p.getAge(), 500, 100));
        add(addJlabel(p.getAdr(), 100, 150));
        int x = 100;
        for (String l : p.getLoisir()) {
            add(addJlabel(l, x, 200));
            x += 100;
        }
        int y = 250;
        for (Stage s : stages) {
            add(addJlabel(s.getLieu(), 100, y));
            add(addJlabel(s.getPeriode(), 200, y));
            add(addJlabel(s.getTache(), 300, y));
            y += 50;
        }
        
        for(Projet pr : projets){
            add(addJlabel(pr.getTitre(), 100, y));
            add(addJlabel(pr.getLangages(), 200, y));
            y+=50;
        }
        x=100;
        for(String s:competances){
            add(addJlabel(s, x, y));
            if(x>=900){
                x=100;
                y+=50;
            }else{
                x+=100;
            }
            
        }
        JOptionPane.showMessageDialog(this,ch);  
        setVisible(true);
    }

    private JLabel addJlabel(String text, int x, int y) {
        Font labelFont = new Font("arial", Font.PLAIN, 18);
        JLabel jl = new JLabel(text);
        jl.setBounds(x, y, 150, 30);
        jl.setFont(labelFont);
        jl.setForeground(Color.BLACK);
        ch+=text+"\n";
        return jl;
    }
}
