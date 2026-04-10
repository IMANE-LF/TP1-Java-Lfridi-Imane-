package Partie2tableaux;

import java.util.Scanner;

public class EXERCICE6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }

        System.out.print("Nombre à chercher : ");
        int x = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (tab[i] == x) {
                System.out.println("Position : " + i);
            }
        }

        sc.close();

	}


}
