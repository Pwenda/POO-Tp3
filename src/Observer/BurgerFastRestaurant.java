package Observer;
import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {
    private List<ClientVIP> clientsVIP;

    public BurgerFastRestaurant() {
        this.clientsVIP = new ArrayList<>();
    }
    public void ajouterClientVIP(ClientVIP client) {
        clientsVIP.add(client);
        System.out.println("Client VIP " + client.getNom() + " ajouté au système de notifications.");
    }
    public void retirerClientVIP(ClientVIP client) {
        clientsVIP.remove(client);
        System.out.println("Client VIP " + client.getNom() + " retiré du système de notifications.");
    }
    public void creerPromotionFlash(Promotion promotion) {
        System.out.println("\nNouvelle promotion créée");
        notifierClientsVIP(promotion);
    }
    private void notifierClientsVIP(Promotion promotion) {
        for (ClientVIP client : clientsVIP) {
            client.recevoirNotification(promotion);
        }
    }
}
