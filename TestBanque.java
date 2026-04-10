
public class TestBanque {
    public static void main(String[] args) {
       //  Création banque :
        Banque b = new Banque("MarocBank", 1500);

        //  Création des comptes :
        CompteBancaire c1 = new CompteBancaire("Ahmed", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("fatima", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("Aya", 1500, 400);

        //  Ajout banque :
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);

        //  Opérations :
        c1.deposer(200);
        c1.retirer(300);
        c2.virementVers(c3, 500);

        //  Afficher tous :
        b.afficherTous();

        //  Intérêts :
        System.out.println("Solde c2 avec intérêts: " + c2.calculerSoldeAvecInterets());
        System.out.println("Solde c2 avec bonus: " + c2.calculerSoldeAvecInterets(0.015));

        //  Nombre total de comptes crées :
        System.out.println("Nombre total de comptes: " + CompteBancaire.getNbComptes());
        System.out.println("Taux intérêt: " + CompteBancaire.getTauxInteretAnnuel());
    }
}