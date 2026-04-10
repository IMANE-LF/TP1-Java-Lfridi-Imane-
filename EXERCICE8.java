package Partie3matrices;

import java.util.Scanner;

public class EXERCICE8 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int[][] m = new int[3][3];

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                m[i][j] = sc.nextInt();
	            }
	        }

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(m[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    

	}


}
