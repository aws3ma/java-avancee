import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class MyApp extends JFrame implements ActionListener, ItemListener {
    JLabel title, nom, prenom, age, gender, nationalite, loisir, adress;
    JTextField txtNom, txtprenom, txtage;
    JTextArea txtAddress, tout;
    Checkbox checkMale, checkFemale, sport, music, dance;
    CheckboxGroup genderCheckbox;
    Choice nationchoices;
    JButton ok, Annuler;

    public MyApp() {
        setTitle("Ex4");
        setSize(1366, 700);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(53, 59, 72);
        setBackground(formColor);

        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont = new Font("arial", Font.PLAIN, 18);
        Font textFont = new Font("arial", Font.PLAIN, 15);

        title = new JLabel("Formulaire");
        title.setBounds(550, 40, 300, 50);
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

        nationalite = new JLabel("nationalite");
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

        ok = new JButton("Envoyer");
        ok.setBounds(400, 550, 150, 30);
        ok.setFont(labelFont);
        ok.setBackground(Color.GREEN);
        ok.setForeground(Color.BLACK);
        ok.addActionListener(this);
        add(ok);

        Annuler = new JButton("Annuler");
        Annuler.setBounds(560, 550, 150, 30);
        Annuler.setFont(labelFont);
        Annuler.setBackground(Color.RED);
        Annuler.setForeground(Color.BLACK);
        Annuler.addActionListener(this);
        add(Annuler);
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(850, 100);
        tout.setText("");
        tout.setEditable(false);
        add(tout);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {

            String gender;
            String data = "Nom : " + txtNom.getText() + "\n" + "Prenom : " + txtprenom.getText() + "\n" + "Age : "
                    + txtage.getText() + "\n";
            if (checkMale.getState() == true)
                gender = "Gender : Male" + "\n";
            else
                gender = "Gender : Female" + "\n";
            String nationalite = "Nationalite : " + nationchoices.getSelectedItem() + "\n";
            String loisir= "Loisir : ";
            if (sport.getState() == true)
                loisir= loisir+ sport.getSelectedObjects()[0] + "\t";
            if (music.getState() == true)
                loisir= loisir+ music.getSelectedObjects()[0] + "\t";
            if (dance.getState() == true)
                loisir= loisir+ dance.getSelectedObjects()[0] + "\t";
            loisir= loisir+ "\n";
            String adr = "Address : " + txtAddress.getText();
            tout.setText(data + gender + nationalite + loisir + adr);
            tout.setEditable(false);
        }
        if (e.getSource() == Annuler) {
            txtNom.setText("");
            txtprenom.setText("");
            txtAddress.setText("");
            txtage.setText("");
            tout.setText("");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == nationchoices) {
            System.out.println(nationchoices.getSelectedItem());
        }

    }

}
