package Parking;

public class Voiture extends Vehicule {
	    private int nbPortes;

	    // Constructeur paramétré
	    public Voiture(String matricule, String marque, int nbPortes) {
	        super(matricule, marque);
	        this.nbPortes = nbPortes;
	    }

	    // Redéfinition des méthodes 
	    @Override
	    public void stationner() {
	        System.out.println("La voiture se gare dans une place standard.");
	    }

	    @Override
	    public void afficher() {
	        super.afficher();
	        System.out.println("Nombre de portes est : " + nbPortes);
	    }
	    
}


