 public class Banque {

    private String nom;
    private CompteBancaire[] comptes;
    private int nbActuels;

    //  Constructeur paramétré :
    public Banque(String nom, int capaciteMax) {
        this.nom = nom;
        this.comptes = new CompteBancaire[capaciteMax];
        this.nbActuels = 0;
    }

    //  Ajout d'un compte :
    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels] = c;
            nbActuels++;
        } else {
            System.out.println("Banque pleine !");
        }
    }

    //  Affichage de tous les comptes :
    public void afficherTous() {
        System.out.println("Banque: " + nom);
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}
 
