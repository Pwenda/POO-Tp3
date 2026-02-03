package Observer;
public class Main {
    public static void main(String[] args) {
        BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

        ClientVIP client1 = new ClientVIP("Guillaume");
        ClientVIP client2 = new ClientVIP("Jean");
        ClientVIP client3 = new ClientVIP("Emma");
        restaurant.ajouterClientVIP(client1);
        restaurant.ajouterClientVIP(client2);
        restaurant.ajouterClientVIP(client3);
        Promotion promo1 = new Promotion("Burger", "Menu Burger + Frites + Boisson", 30);
        restaurant.creerPromotionFlash(promo1);
        System.out.println("\n-Un client se désabonne-");
        restaurant.retirerClientVIP(client2);
        Promotion promo2 = new Promotion("Menu Famille", "2 Burgers + 2 Frites + 2 Boissons", 25);
        restaurant.creerPromotionFlash(promo2);
    }
}
