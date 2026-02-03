package Observer;

public class ClientVIP {
    private String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }
    public void recevoirNotification(Promotion promotion) {
        System.out.println("Client VIP " + nom + " a reçu une notification : " + promotion);
    }
    public String getNom() {
        return nom;
    }
}
