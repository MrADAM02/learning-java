/*
 * 
Writing a program that reads a positive integer N 
and displays a triangle of stars of N rows.
 * 
 */

import java.util.Scanner;

public class LoopsEx13 {
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)){
				
		System.out.println("Enter a number here: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			
			for (int j = 1; j <= 2*i - 1; j++)
				if (i == n)
					System.out.print("*");
				else 
					if (j == 1 || j == 2*i - 1)
						System.out.print("*");
					else
						System.out.print(" ");
			
			
		System.out.println();
			}
		}
	}
}