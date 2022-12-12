/*
 * Joseph Steiger
 * 5/28/2020
 * 
 * This program determines if the fraction input is proper or improper and displays that to the user
 */
import java.util.Scanner;
public class Activity3_9 {

	public static void main(String[] args) {
		//variables
		int numerator, denominator, wholeNumber, newNum;
		Scanner scan = new Scanner(System.in);
		
		//user inputs values for denom and numerator
		System.out.println("Enter the numerator: ");
		numerator = scan.nextInt();
		System.out.println("Enter the denominator: ");
		denominator = scan.nextInt();
		
		//if else statement to decide where the fraction should go
		if ((numerator / denominator) == 0) { //if the fraction == 0 when divided its a proper fraction, anything under one is stored as 0 in an int
			System.out.println(numerator + " / " + denominator + " is a proper fraction");
		}
		else if ((numerator % denominator) == 0) { //if the top % the bottom has no remainder, its improper that can be reduced to a whole number
			System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + (numerator / denominator));
		}
		else { //if neither of the top two if statements are true, its an improper fraction that can be turned into a mixed number
			wholeNumber = numerator / denominator;
			newNum = numerator % denominator;
			
			System.out.println(numerator + " / " + denominator + " is an improper fraction and it's mixed fraction is " + wholeNumber + " + " + newNum + " / " + denominator);
		}

	}

}
