package Partie4classeString;

import java.util.Scanner;

public class EXERCICE13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String inv = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            inv += s.charAt(i);
        }

        System.out.println(inv);
        sc.close();
	}


}
