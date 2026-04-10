package Partie1conditionBoucles;

import java.util.Scanner;

public class EXERCICE3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez un nombre : ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }

	        sc.close();
	}

}
