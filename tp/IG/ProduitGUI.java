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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ProduitGUI extends JFrame implements ActionListener {
    private JPanel mainPan;
    private JButton bOk, bAnnuler, bFermer;
    private String[] columnNames = { "ID", "LIBELLE", "PRIX" };
    private DefaultTableModel model;
    private JTable t = new JTable();
    private JScrollPane tpan;
    private JPanel panSouth, panButtons, panForm;
    private JTextField id, libelle, prix;
    private Traitement trait = new Traitement();

    public ProduitGUI() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainPan = new JPanel();
        refreshJTable();
        tpan = new JScrollPane(t);
        // South panel
        panSouth = new JPanel();
        panSouth.setLayout(new GridLayout(2, 1));
        panButtons = new JPanel();
        bOk = new JButton("Ok");
        bOk.addActionListener(this);
        panButtons.add(bOk);
        bAnnuler = new JButton("Supprimer");
        bAnnuler.addActionListener(new Supprimer());
        panButtons.add(bAnnuler);
        bFermer = new JButton("Fermer");
        bFermer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panButtons.add(bFermer);
        // Buttons panel
        panForm = new JPanel();
        String[] items = { "Disponible", "Non Disponible" };
        panForm.setLayout(new GridLayout(5, 2));
        panForm.add(new JLabel("ID"));
        id = new JTextField();
        panForm.add(id);
        panForm.add(new JLabel("Libelle"));
        libelle = new JTextField();
        panForm.add(libelle);
        panForm.add(new JLabel("Prix"));
        prix = new JTextField();
        panForm.add(prix);
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

    class Supprimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int x = t.getSelectedRow();
            int ids = Integer.parseInt(String.valueOf(model.getValueAt(x, 0)));
            trait.deleteProduit(ids);
            refreshJTable();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        trait.save(new Produit(Integer.parseInt(id.getText()), libelle.getText(), Float.parseFloat(prix.getText())));
        refreshJTable();
    }
    private void refreshJTable(){
        model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);
            List<Produit> lp = trait.getAllProduits();
            for (Produit p : lp) {
                model.addRow(new String[] { String.valueOf(p.getId()), p.getLibelle(), String.valueOf(p.getPrix()) });
            }
            t.setModel(model);
    }
}
