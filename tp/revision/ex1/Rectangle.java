package ex1;

public class Rectangle extends Forme{
    private int longeur;
    private int largeur;
    public Rectangle(int longeur, int larg) throws MathException{
        if(longeur<=0){
            throw new MathException("longeur<=0");
        }
        if(larg<=0){
            throw new MathException("largeur<=0");
        }
        this.longeur=longeur;
        largeur=larg;
    }
    @Override
    public float perimetre() {
        
        return (longeur+largeur)*2;
    }

    @Override
    public float surface() {
        return longeur*largeur;
    }
    
}
