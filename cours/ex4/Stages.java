import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import classes.Stage;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Stages extends JPanel implements ActionListener{
    private JTextField lieu, periode;
    private JTextArea tache;
    private JButton add;
    private ArrayList<Stage> stagesList;
    public ArrayList<Stage> getStagesList() {
        return stagesList;
    }

    private String[] columnNames = { "Lieu stage", "Periode", "Tache effectuer" };
    private DefaultTableModel model;
    private JTable t = new JTable();
    private JScrollPane tpan;

    public Stages() {
        this.setSize(1050, 600);
        this.setLayout(null);
        stagesList = new ArrayList<>();
        Font labelFont = new Font("arial", Font.PLAIN, 18);
        Font textFont = new Font("arial", Font.PLAIN, 15);
        refreshJTable();
        tpan = new JScrollPane(t);
        tpan.setBounds(0, 0, 1050, 350);
        add(tpan);

        
        periode = new JTextField();
        tache = new JTextArea();


        JLabel lieuL = new JLabel("Lieu");
        lieuL.setBounds(100, 400, 150, 30);
        lieuL.setFont(labelFont);
        lieuL.setForeground(Color.BLACK);
        add(lieuL);

        lieu = new JTextField();
        lieu.setBounds(250, 400, 400, 30);
        lieu.setFont(textFont);
        add(lieu);

        JLabel periodeL = new JLabel("Periode");
        periodeL.setBounds(100, 450, 150, 30);
        periodeL.setFont(labelFont);
        periodeL.setForeground(Color.BLACK);
        add(periodeL);

        periode = new JTextField();
        periode.setBounds(250, 450, 400, 30);
        periode.setFont(textFont);
        add(periode);

        JLabel tacheL = new JLabel("Tache Effectuer");
        tacheL.setBounds(100, 500, 150, 30);
        tacheL.setFont(labelFont);
        tacheL.setForeground(Color.BLACK);
        add(tacheL);

        tache = new JTextArea();
        tache.setBounds(250, 500, 400, 30);
        tache.setFont(textFont);
        add(tache);

        add = new JButton("Ajouter");
        add.setBounds(800, 450, 150, 30);
        add.setFont(labelFont);
        add.setBackground(Color.GREEN);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);
        add.addActionListener(this);

        setVisible(true);
    }

    private void refreshJTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        for (Stage p : stagesList) {
            model.addRow(new String[] { p.getLieu(), p.getPeriode(), p.getTache() });
        }
        t.setModel(model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Stage s = new Stage(lieu.getText(),periode.getText(),tache.getText());
        stagesList.add(s);
        refreshJTable();
        lieu.setText("");
        tache.setText("");
        periode.setText("");
    }
}
