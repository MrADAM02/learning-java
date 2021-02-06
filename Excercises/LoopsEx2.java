import java.util.Scanner;

/*
 * 
Writing a program that keep reading the user input untill it reaches 100 then stops
*
*/

public class LoopsEx2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int total = 0;
		while (total < 100) {
			System.out.println("Enter a number here: ");
			total += s.nextInt(); 
		} System.out.println("Done: " + total + "\nYou achieved today's goal.");
	}
}
