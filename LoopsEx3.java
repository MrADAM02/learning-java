
/*

Writing a program tells the user weather the number entered is prime or not.

*/


import java.util.Scanner;

public class LoopsEx3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		
		boolean isPrime = true;
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
				
		} System.out.println(isPrime ? "Prime" : "NOT Prime!");
	}
}
