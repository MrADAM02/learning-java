/*
 * 
 *  Writing a program that prints the prime numbers between two numbers. 
 *  This program is divided into multiple methods
 * 
 * 
 */

import java.util.Scanner;

public class MethodsEx2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the first number: ");
		int num2 = input.nextInt();
		
		System.out.println("Prime numbers are:");
		printPrimeBetween(num1, num2);
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				return false;
		
		return true;
	}
	
	public static void printPrimeBetween(int start, int end) {
		for (int i = start; i <= end; i++)
			if (isPrime(i))
				System.out.print(i + " ");
				
	}
}
