import java.util.ArrayList;

public class Portefeuille {
    private ArrayList<Action> actions;
    private ArrayList<Obligation> obligations;

    public Portefeuille() {
        this.actions = new ArrayList<Action>();
        this.obligations = new ArrayList<Obligation>();
    }

    public void ajouterAction(Action action) {
        this.actions.add(action);
    }

    public void supprimerAction(Action action) {
        this.actions.remove(action);
    }

    public ArrayList<Action> getActions() {
        return this.actions;
    }

    public void ajouterObligation(Obligation obligation) {
        this.obligations.add(obligation);
    }

    public void supprimerObligation(Obligation obligation) {
        this.obligations.remove(obligation);
    }

    public ArrayList<Obligation> getObligations() {
        return this.obligations;
    }

    public double calculerValeurPortefeuille() {
        double valeur = 0;
        for (Action action : this.actions) {
            valeur += action.getPrice();
        }
        for (Obligation obligation : this.obligations) {
            valeur += obligation.calculerPrixActuel();
        }
        return valeur;
    }
}
