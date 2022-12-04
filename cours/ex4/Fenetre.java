import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener{
    private JButton valider;
    private About ab;
    private Stages st;
    private Projets pr;
    private Competances comp;
    public Fenetre() {
        this.setTitle("Ex4");
        this.setSize(1050, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Font labelFont = new Font("arial", Font.PLAIN, 18);


        JPanel main = new JPanel();
        main.setLayout(null);

        JTabbedPane tabs = new JTabbedPane();

        JPanel about = new JPanel();
        about.setLayout(null);
        ab = new About();
        // ab.setBounds(0, 0, 1050, 600);
        about.add(ab);
        tabs.add("About", about);

        JPanel stages = new JPanel();
        stages.setLayout(null);
        st = new Stages();
        stages.add(st);
        tabs.add("Stages", stages);

        JPanel projets = new JPanel();
        projets.setLayout(null);
        pr = new Projets();
        projets.add(pr);
        tabs.add("Projets", projets);

        JPanel competances = new JPanel();
        competances.setLayout(null);
        comp = new Competances();
        competances.add(comp);
        tabs.add("Competances", competances);
        tabs.setBounds(0,0,1050,600);
        main.add(tabs);

        valider = new JButton("Envoyer");
        valider.setBounds(500, 610, 150, 30);
        valider.setFont(labelFont);
        valider.setBackground(Color.GREEN);
        valider.setForeground(Color.BLACK);
        valider.addActionListener(this);
        main.add(valider);
        this.setContentPane(main);
        this.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new CV(ab.getP(),st.getStagesList(),pr.getProjetList(),comp.getCompList());
        
    }

}
