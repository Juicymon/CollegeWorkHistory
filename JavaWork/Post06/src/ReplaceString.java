/*
 * Joseph Steiger
 * 6/12/2020
 * Version 1.0
 * 
 * This program allows the user to enter a string and then replaces all the instances of a specified work. 
 * 
 * Psuedocode:
 * 				Prompt user for input of string
 * 				prompt user for word to look for
 * 				prompt user for word to replace
 * 				use replace method and display results
 * 				part 2 - send string to array 
 * 				check each word for the word to replace 
 * 				if found, replace it
 */
import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		System.out.println("ID003");
		//variables
		Scanner input = new Scanner(System.in);
	
		//user input
		System.out.print("Enter a string: ");
		String userString = input.nextLine();
		System.out.print("Enter Word 1 (to be replaced): ");
		String replaceString = input.nextLine();
		System.out.println("Enter Word 2 (replaces word 1): ");
		String newWord = input.nextLine();
		
		System.out.println("\nPart 1 \n New String: " + userString.replace(replaceString, newWord)); //replace method
		
		String[] stringArray = userString.split("\\W+"); //string array with each word in its own index
		
		for (int i = 0; i < stringArray.length; i++) //searching through string
		{
			if (stringArray[i].equals(replaceString)) //replaces word if found
			{
				stringArray[i] = newWord;
			}//end if
		}//end loop
		
		//for loop that displays each index of the array
		System.out.print("\nPart 2 \n New String: ");
		for (String e : stringArray) {
			System.out.print(e + " ");
		}
		

	}

}
