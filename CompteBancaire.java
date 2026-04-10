
public class CompteBancaire {

    // Attributs privés :
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    // Attributs communs entre tous les comptes :
    private static int nbComptes = 0;
    private static double tauxInteret= 0.03;

    // Pour générer un numéro de compte unique :
    private static int compteur = 100;

    //  Constructeur par défaut :
    public CompteBancaire() {
        this.numero = ++compteur;
        this.titulaire = "Client";
        this.solde = 0;
        this.decouvertAutorise = 0;

        nbComptes++;
    }

    //  Constructeur paramétré :
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero = ++compteur;
        setTitulaire(titulaire);
        this.solde = solde;
        setDecouvertAutorise(decouvertAutorise);

        nbComptes++;
    }

    //  Getters / Setters avec validations :
    public int getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        } else {
            System.out.println("Titulaire invalide !");
        }
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise >= 0) {
            this.decouvertAutorise = decouvertAutorise;
        } else {
            System.out.println("Découvert invalide !");
        }
    }

    //  Affichage des informations :
    public void afficher() {
        System.out.println("Compte N°: " + numero + " ; Titulaire: " + titulaire +
                " ; Solde: " + solde +
                " ; Découvert autorisé: " + decouvertAutorise);
    }

    // Méthode Déposer :
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    // Méthode Retirer :
    public void retirer(double montant) {
        if (montant > 0 && (solde + decouvertAutorise) >= montant) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé.");
        }
    }

    // Méthode  Virement :
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && (solde + decouvertAutorise) >= montant) {
            this.retirer(montant);
            autre.deposer(montant);
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }

    //  Intérêts sans paramètre :
    public double calculerSoldeAvecInterets() {
        solde = solde + (solde * tauxInteret);
        return solde;
    }

    //  Intérêts avec paramétre bonus :
    public double calculerSoldeAvecInterets(double bonus) {
        double taux = tauxInteret + bonus;
        return solde + (solde * taux);
    }

    //  Ajout des méthodes get/Set :
    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteret;
    }

    public static void setTauxInteretAnnuel(double taux) {
        if (taux >= 0) {
            tauxInteret = taux;
        }
    }
}
