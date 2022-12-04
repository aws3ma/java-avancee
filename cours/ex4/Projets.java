import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import classes.Projet;
public class Projets extends JPanel implements ActionListener{
    private JTextField titre, langages;
    private JButton add ;
    private ArrayList<Projet> projetList;
    public ArrayList<Projet> getProjetList() {
        return projetList;
    }
    public Projets(){
        projetList = new ArrayList<>();
        this.setSize(1050, 600);
        this.setLayout(null);

        Font labelFont = new Font("arial", Font.PLAIN, 18);
        Font textFont = new Font("arial", Font.PLAIN, 15);
        Font titleFont = new Font("arial", Font.BOLD, 25);

        JLabel title = new JLabel("Projets");
        title.setBounds(525, 40, 300, 50);
        title.setFont(titleFont);
        title.setForeground(Color.BLUE);
        add(title);
        langages = new JTextField();
        
        
        JLabel titreLabel = new JLabel("Titre");
        titreLabel.setBounds(250, 200, 150, 30);
        titreLabel.setFont(labelFont);
        titreLabel.setForeground(Color.BLACK);
        add(titreLabel);
        
        titre = new JTextField();
        titre.setBounds(400, 200, 400, 30);
        titre.setFont(textFont);
        add(titre);
        JLabel langagesLabel = new JLabel("Langages");
        langagesLabel.setBounds(250, 300, 150, 30);
        langagesLabel.setFont(labelFont);
        langagesLabel.setForeground(Color.BLACK);
        add(langagesLabel);
        
        langages = new JTextField();
        langages.setBounds(400, 300, 400, 30);
        langages.setFont(textFont);
        add(langages);

        add = new JButton("+");
        add.setBounds(500, 400, 150, 30);
        add.setFont(labelFont);
        add.setBackground(Color.GREEN);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        projetList.add(new Projet(titre.getText(), langages.getText()));
        titre.setText("");
        langages.setText("");
    }
}
