package Singleton;
public class Main {
    public static void main(String[] args) {
        TPE tpe1 = TPE.getInstance();
        TPE tpe2 = TPE.getInstance();
        TPE tpe3 = TPE.getInstance();

        System.out.println("Vérification singleton : " + (tpe1 == tpe2 && tpe2 == tpe3));

        tpe1.enregistrerTransaction(15.50, "Caissier Guillaume");
        tpe2.enregistrerTransaction(22.00, "Caissier Jean");
        tpe3.enregistrerTransaction(18.75, "Caissier Phanette");
        tpe1.enregistrerTransaction(12.30, "Caissier Gabriel");
        tpe2.enregistrerTransaction(25.00, "Caissier Emma");

        tpe1.afficherBilan();

        tpe1.nouvelleJournee();

        tpe1.enregistrerTransaction(20.00, "Caissier Guillaume");
        tpe2.enregistrerTransaction(17.50, "Caissier Phanette");

        tpe1.afficherBilan();
    }
}
