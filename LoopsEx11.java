
/*
Writing a program that reads a positive integer n from the user and displays the following:
1
22
333
4444
…
nnnn...n
*/

import java.util.*;

public class LoopsEx11 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)){
				
		System.out.println("Enter your number here: ");
		int n = s.nextInt();
		String x = "";
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
			}
		}
	}
}
