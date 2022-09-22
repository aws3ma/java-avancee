package ex1;

public abstract class Forme{
    public abstract float perimetre();
    public abstract float surface();
    public void contenantCarre(float surf){
        if(this.surface()>=surf){

            System.out.println("Cette forme peut contenir un carré de surface "+surf);
        }else{
            System.out.println("Cette forme ne peut contenir un carré de surface "+surf);

        }
    }
}