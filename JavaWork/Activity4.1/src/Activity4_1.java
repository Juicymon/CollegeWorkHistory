/*
 * Joseph Steiger
 * 6/5/2020
 * Version 1.0
 * 
 * This program demonstrates the uses of String methods
*/
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		//variables
		String fullName, firstName, lastName, nameSearch = "";
		Scanner input = new Scanner(System.in);
		
		//user input of name
		System.out.print("Please enter your first and last name: "); 
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' '); //searching for space to spilt name for capitalizing
		
		//splitting the name into a first and last to capitalize it, then concatenating it back together 
		firstName = fullName.substring(0,1).toUpperCase() + fullName.substring(1, space);
		lastName = fullName.substring(space, space + 2).toUpperCase() + fullName.substring(space + 2);
		fullName = firstName + lastName;
		
		//outputting the name name with capitals
		System.out.println("Hello " + fullName);
		
		//user inputs a character to look for
		System.out.print("\nEnter a character to search for: ");
		char search = input.next().charAt(0);
		
		//if else to decide if the character exists
		if (fullName.indexOf(search) > -1) {
			int indexOfSearch = fullName.indexOf(search);
			System.out.println("There is a " + search + " at index " + indexOfSearch + ".");
		}
		else 
			System.out.println("Sorry, there isn't a " + search + " in the name.");
		
		//string to search for
		System.out.print("\nEnter a string to search for: ");
		nameSearch = input.nextLine(); //because of the use of newline characters, an extra input.nextLine() had to be used to consume the new line character, or else there was a logic error
		nameSearch = input.nextLine();
	
		//if else to search for the users inputted string
		if (fullName.contains(nameSearch)) {
			int indexOfString = fullName.indexOf(nameSearch);
			System.out.println("That string was found in the name at index " + indexOfString);
		}
		else 
			System.out.println("Sorry, that string was not found in the name");
		

	}

}
