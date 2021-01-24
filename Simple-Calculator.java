
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("");
				System.out.println("Enter the numbers to perform arthematic operations\n");
				System.out.println("Enter the first number: ");
				int x = sc.nextInt();
				System.out.println("Enter the second number: ");
				int y = sc.nextInt();
				System.out.println("Choose the operation you want to perform");
				System.out.println("Choose 1 for ADDITION.");
				System.out.println("Choose 2 for SUBTRACTION.");
				System.out.println("Choose 3 for MULTIPLICATION.");
				System.out.println("Choose 4 for DIVISION.");
				System.out.println("Choose 5 for MODULUS.");
				System.out.println("Choose 6 for EXIT!.");
				int n = sc.nextInt();
				switch (n) {
				case 1 :
					int add;
					add = x + y;
					System.out.println("Result : " + add);
					break;
					
				case 2 :
					int sub;
					sub = x - y;
					System.out.println("Result : " + sub);
					break;
					
				case 3 :
					int multiple = x * y;
					System.out.println("Result : " + multiple);
					break;
					
				case 4 :
					double division;
					division = (double) x / y;
					System.out.println("Result : " + division);
					break;
					
				case 5 :
					int modulus;
					modulus = x % y;
					System.out.println("Result : " + modulus);
					break;
					
				case 6 :
					System.exit(0);
				default :
					System.out.println("Invalid Entry!\nPlease enter a number from 1 to 6");
				}    
			}
		}
	} 
}
