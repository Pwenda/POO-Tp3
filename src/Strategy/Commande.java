package Strategy;
public class Commande {
    private double prixPlats;
    private double distance;
    private StrategieLivraison strategieLivraison;

    public Commande(double prixPlats, double distance, StrategieLivraison strategieLivraison) {
        this.prixPlats = prixPlats;
        this.distance = distance;
        this.strategieLivraison = strategieLivraison;
    }
    public double calculerFraisLivraison() {
        return strategieLivraison.calculerFrais(distance);
    }
    public double calculerTotal() {
        return prixPlats + calculerFraisLivraison();
    }
    public void afficherResume() {
        System.out.println("Mode de livraison : " + strategieLivraison.getNom());
        System.out.println("Prix : " + String.format("%.2f", prixPlats) + "€");
        System.out.println("Distance : " + distance + " km");
        System.out.println("Frais de livraison : " + String.format("%.2f", calculerFraisLivraison()) + "€");
        System.out.println("Total : " + String.format("%.2f", calculerTotal()) + "€");
        System.out.println("-------------------");
    }
}
