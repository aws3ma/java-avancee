import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu extends JFrame implements ActionListener{
    JMenu menu;
    JMenuItem e1, e2, e3, e4, e5, e6;

    Menu()
    {
        // Créer le frame
        // Créer la barre de menu
        JMenuBar menubar = new JMenuBar();
        this.setLocationRelativeTo(null);
        // Créer le menu
        menu = new JMenu("Saisie");
        // Créer le sous menu
        // Créer les éléments du menu et sous menu
        e1 = new JMenuItem("CV");
        e2 = new JMenuItem("Lettre");
        e3 = new JMenuItem("Devis");
        // Ajouter les éléments au menu
        menu.add(e1);
       e1.addActionListener(this);
        menu.add(e2);
        menu.add(e3);
        // Ajouter les éléments au sous menu
        // Ajouter le sous menu au menu principale
        // Ajouter le menu au barre de menu
        menubar.add(menu);
        // Ajouter la barre de menu au frame
        setJMenuBar(menubar);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new Fenetre();
        
    }
}
