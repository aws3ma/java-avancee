package ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        float min = 0f;
        float max = 20f;
        Section s = new Section(1);
        for (int i = 0; i < 10; i++) {
            Etudiant e = new Etudiant("Oussema", "Trabelsi", "11128318");
            List<Float> notes = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                notes.add(min + r.nextFloat() * (max - min));
                // System.out.println(notes);
            }
            e.setNotesList(notes);
            s.ajoutEtudiant(e);
        }
        System.out.println(s);
        // Etudiant oussema = new Etudiant("Oussema", "Trabelsi", "11128318");
        // s.ajoutEtudiant(oussema);
        // List<Float> notes = new ArrayList<>();
        // notes.add(10f);
        // notes.add(12.5f);
        // notes.add(15.5f);
        // notes.add(11.5f);
        // notes.add(13.5f);
        // oussema.setNotesList(notes);
        // System.out.println(oussema);
    }
}
