package Factory;

public class BurgerVeggie implements Burger {
    private final String pain = "pain complet";
    private final String ingredients = "salade, tomate, carotte";
    private final double prix = 8.0;

    @Override
    public void prepare() {
        System.out.println("Préparation du Burger Veggie...");
    }

    @Override
    public void afficherDetails() {
        System.out.println("Burger Veggie");
        System.out.println("Pain : " + pain);
        System.out.println("Ingrédients : " + ingredients);
        System.out.println("Prix : " + prix + "€");
    }

    @Override
    public double getPrix() {
        return prix;
    }
}
