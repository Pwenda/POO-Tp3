package Factory;

public class CheeseBurger implements Burger {
    private final String pain = "pain sésame";
    private final String ingredients = "steak haché, cheddar";
    private final double prix = 10.0;

    @Override
    public void prepare() {
        System.out.println("Préparation du Cheeseburger...");
    }

    @Override
    public void afficherDetails() {
        System.out.println("Cheeseburger");
        System.out.println("Pain : " + pain);
        System.out.println("Ingrédients : " + ingredients);
        System.out.println("Prix : " + prix + "€");
    }

    @Override
    public double getPrix() {
        return prix;
    }
}
