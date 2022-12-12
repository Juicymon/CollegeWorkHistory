/*
 * Joseph Steiger
 * 6/11/20
 */
import java.util.Scanner;

public class GreatestCommonDivisorMethod {
	/**Main Method */
	public static void main(String[] args) {
		System.out.println("ID003");
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for two integers
		System.out.print("Enter the first integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter the second integer: ");
		int n2 = input.nextInt();
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));

	}
	
	//Return the gcd of two integers
	public static int gcd(int n1, int n2) {
		int gcd = 1; //initial gcd
		int k = 2; //possible gcd
		
		while (k <= n1 && k<= n2) {
			if (n1 % k == 0 && n2 % k == 0) 
				gcd = k; //update gcd
				k++;
			
		}
		
		return gcd; //returns gcd
		
	}

}
