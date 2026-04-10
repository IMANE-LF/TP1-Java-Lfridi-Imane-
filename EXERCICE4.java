package Partie1conditionBoucles;

import java.util.Scanner;

public class EXERCICE4 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez N : ");
	        int n = sc.nextInt();

	        int i = 1, somme = 0;

	        while (i <= n) {
	            somme += i;
	            i++;
	        }

	        System.out.println("Somme = " + somme);
	        sc.close();

	}


}
