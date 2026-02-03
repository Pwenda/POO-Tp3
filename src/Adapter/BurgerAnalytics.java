package Adapter;

public class BurgerAnalytics {
    private AnalyseurVentes analyseur;

    public BurgerAnalytics(AnalyseurVentes analyseur) {
        this.analyseur = analyseur;
    }

    public void genererRapport() {
        System.out.println("=== Rapport BurgerFast Analytics ===");
        System.out.println("Nombre de transactions : " + analyseur.compterTransactions());
        System.out.println("Total des ventes : " + analyseur.calculerTotal() + " €");
        System.out.println("\nDétail des ventes :");
        for (String ligne : analyseur.obtenirDonneesVentes()) {
            System.out.println(ligne);
        }
    }
}
