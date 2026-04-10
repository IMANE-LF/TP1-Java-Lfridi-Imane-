package Partie2tableaux;

import java.util.Scanner;

public class EXERCICE7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Taille : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
        	System.out.print("Entrez tab[" + i + "] : ");
            tab[i] = sc.nextInt();
        }

        int max = tab[0];

        for (int i = 1; i < n; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println("Max = " + max);
        sc.close();
	}

}
