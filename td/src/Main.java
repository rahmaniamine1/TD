public class Main {
    public static void main(String[] args) {
        Station station = new Station("Station 1", "Centre Ville");

        try {
            Voiture voiture1 = new Voiture("V001", "Toyota", "Corolla", "essence", "noire");
            Voiture voiture2 = new Voiture("V002", "Honda", "Civic", "diesel", "rouge");

            station.ajouterVehicule(voiture1);
            station.ajouterVehicule(voiture2);
            // Tentative d'ajout du même véhicule
            station.ajouterVehicule(voiture1); // Ceci lancera une exception

        } catch (AjoutVoitureException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(station.toString());
        System.out.println("Nombre de voitures à essence: " + station.NbrVoitureEssence());
        System.out.println("Nombre de voitures noires: " + station.NbrVoitureNoire());
    }
}
