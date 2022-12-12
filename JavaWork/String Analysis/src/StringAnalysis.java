/*
 * Joseph Steiger
 * 6/4/2020
 * Version 1.0
 * 
 * This program asks the user to input a string, then asks them for a letter to find and an index position to report a letter
 * 
 * Pseudocode: Prompt the user for a string input
 * 			   Assign that input to a string
 * 			   Find string length
 * 			   Prompt user for input of a letter
 * 			   Assign that character to a char variable
 * 			   Prompt user for an index position
 * 			   Assign that index position to an int variable 
 * 			   Output string length
 * 			   if the letter the user input exists
 * 					Output its index position 
 * 			   else 
 * 					Output invalid character 
 * 				if the index position the user input exists
 * 					Output the character at that index
 * 				else 
 * 					Output invalid position 
 */
import java.util.Scanner;

public class StringAnalysis {

	public static void main(String[] args) {
		//variables
		String userString = "";
		char letter; 
		int findIndex, stringLength;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID002"); //id
		
		//user input of string
		System.out.print("Enter your string here: ");
		userString = scan.nextLine();
		stringLength = userString.length();
		
		//user input of a letter to find
		System.out.print("Enter a letter ");
		letter = scan.next().charAt(0);
		
		//user input of an index position to return the char of
		System.out.print("Enter a slot number: ");
		findIndex = scan.nextInt();
		
		System.out.print("The String length is: " + stringLength); //output string length
		
		//if else statement to determine if the letter the user input exists, and if so, where it is
		if (userString.indexOf(letter) > -1)
		{
			System.out.print("\nThe slot number of letter " + letter + " is: " + userString.indexOf(letter));
		}
		else 
			System.out.print("\nThe slot number of letter " + letter + " is: Not Valid");
		
		//if else statement to determine fi the index position the user input contains a character, and if so, what it is
		if (findIndex <= userString.length() - 1 && findIndex >= 0) 
		{
			System.out.print("\nThe letter at slot " + findIndex + " is: " + userString.charAt(findIndex));
		}
		else 
			System.out.print("\nThe letter at slot " + findIndex + " is: Not Valid");
		
		

	}

}
