/*
 * Joseph Steiger
 * 6/12/2020
 * Version 1.0
 * 
 * This program allows the user to input a string of text and then counts the number of words. 
 * 
 * Pseudocode: prompt user for string
 * 			   assign string to string variable 
 * 			   step through each letter of the string
 * 				if index is a space
 * 				add one to word counter
 * 				display total 
 */
import java.util.Scanner;
public class WordCounter {

	public static void main(String[] args) {
		System.out.println("ID001");
		
		Scanner input = new Scanner(System.in);
		String userString = "";
		int count = 1;
		
		System.out.print("Enter your string here: ");
		userString = input.nextLine();
		
		userString = userString.trim();
		
		for (int i = 0; i < userString.length(); i++)
		{
			if (userString.charAt(i) == ' ') {
				count++;
			} //end if
				
		}//end loop
		
		
	if (userString.isEmpty())
		count = 0;
		
		System.out.println("Total words: " + count);
	}

}
