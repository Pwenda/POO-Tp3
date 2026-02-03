package Factory;

public class BurgerFactory {
    public static Burger creerBurger(BurgerType type) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de burger ne peut pas être null");
        }

        return switch (type) {
            case VEGGIE -> new BurgerVeggie();
            case CHEESE -> new CheeseBurger();
            case CHICKEN -> new ChickenBurger();
        };
    }
}
