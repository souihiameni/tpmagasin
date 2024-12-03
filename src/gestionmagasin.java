import java.util.ArrayList;
import java.util.List;
public class gestionmagasin {
    private List<Magasin> magasin;
    // Constructeur
    public gestionmagasin() {
        this.magasin = new ArrayList<>();
    }
    // Ajouter un magasin
    public void ajouterMagasin(magasin mg) {
        magasin.add(mg);
    }
}
