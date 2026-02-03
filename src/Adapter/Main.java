package Adapter;

public class Main {
    public static void main(String[] args) {
        String cheminFichier = "src/Adapter/ventes.csv";
        LecteurCSV lecteurCSV = new LecteurCSV(cheminFichier);
        AnalyseurVentes analyseur = new CSVAdapter(lecteurCSV);
        BurgerAnalytics analytics = new BurgerAnalytics(analyseur);
        analytics.genererRapport();
    }
}
