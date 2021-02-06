/*
 * Writing a method that gets the name of the user 
 * and a method that gets the age of the user.
 * 
 */

import java.util.Scanner;

public class MethodsEx1 {
	public static void main(String[] args) {
		System.out.print("What is your name? ");
		getName();
		System.out.print("How old are you? ");
		getAge();
		
		System.out.println("You have successfully subscribed to the list!");
		System.out.println("Thanks for your subscribtion, ");
	}
	
	public static String getName() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	public static int getAge() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}
