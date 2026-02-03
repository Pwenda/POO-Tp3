package Observer;
public class Promotion {
    private String nom;
    private String description;
    private double reduction;

    public Promotion(String nom, String description, double reduction) {
        this.nom = nom;
        this.description = description;
        this.reduction = reduction;
    }
    public String getNom() {
        return nom;
    }
    public String getDescription() {
        return description;
    }
    public double getReduction() {
        return reduction;
    }
    @Override
    public String toString() {
        return "Promotion{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", reduction=" + reduction + "%" +
                '}';
    }
}
