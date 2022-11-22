import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
public class Fenetre extends JFrame {
    private JPanel pan,p1,p2;
    private JLabel lnom,lpassword;
    private JTextField tf;
    private JPasswordField pf;
    private JButton bok,bannuler,bfermer;
    public Fenetre(){
        this.setTitle("1er fenetre en swing");
        this.setSize(400,130);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan = new JPanel();
        lnom = new JLabel("Nom");
        lpassword = new JLabel("Password");

        tf = new JTextField(20);
         pf = new JPasswordField(20);

         bok = new JButton("Ok");
         bannuler = new JButton("Annuler");
         bfermer = new JButton("Fermer");
         p1 = new JPanel();
        p1.setLayout(new GridLayout(2,2));
         p2 = new JPanel();
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
