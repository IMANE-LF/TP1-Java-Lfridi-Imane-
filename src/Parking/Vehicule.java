package Parking;

public class Vehicule {
	    protected String matricule;
	    protected String marque;

	    // Constructeur paramétré 
	    public Vehicule(String matricule, String marque) {
	        this.matricule = matricule;
	        this.marque = marque;
	    }

	    // Méthode stationner
	    public void stationner() {
	        System.out.println("Le véhicule se gare dans le parking.");
	    }

	    // Méthode afficher
	    public void afficher() {
	        System.out.println("Matricule : " + matricule + ", Marque : " + marque);
	    }
	

}
