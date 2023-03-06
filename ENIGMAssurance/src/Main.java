public class Main {
    public static void main(String[] args) {
        // Création d'une action
        Action action1 = new Action("Samsung", "Technologies", 50);
        Action action2 = new Action("Mercedes", "Automobile", 200);
        Action action3 = new Action("Coca Cola", "Alimentation", 4);
        Action action4 = new Action("Tesla", "Technologies", 433);


        // Création d'une obligation
        Obligation obligation1 = new Obligation("FR Treasury", 1.5, 1000, 10);

        // Création d'un portefeuille et ajout des actifs
        Portefeuille portefeuille = new Portefeuille();
        portefeuille.ajouterAction(action1);
        portefeuille.ajouterAction(action2);
        portefeuille.ajouterAction(action3);
        portefeuille.ajouterAction(action4);
        portefeuille.ajouterObligation(obligation1);

        // Affichage des actifs dans le portefeuille
        System.out.println("Liste des actifs dans le portefeuille : ");
        for (Action action : portefeuille.getActions()) {
            System.out.println(action.getName() + " - " + action.getDescription() + " - Prix : " + action.getPrice() + " $");
        }
        for (Obligation obligation : portefeuille.getObligations()) {
            System.out.println(obligation.getNom() + " - " + obligation.getDuree() + " ans - Prix actuel : " + obligation.calculerPrixActuel() + " $");
        }

        // Calcul de la valeur totale du portefeuille
        double valeurPortefeuille = portefeuille.calculerValeurPortefeuille();
        System.out.println("Valeur totale du portefeuille : " + valeurPortefeuille + " $");
    }


}