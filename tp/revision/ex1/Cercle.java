package ex1;

public class Cercle extends Forme {
    private float rayon;
    public Cercle(float rayon) throws MathException{
        if(rayon<0){
            throw new MathException("rayon <0");
        }
        this.rayon=rayon;
    }
    @Override
    public float perimetre() {
        return (2*3.14f*rayon);
    }

    @Override
    public float surface() {
        return rayon*rayon*3.14f;
    }
    
}
