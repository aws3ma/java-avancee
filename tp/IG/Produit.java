import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Produit extends JFrame {
    public Produit() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel mainPan = new JPanel();
        // jtable
        String[][] data = {
                { "1", "Produit 1", "100" },
                { "2", "Produit 2", "150"},
                { "3", "Produit 3", "32" },
                { "4", "Produit 4", "26" }
        };
        String[] columnNames = { "ID", "LIBELLE", "PRIX" };
        DefaultTableModel model = new DefaultTableModel(data,columnNames);
        JTable t = new JTable();
        t.setModel(model);
        JScrollPane tpan = new JScrollPane(t);
        //South panel
        JPanel panSouth = new JPanel();
        panSouth.setLayout(new GridLayout(2,1));
        JPanel panButtons = new JPanel();
        panButtons.add(new JButton("Ok"));
        panButtons.add(new JButton("Annuler"));
        panButtons.add(new JButton("Fermer"));
        //Buttons panel
        JPanel panForm = new JPanel();
        String [] items = {"Disponible","Non Disponible"};
        panForm.setLayout(new GridLayout(5,2));
        panForm.add(new JLabel("ID"));
        panForm.add(new JTextField());
        panForm.add(new JLabel("Libelle"));
        panForm.add(new JTextField());
        panForm.add(new JLabel("Prix"));
        panForm.add(new JTextField());
        panForm.add(new JLabel("Etat"));
        panForm.add(new JComboBox<>(items));
        panForm.add(new JCheckBox("Show"));
        panSouth.add(panForm);
        panSouth.add(panButtons);
        mainPan.setLayout(new BorderLayout());
        mainPan.add(tpan, BorderLayout.NORTH);
        mainPan.add(panSouth, BorderLayout.SOUTH);
        this.setContentPane(mainPan);
        this.setVisible(true);
    }
}
