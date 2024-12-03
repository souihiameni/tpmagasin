public class employer {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int nbrHeuresParMois;
    public employer(int identifiant, String nom, String adresse, int nbrHeuresParMois) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeuresParMois = nbrHeuresParMois;
    }
    public double calculerSalaire() {
        return 0.0;
    }
    public void afficherInfos() {
        System.out.println("ID: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Heures par mois: " + nbrHeuresParMois);
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public int getNbrHeuresParMois() {
        return nbrHeuresParMois;
    }
    public void setNbrHeuresParMois(int nbrHeuresParMois) {
        this.nbrHeuresParMois = nbrHeuresParMois;
    }
}