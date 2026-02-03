package Strategy;
public class Main {
    public static void main(String[] args) {
        Commande commande1 = new Commande(25.50, 1, new LivraisonStandard());
        commande1.afficherResume();
        Commande commande2 = new Commande(42.00, 5, new LivraisonExpress());
        commande2.afficherResume();
        Commande commande3 = new Commande(18.90, 15, new ClickAndCollect());
        commande3.afficherResume();
    }
}
