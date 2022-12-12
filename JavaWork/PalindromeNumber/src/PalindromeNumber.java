/*
 * Joseph Steiger
 * 5/26/2020
 * 
 * This program determine if the input number is a palindrome
 * 
 */
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("ID002");
		
		//variable declarations
		int number, firstDigit, lastDigit;
		
		Scanner input = new Scanner(System.in);
		
		//prompts user for input of a number
		System.out.print("Please enter a 3-digit number: ");
		number = input.nextInt(); //assigns input to number variable
		
		//firstDigit value is found by dividing number by 100
		firstDigit = number / 100;
		lastDigit = number % 10; //the last digit is found by using number%10 on the input number
		
		//if else statement to determine if the number was a palindrome
		if (firstDigit == lastDigit)
			System.out.println(number +" is a palindrome");
		else 
			System.out.println(number + " is not a palindrome");

	}

}
