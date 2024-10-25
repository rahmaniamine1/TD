public class Voiture extends Vehicule {
    // Constructeur paramétré
    public Voiture(String id, String marque, String modele, String carburant, String couleur) {
        super(id, marque, modele, carburant, couleur);
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Voiture{" + super.toString() + '}';
    }
}
