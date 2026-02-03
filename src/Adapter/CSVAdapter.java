package Adapter;

import java.util.List;

public class CSVAdapter implements AnalyseurVentes {
    private LecteurCSV lecteurCSV;

    public CSVAdapter(LecteurCSV lecteurCSV) {
        this.lecteurCSV = lecteurCSV;
    }

    @Override
    public List<String> obtenirDonneesVentes() {
        return lecteurCSV.lireLignes();
    }

    @Override
    public double calculerTotal() {
        List<String> lignes = lecteurCSV.lireLignes();
        double total = 0.0;

        for (int i = 1; i < lignes.size(); i++) {
            String[] colonnes = lignes.get(i).split(",");
            if (colonnes.length >= 3) {
                try {
                    double montant = Double.parseDouble(colonnes[2].trim());
                    total += montant;
                } catch (NumberFormatException e) {
                }
            }
        }

        return total;
    }

    @Override
    public int compterTransactions() {
        List<String> lignes = lecteurCSV.lireLignes();
        return lignes.size() > 0 ? lignes.size() - 1 : 0;
    }
}
