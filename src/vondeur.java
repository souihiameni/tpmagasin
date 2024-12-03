public class vondeur extends employer {
    private double tauxDeVente;
    public vondeur(int identifiant, String nom, String adresse, int nbrHeuresParMois, double tauxDeVente) {
        super(identifiant, nom, adresse, nbrHeuresParMois);
        this.tauxDeVente = tauxDeVente;
    }
    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Taux de vente: " + tauxDeVente + "%");
    }
}