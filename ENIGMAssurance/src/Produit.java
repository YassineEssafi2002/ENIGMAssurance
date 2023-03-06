public abstract class Produit {
    private double valeurNominal;
    private double tauxRendement;

    public Produit(double valeurNominal, double tauxRendement) {
        this.valeurNominal = valeurNominal;
        this.tauxRendement = tauxRendement;
    }

    public double getValeurNominal() {
        return valeurNominal;
    }

    public double getTauxRendement() {
        return tauxRendement;
    }

    public abstract double getValeurActuelle();

    public String toString() {
        return "Produit [valeurNominal=" + valeurNominal + ", tauxRendement=" + tauxRendement + "]";
    } }