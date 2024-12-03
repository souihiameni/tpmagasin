public class caissier extends employer {
    private int numeroDeCaisse;
    public caissier(int identifiant, String nom, String adresse, int nbrHeuresParMois, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeuresParMois);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    @Override
    public double calculerSalaire() {
        double salaire = getNbrHeuresParMois() * 5.0;
        if (getNbrHeuresParMois() > 180) {
            salaire += (getNbrHeuresParMois() - 180) * 5.0 * 0.15;
        }
        return salaire;
    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Numéro de caisse: " + numeroDeCaisse);
    }
}
