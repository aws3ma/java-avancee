import java.awt.Frame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ex{
    public Ex(){
        Frame f= new Frame();
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we) {

                System.exit(0);
            }
        } );
        f.setTitle("Exemple du cour");
        f.setSize(180, 200);
        f.setLayout(new GridLayout(3,1));

        Panel p = new Panel();
        p.add("b1", new Button("B1"));
        p.add("b2", new Button("B2"));
        p.add("b3", new Button("B3"));
        p.add("b4", new Button("B4"));
        f.add(p);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(2,2));
        p2.add("GR1", new Button("GR1"));
        p2.add("GR2", new Button("GR2"));
        p2.add("GR3", new Button("GR3"));
        p2.add("GR4", new Button("GR4"));
        f.add(p2);

        Panel p3 = new Panel();
        p3.add(new Choice());
        p3.add(new TextField("Un text"));
        f.add(p3);
        
        f.setVisible(true);
    }
}
