import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
public class Fenetre extends JFrame implements ActionListener {
    private JButton cree, ajouter, annuler;
    private JTextField numCmd, idProduit, libelleProduit, prixProduit;
    private Commandes cmds;

    public Fenetre() {
        setTitle("Gestion des Produits");
        setSize(530, 150);
        setLayout(new BorderLayout(10,0));

        cmds = new Commandes();

        JPanel labels = new JPanel(new GridLayout(4, 1));
        JPanel inputs = new JPanel(new GridLayout(4, 1));
        inputs.setPreferredSize(new Dimension(200,150));
        JPanel buttons = new JPanel(new GridLayout(3, 1));

        cree = new JButton("Creer Commande");
        ajouter = new JButton("Ajouter Produit");
        annuler = new JButton("Annuler");
        cree.addActionListener(this);
        ajouter.addActionListener(this);
        annuler.addActionListener(this);
        numCmd = new JTextField();
        idProduit = new JTextField();
        libelleProduit = new JTextField();
        prixProduit = new JTextField();

        labels.add(new JLabel("numero commande                  "));
        labels.add(new JLabel("Id produit"));
        labels.add(new JLabel("Libelle produit"));
        labels.add(new JLabel("Prix produit"));

        inputs.add(numCmd);
        inputs.add(idProduit);
        inputs.add(libelleProduit);
        inputs.add(prixProduit);

        buttons.add(cree);
        buttons.add(ajouter);
        buttons.add(annuler);
        add(labels, BorderLayout.WEST);
        add(inputs, BorderLayout.CENTER);
        add(buttons, BorderLayout.EAST);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == annuler) {
            numCmd.setText("");
            idProduit.setText("");
            libelleProduit.setText("");
            prixProduit.setText("");
        }
        if (e.getSource() == cree) {
            cmds.ajouterLigne();
            numCmd.setText(String.valueOf(cmds.getN()));
        }
        if (e.getSource() == ajouter) {
            if (numCmd.getText() != "") {
                String numCommand = "Commande n" + numCmd.getText();
                cmds.ajouter(numCommand, new Produit(Integer.parseInt(idProduit.getText()), libelleProduit.getText(),
                        Double.parseDouble(prixProduit.getText())));
                cmds.afficher();
            }
        }
    }
}
