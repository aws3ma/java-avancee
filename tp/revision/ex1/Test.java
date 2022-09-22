package ex1;

public class Test {
    public static void main(String[] args) {
        try {
            Forme cercle = new Cercle(1);
            Forme rectangle = new Rectangle(2, 1);
            cercle.contenantCarre(1);
            rectangle.contenantCarre(20);
        } 
        catch(MathException me){
            System.out.println(me.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
