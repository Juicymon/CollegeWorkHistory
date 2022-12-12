/*
 * Joseph Steiger
 * 5/26/2020
 * 
 * This program picks a card for the user
 * 
 * Pseudocode: Prompt user for input
 * 			   Assign input to choice - char
 * 			   if user wants to play, generate random number between 1 and 13
 * 			   if number is 1 -> card value is ace
 * 			   if number is 2 - 10 -> card value is 2-10
 * 			   if number is 11 -> card value is jack
 * 			   if number is 12 -> card value is queen
 * 			   if number is 13 -> card value is king
 * 			   assign value to string cardValue
 * 			   generate new random number between 0 - 3
 * 			   if number is 0 -> card suit is hearts
 * 			   if number is 1 -> card suit is diamonds
 * 			   if number is 2 -> card suit is clubs
 * 			   if number is 3 -> card suit is spades
 * 			   assign value to string cardSuit
 * 			   output cardValue and cardSuit
 *  
 */
import java.util.Scanner;

public class PickACard {
	
	public static void main(String[] args) {
	//variable declarations
	Scanner input = new Scanner(System.in);	
	char choice;
	String cardFace= "";
	String cardSuit = "";
	
	//id output 
	System.out.println("ID001");
	
	//Asks user if they want to play, turns string input into char
	System.out.println("Would you like to pick a card? (Y/N): ");
	choice = input.next().charAt(0);
	
	//if else statement to determine if the user wanted to play or not
	if (choice == 'Y'|| choice == 'y') { //if they input a y or a Y, the cards are picked
		int faceValue = (int)(Math.random()*(13-1+1))+1; //random number generator with a range of 1 - 13
		
		//switch statement to assign a value to cardValue string based on random number generated 
		switch (faceValue) {
		case 1: cardFace = "Ace"; break;
		case 2:	cardFace = "2"; break;
		case 3: cardFace = "3"; break;
		case 4: cardFace = "4"; break;
		case 5: cardFace = "5"; break;
		case 6: cardFace = "6"; break;
		case 7: cardFace = "7"; break;
		case 8: cardFace = "8"; break;
		case 9: cardFace = "9"; break;
		case 10: cardFace = "10"; break;
		case 11: cardFace = "Jack"; break;
		case 12: cardFace = "Queen"; break;
		case 13: cardFace = "King"; break;
		default: System.out.println("Something went wrong"); break; //may not be needed, but this line is useful incase the code isn't working as intended
		}
		
		int suitValue = (int)(Math.random()*(4)); //another random number generator with the range of 0 - 3 for card suit
		
		//switch statement to assign value to suitValue string based on random number generator
		switch (suitValue) {
		case 0: cardSuit = " of Hearts"; break;
		case 1: cardSuit = " of Diamonds"; break;
		case 2: cardSuit = " of Clubs"; break;
		case 3: cardSuit = " of Spades"; break;

		default: System.out.println("Something else went wrong."); break; //debugging line
		}
		
		System.out.println("You got a " + cardFace + cardSuit); //output of the users drawn card
		
		
		}
	else 
		System.out.println("Goodbye"); //if the user decides not to play
	
	
	}
	

}

