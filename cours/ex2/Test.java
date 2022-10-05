public class Test {
    public static void main(String[] args) {
        Delegation d1 = new Delegation("del1", 250, 300);
        Delegation d2 = new Delegation("del2", 350, 400);
        Delegation d3 = new Delegation("del3", 200, 200);
        Delegation d4 = new Delegation("del4", 80, 90);
        Delegation d5 = new Delegation("del5", 50, 100);
        Delegation d6 = new Delegation("del6", 150, 200);
        Ville v1 = new Ville("Sfax", 1000);
        Ville v2 = new Ville("Sousse 2", 800);
        Pays T = new Pays("Tunisia");
        v1.ajouterDelegation(d1);
        v1.ajouterDelegation(d2);
        v1.ajouterDelegation(d3);
        v2.ajouterDelegation(d4);
        v2.ajouterDelegation(d5);
        v2.ajouterDelegation(d6);
        T.ajouterVille(v1);
        T.ajouterVille(v2);
        System.out.println("Ville 1 \n" + v1);
        System.out.println("Ville 2 \n" + v2);
        System.out.println("Pays \n" + T);
        System.out.println("Ville ayant le plus habitant \n" + T.rechercheMax());
        System.out.println("\nAprés modification\n");
        v1.deleteDelegation("del2");
        v2.ajouterDelegation(d2);
        System.out.println("Ville 1 \n" + v1);
        System.out.println("Ville 2 \n" + v2);
        System.out.println("Ville ayant le plus habitant \n" + T.rechercheMax());

    }
}
