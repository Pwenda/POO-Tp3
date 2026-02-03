package Singleton;
public class TPE {
    private static TPE instance;
    private double chiffreAffaires;
    private int numeroJournee;

    private TPE() {
        this.chiffreAffaires = 0.0;
        this.numeroJournee = 1;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public synchronized void enregistrerTransaction(double montant, String nomCaissier) {
        chiffreAffaires += montant;
        System.out.println(nomCaissier + " a enregistré une transaction de " + montant + "€");
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void afficherBilan() {
        System.out.println("\n=== Bilan journée " + numeroJournee + " ===");
        System.out.println("Chiffre d'affaires total : " + chiffreAffaires + "€");
    }

    public void nouvelleJournee() {
        System.out.println("\n>>> Passage à la journée suivante <<<");
        chiffreAffaires = 0.0;
        numeroJournee++;
    }
}
