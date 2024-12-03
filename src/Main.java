public class Main {
    public static void main(String[] args) {
        magasin magasin1 = new magasin(1, "Carrefour", "Centre-Ville");
        magasin magasin2 = new magasin(2, "Monoprix", "Menzah 6");
        magasin1.ajouterEmploye(new caissier(101, "Ali", "Tunis", 170, 1));
        magasin1.ajouterEmploye(new vondeur(102, "Sara", "Ariana", 160, 15.0));
        magasin1.ajouterEmploye(new responsable(103, "Khaled", "Marsa", 180, 300.0));
        magasin2.ajouterEmploye(new caissier(201, "Omar", "Menzah", 190, 2));
        magasin2.ajouterEmploye(new vondeur(202, "Maya", "Lac", 160, 10.0));
        magasin2.ajouterEmploye(new responsable(203, "Sami", "Ghammarth", 170, 350.0));
        magasin1.afficherDetails();
        magasin2.afficherDetails();
    }
}