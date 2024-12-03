import java.util.Date;
public class produit {
    // Attributs
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;
    // Constructeurs
    public produit() {
        // Constructeur sans paramètres
    }
    public produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        setPrix(prix);  // Utilisation de setPrix pour valider le prix
    }
    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        if (prix < 0) {
            System.out.println("Le prix ne peut pas être négatif. Le prix est fixé à 0 par défaut.");
            this.prix = 0;
        } else {
            this.prix = prix;
        }
    }
    public Date getDateExpiration() {
        return dateExpiration;
    }
    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    // Méthodes
    public void afficher() {
        System.out.println("Produit [ID: " + identifiant + ", Libellé: " + libelle +
                ", Marque: " + marque + ", Prix: " + prix +
                ", Date d'expiration: " + (dateExpiration != null ? dateExpiration : "Non définie") + "]");
    }
    @Override
    public String toString() {
        return "Produit [ID: " + identifiant + ", Libellé: " + libelle +
                ", Marque: " + marque + ", Prix: " + prix +
                ", Date d'expiration: " + (dateExpiration != null ? dateExpiration : "Non définie") + "]";
    }
    // Méthode comparer (avec un seul paramètre)
    public boolean comparer(produit autreProduit) {
        if (autreProduit == null) {
            return false;
        }
        return this.identifiant == autreProduit.identifiant &&
                this.libelle.equals(autreProduit.libelle) &&
                this.prix == autreProduit.prix;
    }
    // Méthode comparer (avec deux paramètres)
    public static boolean comparer(produit produit1, produit produit2) {
        if (produit1 == null || produit2 == null) {
            return false;
        }
        return produit1.identifiant == produit2.identifiant &&
                produit1.libelle.equals(produit2.libelle) &&
                produit1.prix == produit2.prix;
    }
}