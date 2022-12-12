/*
 * Joseph Steiger
 * 5/27/2020
 * 
 * This program flips a coin for the user
 * 
 * Pseudocode: Ask user if they wish to flip a coin
 * 			   Assign value to choice
 * 			   if (choice != 0) 
 * 					generate random number between 1 - 2
 * 			   if num == 1 
 * 					display message
 * 			   else if num == 2
 * 					display message
 * 			   else 
 * 					display message
 */
import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
		//variable declarations
		int coinFlip, choice;
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.println("Would you like to flip a coin? (Enter 0 for no, 1 for yes): ");
		choice = input.nextInt();
		
		//if else statement with nested if else 
		if (choice != 0) { //checks to see if user didnt want to play first
			coinFlip = (int)(Math.random()*(2-1+1))+1; //generates a number between 1 - 2
			if (coinFlip == 1) { //if num is 1 it is heads
				System.out.println("You got heads!");
			}
			else if (coinFlip == 2) { //if num 2 is it is tails
				System.out.println("You got tails!");
			}
			else 
				System.out.println("Something went wrong!"); //debugging/error checking
		}
		System.out.println("Goodbye!");
	}

}
