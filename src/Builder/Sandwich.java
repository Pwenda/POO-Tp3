package Builder;

public class Sandwich {
    private final String pain;

    private final String viande;
    private final String fromage;
    private final String legumes;
    private final String sauce;
    private final boolean grille;

    private Sandwich(SandwichBuilder builder) {
        this.pain = builder.pain;
        this.viande = builder.viande;
        this.fromage = builder.fromage;
        this.legumes = builder.legumes;
        this.sauce = builder.sauce;
        this.grille = builder.grille;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Builder.Sandwich avec pain ").append(pain);
        if (viande != null) sb.append(", viande: ").append(viande);
        if (fromage != null) sb.append(", fromage: ").append(fromage);
        if (legumes != null) sb.append(", légumes: ").append(legumes);
        if (sauce != null) sb.append(", sauce: ").append(sauce);
        if (grille) sb.append(" [GRILLÉ]");
        return sb.toString();
    }

    public static class SandwichBuilder {
        private final String pain;

        private String viande;
        private String fromage;
        private String legumes;
        private String sauce;
        private boolean grille;

        public SandwichBuilder(String pain) {
            if (pain == null || pain.isEmpty()) {
                throw new IllegalArgumentException("Le pain est obligatoire");
            }
            this.pain = pain;
        }

        public SandwichBuilder viande(String viande) {
            this.viande = viande;
            return this;
        }

        public SandwichBuilder fromage(String fromage) {
            this.fromage = fromage;
            return this;
        }

        public SandwichBuilder legumes(String legumes) {
            this.legumes = legumes;
            return this;
        }

        public SandwichBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public SandwichBuilder grille(boolean grille) {
            this.grille = grille;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}