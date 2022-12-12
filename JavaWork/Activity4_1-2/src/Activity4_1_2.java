/*
 * Joseph Steiger
 * 6/5/2020
 * Version 1.0
 * 
 * This program demonstrates how to break apart a sentence with a given number of words in the string
 * 
 * Pseudocode: Prompt user for 5 word sentence
 * 			   Assign input to sentence variable
 * 			   create 4 int variables to each hold index position of a space
 * 			   Find index positions of each space using the index of method, and the index of the previous space to find next one
 * 			   Assign each space index position to its variable
 * 			   Find and assign each separate word using the index values found in previous step, as well as the substring method
 * 			   Output each of the words separately as well as their first and last letter
 */

import java.util.Scanner;
public class Activity4_1_2 {

	public static void main(String[] args) {
		
		//variables
		String sentence, word1, word2, word3, word4, word5 = "";
		Scanner input = new Scanner(System.in);
		
		//user creates the 5 word string
		System.out.print("Enter a 5-word sentence: ");
		sentence = input.nextLine();
		
		//finding all the index values of the 4 spaces in a 5 word sentence
		int space1 = sentence.indexOf(' ');
		int space2 = sentence.indexOf(' ', space1 + 1);
		int space3 = sentence.indexOf(' ', space2 + 1);
		int space4 = sentence.indexOf(' ', space3 + 1);
		
		//assigning each word to its own variable using substrings 
		word1 = sentence.substring(0, space1);
		word2 = sentence.substring(space1 + 1, space2);
		word3 = sentence.substring(space2 + 1, space3);
		word4 = sentence.substring(space3 + 1, space4);
		word5 = sentence.substring(space4 + 1);
		
		//outputting the 5 words, as well as the first and last letter of each word
		System.out.println("\nThe first word is: " + word1 +" \nThe first letter is " + word1.charAt(0) + " \nThe last letter is " + word1.charAt(word1.length()-1));
		System.out.println("\nThe second word is: " + word2 +" \nThe first letter is " + word2.charAt(0) + " \nThe last letter is " + word2.charAt(word2.length()-1));
		System.out.println("\nThe third word is: " + word3 +" \nThe first letter is " + word3.charAt(0) + " \nThe last letter is " + word3.charAt(word3.length()-1));
		System.out.println("\nThe fourth word is: " + word4 +" \nThe first letter is " + word4.charAt(0) + " \nThe last letter is " + word4.charAt(word4.length()-1));
		System.out.println("\nThe fifth word is: " + word5 +" \nThe first letter is " + word5.charAt(0) + " \nThe last letter is " + word5.charAt(word5.length()-1));
		
		


	}

}
