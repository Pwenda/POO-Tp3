package Factory;

public class ChickenBurger implements Burger {
    private final String pain = "pain burger";
    private final String ingredients = "poulet pané, sauce BBQ";
    private final double prix = 9.0;

    @Override
    public void prepare() {
        System.out.println("Préparation du Chicken Burger...");
    }

    @Override
    public void afficherDetails() {
        System.out.println("Chicken Burger");
        System.out.println("Pain : " + pain);
        System.out.println("Ingrédients : " + ingredients);
        System.out.println("Prix : " + prix + "€");
    }

    @Override
    public double getPrix() {
        return prix;
    }
}
