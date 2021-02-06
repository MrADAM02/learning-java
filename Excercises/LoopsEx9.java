/*
 * 
 * Writing a program that displays the reverse of a string.
 * 
 */

import java.util.Scanner;

public class LoopsEx9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your String: ");
		String answer = s.nextLine();
		String reverse = "";
		
		for (int i = (answer.length() - 1); i >= 0; i--) {
			reverse += answer.charAt(i);
			
		} System.out.println("reverse is " + reverse);
	}
}  
