public class Obligation {
    private String nom;
    private double taux;
    private double prix;
    private int duree;

    public Obligation(String nom, double taux, double prix, int duree) {
        this.nom = nom;
        this.taux = taux;
        this.prix = prix;
        this.duree = duree;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTaux() {
        return this.taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double calculerPrixActuel() {
        double prixActuel = this.prix / Math.pow(1 + this.taux, this.duree);
        return prixActuel;
    }
}
