import java.util.ArrayList;
import java.util.List;

public class Station {
    private String nom; // Nom de la station
    private String emplacement; // Emplacement de la station
    private List<Vehicule> vehiculesEnTraitement; // Liste des véhicules en traitement

    // Constructeur par défaut
    public Station() {
        this.nom = "Station de Lavage";
        this.emplacement = "Emplacement par défaut";
        this.vehiculesEnTraitement = new ArrayList<>();
    }

    // Constructeur paramétré
    public Station(String nom, String emplacement) {
        this.nom = nom;
        this.emplacement = emplacement;
        this.vehiculesEnTraitement = new ArrayList<>();
    }

    // Méthode pour ajouter un véhicule
    public void ajouterVehicule(Vehicule vehicule) throws AjoutVoitureException {
        // Vérifie si le véhicule est déjà en traitement
        for (Vehicule v : vehiculesEnTraitement) {
            if (v.getId().equals(vehicule.getId())) {
                throw new AjoutVoitureException("Le véhicule avec l'ID " + vehicule.getId() + " est déjà en cours de traitement.");
            }
        }
        vehiculesEnTraitement.add(vehicule); // Ajoute le véhicule à la liste
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Station{")
                .append("nom='").append(nom).append('\'')
                .append(", emplacement='").append(emplacement).append('\'')
                .append(", vehiculesEnTraitement=").append(vehiculesEnTraitement)
                .append('}');
        return sb.toString();
    }

    // Méthode pour compter les voitures à essence
    public int NbrVoitureEssence() {
        int count = 0;
        for (Vehicule v : vehiculesEnTraitement) {
            if (v.getCarburant().equalsIgnoreCase("essence")) {
                count++;
            }
        }
        return count;
    }

    // Méthode pour compter les voitures noires
    public int NbrVoitureNoire() {
        int count = 0;
        for (Vehicule v : vehiculesEnTraitement) {
            if (v.getCouleur().equalsIgnoreCase("noire")) {
                count++;
            }
        }
        return count;
    }
}
