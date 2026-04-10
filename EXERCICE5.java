package Partie2tableaux;

import java.util.Scanner;

public class EXERCICE5 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Taille du tableau : ");
	        int n = sc.nextInt();

	        int[] tab = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("tab[" + i + "] = ");
	            tab[i] = sc.nextInt();
	        }

	        System.out.println("Les éléments :");
	        for (int i = 0; i < n; i++) {
	            System.out.println(tab[i]);
	        }

	        sc.close();
	}

}
