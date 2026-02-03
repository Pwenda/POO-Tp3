package Builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sandwicherie - Commandes ===\n");

        Sandwich sandwich1 = new Sandwich.SandwichBuilder("baguette")
                .viande("jambon")
                .build();
        System.out.println("Commande 1 : " + sandwich1);

        Sandwich sandwich2 = new Sandwich.SandwichBuilder("complet")
                .fromage("emmental")
                .legumes("laitue, tomate, oignon")
                .sauce("moutarde")
                .grille(true)
                .build();
        System.out.println("Commande 2 : " + sandwich2);

        Sandwich sandwich3 = new Sandwich.SandwichBuilder("ciabatta")
                .viande("poulet")
                .fromage("cheddar")
                .legumes("laitue, tomate, cornichon")
                .sauce("mayo")
                .grille(true)
                .build();
        System.out.println("Commande 3 : " + sandwich3);
    }
}
