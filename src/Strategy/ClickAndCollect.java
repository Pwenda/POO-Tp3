package Strategy;
public class ClickAndCollect implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return 0.0;
    }
    @Override
    public String getNom() {
        return "Click & Collect";
    }
}
