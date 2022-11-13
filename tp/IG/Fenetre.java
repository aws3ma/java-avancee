import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
public class Fenetre extends JFrame {
    public Fenetre(){
        this.setTitle("1er fenetre en swing");
        this.setSize(400,130);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        JLabel lnom = new JLabel("Nom");
        JLabel lpassword = new JLabel("Password");

        JTextField tf = new JTextField(20);
        JPasswordField pf = new JPasswordField(20);

        JButton bok = new JButton("Ok");
        JButton bannuler = new JButton("Annuler");
        JButton bfermer = new JButton("Fermer");
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2,2));
        JPanel p2 = new JPanel();
        p1.add(lnom);
        p1.add(tf);
        p1.add(lpassword);
        p1.add(pf);
        p2.add(bok);
        p2.add(bannuler);
        p2.add(bfermer);
        pan.setLayout(new GridLayout(2,1));
        pan.add(p1);
        pan.add(p2);
        pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.setContentPane(pan);



        this.setVisible(true);

    }
}
