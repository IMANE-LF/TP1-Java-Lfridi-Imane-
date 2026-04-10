package Parking;

public class TestParking {
    public static void main(String[] args) {

        // a- Tableau polymorphe
        Vehicule[] v = new Vehicule[4];

        // b- Initialisation
        v[0] = new Voiture("A673", "BMW", 4);
        v[1] = new Voiture("B578", "Mercedes", 4);
        v[2] = new Moto("C621", "Yamaha", true);
        v[3] = new Camion("D876", "Volvo", 12000);

        // c- Parcours du tableau polymorphe
        System.out.println("===> Parcours du tableau polymorphe : <===");
        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
            System.out.println("________________________________________");
        }

        // d- Afficher uniquement les voitures
        System.out.println("===> Les voitures uniquement : <===");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
                System.out.println("______________");
            }
        }

        // e- Exécution du code corrigé :
        Vehicule x = new Moto("11C22", "Yamaha", true);

        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println(" Impossible de convertir Moto en Voiture !");
        }
    }
}