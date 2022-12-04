import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Competances extends JPanel implements ActionListener {
    private JTextField competance;
    private JButton add;
    private ArrayList<String> compList;
    public ArrayList<String> getCompList() {
        return compList;
    }

    private String[] columnNames = { "Competance" };
    private DefaultTableModel model;
    private JTable t = new JTable();
    private JScrollPane tpan;

    public Competances() {
        this.setSize(1050, 700);
        this.setLayout(null);

        Font labelFont = new Font("arial", Font.PLAIN, 18);
        Font textFont = new Font("arial", Font.PLAIN, 15);
        compList = new ArrayList<>();
        refreshJTable();
        tpan = new JScrollPane(t);
        tpan.setBounds(0, 0, 1050, 500);
        add(tpan);

        JLabel competanceLabel = new JLabel("Competance");
        competanceLabel.setBounds(100, 520, 150, 30);
        competanceLabel.setFont(labelFont);
        competanceLabel.setForeground(Color.BLACK);
        add(competanceLabel);

        competance = new JTextField();
        competance.setBounds(300, 520, 300, 30);
        competance.setFont(textFont);
        add(competance);

        add = new JButton("+");
        add.setBounds(700, 520, 150, 30);
        add.setFont(labelFont);
        add.setBackground(Color.GREEN);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);
        setVisible(true);
    }

    private void refreshJTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        for (String p : compList) {
            model.addRow(new String[] { p });
        }
        t.setModel(model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!competance.getText().equals("")) {
            compList.add(competance.getText());
            refreshJTable();
            competance.setText("");
        }
    }
}
