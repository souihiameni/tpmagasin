import java.util.ArrayList;
public class magasin {
    private int id;
    private String nom;
    private String adresse;
    private ArrayList<employer> employes;
    public magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.employes = new ArrayList<>();
    }
    public void ajouterEmploye(employer employe) {
        if (employes.size() < 20) {
            employes.add(employe);
            System.out.println("Employé ajouté avec succès.");
        } else {
            System.out.println("Impossible d'ajouter. Limite de 20 employés atteinte.");
        }
    }
    public void afficherDetails() {
        System.out.println("Magasin ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse);
        System.out.println("Employés:");
        for (employer employe : employes) {
            employe.afficherInfos();
            System.out.println("Salaire: " + employe.calculerSalaire() + " DT");
        }
    }
}