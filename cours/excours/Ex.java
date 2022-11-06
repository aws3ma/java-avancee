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
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(2,2));
        for (int i = 1; i < 5; i++) {
            p.add("b"+i, new Button("B"+i));
            p2.add("GR"+i, new Button("GR"+i));
        }
        f.add(p);
        f.add(p2);

        Panel p3 = new Panel();
        p3.add(new Choice());
        p3.add(new TextField("Un text"));
        f.add(p3);
        
        f.setVisible(true);
    }
}
