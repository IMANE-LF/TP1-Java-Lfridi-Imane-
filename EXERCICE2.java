package Partie1conditionBoucles;

import java.util.Scanner;

public class EXERCICE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez 3 nombres : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Le plus grand est : " + max);
        sc.close();

	}

}
