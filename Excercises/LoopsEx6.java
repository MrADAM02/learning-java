
import java.util.Scanner;

/* 
 * Writing a program that reads an integer n 
 * and displays the nth Fibonacci number.
 */
public class LoopsEx6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int n = s.nextInt();
		
		int result = 0;
		int num1 = 1;
		int num2 = 1;
		if (n == 0)
			System.out.println("Fibonacci = 0 bro!");
		if (n == 1)
			System.out.println("Fibonacci = 1 bro!");
		if (n > 1) {
		for (int i = 1; i <= (n-2); i++) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			
			} System.out.println("Fibonacci is " + (result == 0 ? 1 : result));
		}
	}
}
