import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Etudiant e = new Etudiant("Oussema", "Trabelsi", "11128318");
        List<Float> notes = new ArrayList<>();
        notes.add(10f);
        notes.add(12.5f);
        notes.add(15.5f);
        notes.add(11.5f);
        notes.add(13.5f);
        e.setNotesList(e);
    }
}
