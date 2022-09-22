package ex2;

public class Test {
    public static void main(String[] args) {
        Homme c = new Client("Oussema", "Trabelsi", 1);
        Homme p = new Personne("Ahmed", "Krichen");
        Peuple peup = new Peuple();
        peup.naissance(c);
        peup.naissance(p);
        peup.explorer();
    
    }
    
}
