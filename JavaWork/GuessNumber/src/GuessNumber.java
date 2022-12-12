/*
 * Joseph Steiger
 * 6/7/2020
 * Version 1.0
 * 
 * This program generates a random number and uses loops to allow the user to keep guessing until they get it
 */

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		//Generate a random number to be guessed
		
		System.out.println("ID001");
		
		int number = (int)(Math.random()*101); //number between 0 and 100 generated randomly
		
		
		Scanner input = new Scanner(System.in); //scanner created
		
		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1; //guess initialized 
		
		while (guess != number) {
			//Prompt user to guess the number
			
			System.out.print("\nEnter your guess: ");
			
			guess = input.nextInt(); //user guess
			
			//if else to decide what to output back to the user
			if (guess == number) {
				System.out.println("Yes, the number is " + number);
			}
			else if (guess > number) {
				System.out.println("Your guess is too high");
			}
			else 
				System.out.println("Your guess is too low");
		} //end of loop

	}

}
