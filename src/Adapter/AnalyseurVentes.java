package Adapter;

import java.util.List;

public interface AnalyseurVentes {
    List<String> obtenirDonneesVentes();
    double calculerTotal();
    int compterTransactions();
}
