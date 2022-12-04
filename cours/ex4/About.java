import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Personne;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class About extends JPanel implements ActionListener, ItemListener {
    private JLabel title, nom, prenom, age, gender, nationalite, loisir, adress;
    private JTextField txtNom, txtprenom, txtage;
    private JTextArea txtAddress;
    private Checkbox checkMale, checkFemale, sport, music, dance;
    private CheckboxGroup genderCheckbox;
    private Choice nationchoices;
    private JButton ok, annuler;
    private Personne p;

    public Personne getP() {
        return p;
    }

    public About() {
        this.setSize(1050, 700);
        this.setLayout(null);
        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont = new Font("arial", Font.PLAIN, 18);
        Font textFont = new Font("arial", Font.PLAIN, 15);

        title = new JLabel("About");
        title.setBounds(525, 40, 300, 50);
        title.setFont(titleFont);
        title.setForeground(Color.BLUE);
        add(title);

        nom = new JLabel("Nom");
        nom.setBounds(250, 100, 150, 30);
        nom.setFont(labelFont);
        nom.setForeground(Color.BLACK);
        add(nom);

        txtNom = new JTextField();
        txtNom.setBounds(400, 100, 400, 30);
        txtNom.setFont(textFont);
        add(txtNom);

        prenom = new JLabel("Prenom");
        prenom.setBounds(250, 150, 150, 30);
        prenom.setFont(labelFont);
        prenom.setForeground(Color.BLACK);
        add(prenom);

        txtprenom = new JTextField();
        txtprenom.setBounds(400, 150, 400, 30);
        txtprenom.setFont(textFont);
        add(txtprenom);

        age = new JLabel("Age");
        age.setBounds(250, 200, 150, 30);
        age.setFont(labelFont);
        age.setForeground(Color.BLACK);
        add(age);

        txtage = new JTextField();
        txtage.setBounds(400, 200, 400, 30);
        txtage.setFont(textFont);
        add(txtage);

        gender = new JLabel("Gender");
        gender.setBounds(250, 250, 150, 30);
        gender.setFont(labelFont);
        gender.setForeground(Color.BLACK);
        add(gender);

        genderCheckbox = new CheckboxGroup();

        checkMale = new Checkbox("Male", genderCheckbox, true);
        checkMale.setBounds(400, 250, 100, 30);
        checkMale.setFont(labelFont);
        checkMale.setForeground(Color.BLACK);
        add(checkMale);

        checkFemale = new Checkbox("Female", genderCheckbox, false);
        checkFemale.setBounds(500, 250, 100, 30);
        checkFemale.setFont(labelFont);
        checkFemale.setForeground(Color.BLACK);
        add(checkFemale);

        nationalite = new JLabel("Nationalite");
        nationalite.setBounds(250, 300, 150, 30);
        nationalite.setFont(labelFont);
        nationalite.setForeground(Color.BLACK);
        add(nationalite);

        nationchoices = new Choice();
        nationchoices.setFont(labelFont);
        nationchoices.setBounds(400, 300, 400, 50);
        nationchoices.add("Tunisien");
        nationchoices.add("Algerien");
        nationchoices.add("Marocain");
        nationchoices.add("Libye");
        nationchoices.add("Mauritanien");
        nationchoices.addItemListener(this);
        add(nationchoices);

        loisir = new JLabel("Loisir");
        loisir.setBounds(250, 350, 150, 30);
        loisir.setFont(labelFont);
        loisir.setForeground(Color.BLACK);
        add(loisir);

        sport = new Checkbox("Sport");
        sport.setBounds(400, 350, 100, 50);
        sport.setFont(labelFont);
        sport.setForeground(Color.BLACK);
        add(sport);

        music = new Checkbox("Music");
        music.setBounds(500, 350, 100, 50);
        music.setFont(labelFont);
        music.setForeground(Color.BLACK);
        add(music);

        dance = new Checkbox("Dance");
        dance.setBounds(600, 350, 100, 50);
        dance.setFont(labelFont);
        dance.setForeground(Color.BLACK);
        add(dance);

        adress = new JLabel("Address");
        adress.setBounds(250, 400, 150, 30);
        adress.setFont(labelFont);
        adress.setForeground(Color.BLACK);
        add(adress);

        txtAddress = new JTextArea(10, 30);
        txtAddress.setBounds(400, 400, 400, 100);
        txtAddress.setFont(labelFont);
        add(txtAddress);

        ok = new JButton("Valider");
        ok.setBounds(350, 520, 150, 30);
        ok.setFont(labelFont);
        ok.setBackground(Color.GREEN);
        ok.setForeground(Color.BLACK);
        ok.addActionListener(this);
        add(ok);

        annuler = new JButton("Annuler");
        annuler.setBounds(550, 520, 150, 30);
        annuler.setFont(labelFont);
        annuler.setBackground(Color.RED);
        annuler.setForeground(Color.BLACK);
        annuler.addActionListener(this);
        add(annuler);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            p = new Personne();
            p.setNom(txtNom.getText());
            p.setPrenom(txtprenom.getText());
            p.setAge(txtage.getText());
            if (checkMale.getState() == true)
                p.setSexe("Male");
            else
                p.setSexe("Female");
            p.setNationalite(nationchoices.getSelectedItem());
            if (sport.getState() == true)
                p.addLoisir("Sport");
            if (music.getState() == true)
                p.addLoisir("Musique");
            if (dance.getState() == true)
                p.addLoisir("Dance");
            p.addLoisir(txtAddress.getText());
        }
        if (e.getSource() == annuler) {
            txtNom.setText("");
            txtprenom.setText("");
            txtAddress.setText("");
            txtage.setText("");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == nationchoices) {
            System.out.println(nationchoices.getSelectedItem());
        }

    }

}
