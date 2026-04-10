package Partie4classeString;

import java.util.Scanner;

public class EXERCICE12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("Voyelles = " + count);
        sc.close();
	}

}
