/*
 * 
 *  Writing a program that finds if a string is a palindrome string or not.
 * 
 */

import java.util.Scanner;

public class LoopsEx10 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)){
				
		System.out.println("Enter your String: ");
		String answer = s.nextLine();
		
		for (int i = 0, j = (answer.length() - 1); i < j; i++, j--)
			if (answer.charAt(i) == answer.charAt(j)) {
				if (i == (j / 2))
					System.out.println("Yes, we got a Palindrome!");
			} else {
				System.out.println("No, it is NOT a Palindrome.");
				break;
			}
		}			
	}
}