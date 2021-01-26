
/*
 * Writing a program that displays a string with space after each character.
 */

import java.util.Scanner;

public class LoopsEx8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your String: ");

		String n = s.nextLine();
		
		for (int i = 0; i <= (n.length() - 1); i++) {
			System.out.print(n.charAt(i) + " ");
		}
		
	}
}