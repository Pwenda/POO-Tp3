package Strategy;
public class LivraisonStandard implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return distance * 1.5;
    }
    @Override
    public String getNom() {
        return "Livraison Standard";
    }
}
