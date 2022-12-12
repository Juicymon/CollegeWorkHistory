/*
 * Joseph Steiger
 * 5/25/2020
 * 
 * This program generates a random number and creates two lottery digits, then the users inputs a guess
 * the guess is turned into digits as well and the lottery digits are compared to the guess digits,
 * the outcome of the comparison determines the price
 * 
 * 
 * Pseudocode: Create a random number - lottery number
 * 	    	   Prompt user for input of guess number
 * 			   Create 2 lottery digits, one is the lottery number divided by 10, the other is the lottery number % 10
 * 			   Turn the users input into 2 guess digits by using the same method in the above step
 * 			   Tell the user what the lottery number was
 * 			   Determine the users winning based on a list of comparisons
 * 			   If the users guesses the lottery number, they win $10,000
 * 			   If the users guesses all the digits, they win $3,000
 * 			   If the users guesses one digit, they win $1,000
 * 			   If the users guesses nothing correct, they lose
 * 			   Output what the user won, or if they lost
 */
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		System.out.println("ID001");
		
		//Generate a lottery number
		int lottery = (int)(Math.random() * 100);
		
		//prompt user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		//Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		//Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		//Check the guess
		if (guess == lottery)
			System.out.println("Exact match: You win $10,000");
		else if (guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: You win $3,000");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: You win $1,000");
		else 
			System.out.println("Sorry, no match"); 

	}

}
