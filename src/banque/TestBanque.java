package banque;

public class TestBanque {
    public static void main(String[] args) {

        Compte[] comptes = new Compte[4];

        comptes[0] = new CompteCourant("C1", "Imane", 1000, 500);
        comptes[1] = new CompteEpargne("E1", "Ali", 2000, 0.05);
        comptes[2] = new ComptePremium("P1", "Sara", 3000, 1000);
        comptes[3] = new CompteCourant("C2", "Youssef", 500, 300);

        for (Compte c : comptes) {
            c.deposer(100);
            c.retirer(200);
            c.afficher();
            System.out.println("------------");
        }
        
       // Question 6: Filtrage par type
        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
        
        //Question 7: Downcasting 
        Compte c = new CompteEpargne("E2", "Test", 1000, 0.05);
        CompteCourant cc = (CompteCourant) c;
        
    }
}
