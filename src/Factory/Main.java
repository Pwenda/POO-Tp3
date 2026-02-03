package Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast - Commandes ===\n");

        Burger burger1 = BurgerFactory.creerBurger(BurgerType.VEGGIE);
        burger1.prepare();
        burger1.afficherDetails();
        System.out.println();

        Burger burger2 = BurgerFactory.creerBurger(BurgerType.CHEESE);
        burger2.prepare();
        burger2.afficherDetails();
        System.out.println();

        Burger burger3 = BurgerFactory.creerBurger(BurgerType.CHICKEN);
        burger3.prepare();
        burger3.afficherDetails();
        System.out.println();

        double total = burger1.getPrix() + burger2.getPrix() + burger3.getPrix();
        System.out.println("Total de la commande : " + total + "€");
    }
}
