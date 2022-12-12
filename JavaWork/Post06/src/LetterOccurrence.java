/*
 * Joseph Steiger
 * 6/12/2020
 * Version 1.0
 * 
 * This program display to the user how many times a letter appears
 * 
 * Psuedocode: Prompt user for string
 * 				assign value to string
 * 				prompt user for letter
 * 				assign to char 
 * 				step through each letter of the string
 * 				if letter = char
 * 					count++
 * 				display count
 */
import java.util.Scanner;

public class LetterOccurrence {

	public static void main(String[] args) {
		System.out.println("ID002");
		//variables
		Scanner input = new Scanner(System.in);
		int count=0;
		char search; 
		String userString = "";
		
		//user input
		System.out.print("Enter a string: ");
		userString = input.nextLine();
		System.out.print("Enter a letter: ");
		search = input.next().charAt(0);
		
		//for loop to step through the string
		for (int i = 0; i < userString.length(); i++) {
			if (userString.charAt(i) == search) {
				count++; //counter for each instance of the char
			}
		}
		
		System.out.println("Total Occurences: " + count); 

	}

}
