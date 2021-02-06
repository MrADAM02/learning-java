/* 
 * 
Writing a program that reads a positive integer N 
and displays a pyramid of stars of N rows.
 *
 */

import java.util.Scanner;

public class LoopsEx12 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)){
				
		System.out.println("Enter a number here: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int f = 1; f <= n - i; f++) 
				System.out.print(" ");
			
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			
			for (int t = 1; t <= i; t++)
				System.out.print("*");
		
		System.out.println();
			}
		}
	}
}