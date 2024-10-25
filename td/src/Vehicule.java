public class Vehicule {
    private String id;
    private String marque;
    private String modele;
    private String carburant; // "essence", "diesel", etc.
    private String couleur; // "noire", "rouge", etc.

    public Vehicule(String id, String marque, String modele, String carburant, String couleur) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.carburant = carburant;
        this.couleur = couleur;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getCarburant() {
        return carburant;
    }

    public String getCouleur() {
        return couleur;
    }

    // toString
    @Override
    public String toString() {
        return "Vehicule{" +
                "id='" + id + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", carburant='" + carburant + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
