/*
Writing a program that reads a sequence of positive integers. 
The program stops when the user fills a negative value and shows the maximum and the minimum of these numbers.
*/
import java.util.Scanner;

public class LoopsEx4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = s.nextInt();
		int max = n;
		int min = n;
		if (n >= 0) {
		while (true) {
			System.out.println("Enter a number:");
			n = s.nextInt();
			if (n >= 0) {
				max = n > max ? n : max;
				min = n < min ? n : min;
			} else {
				System.out.println("Maximum: " + max + ", Minimum: " + min);
				break;
				}
			} 
		} else {
			System.out.println(n + " is invalid.");
		}
	}
}
