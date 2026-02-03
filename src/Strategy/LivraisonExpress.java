package Strategy;
public class LivraisonExpress implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return 5.0 + (distance * 2.5);
    }
    @Override
    public String getNom() {
        return "Livraison Express";
    }
}
