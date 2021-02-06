/*
 * Writing a program that reads a positive integer N 
 * and displays a rectangle of N rows.
 */

import java.util.Scanner;

public class LoopsEx14 {
	public static void main(String[] args) {
		
		try(Scanner s = new Scanner(System.in)){
			
		System.out.print("Enter a number here: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
				if (i == 1 || i == n)
					for(int j = 1; j <= n; j++)
						System.out.print("*");
				else 
					for(int j = 1; j <= n; j++)
						if (j == 1 || j == n)
							System.out.print("*");
						else
							System.out.print(" ");
					
				System.out.println();
			}
		}
	}
}
