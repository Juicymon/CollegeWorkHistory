/*
 * Joseph Steiger	
 * 6/9/2020
 * Version 1.0
 * 
 * This program allows the user to discover what numbers are prime
 * 
 * Pseudocode: prompt user to enter a number
 * 				begin loop to keep allowing user to enter numbers
 * 				if number is prime via a calculation
 * 					display is prime
 * 				else
 * 					display isnt prime
 * 				prompt user to enter another number
 * 				if number is -1, stop loop
 * 				else keep going
 * 
 * 				part 2
 * 				prompt user for range
 * 				set range as a comparison value for counter - stars loop
 * 				use same calculation as before to find if number is prime
 * 				if prime, display prime
 * 				else display not prime
 * 				increment counters
 * 				loop should continue displaying results until counter reaches max range input
 * 				end loop
 * 
 * 				
 * 				
 */

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("ID001");
		
		//variables
		boolean isPrime = true;
		int primeNumber;
		Scanner input = new Scanner(System.in);
		
		//part 1
		
		//user inputs number to check
		System.out.println("Enter an integer number to check if it is prime: (enter -1 to stop)");
		primeNumber = input.nextInt();
		
		//while loop to allow the user to keep entering numbers
		while (!(primeNumber == -1)) { 
		for (int divisor = 2; divisor <= primeNumber / 2; divisor++) //for loop to step through all possible dividends of a number
		{
			if (primeNumber % divisor == 0) //if statement to set the number to not prime
			{
				isPrime = false;
				break;
			}
		}
		
		//quick rule for values less than 2
		if (primeNumber < 2) {
			isPrime = false;
		}
		
		//statements to display depending on user input
		if (isPrime) 
		{
			System.out.println(primeNumber + " is prime.");
		}
		else
			System.out.println(primeNumber + " is not prime.");
		
		isPrime = true; //resets value of variable for next check
		System.out.println("Enter another number to check: (enter -1 to stop)"); //next user input
		primeNumber = input.nextInt();
		
		} //end loop
		
		//part 2
		
		//user input of range
		System.out.println("Moving to part 2 \nEnter a max range to see whether each number is prime or not: ");
		int maxRange = input.nextInt();
		
		//counter variables
		int count = 0;
		int currentNumber = 1;
		
		while (count < maxRange) //while loop to go through every number in the range specified
		{
			
			for (int divisor = 2; divisor <= currentNumber / 2; divisor++) //same logic as before
			{
				if (currentNumber % divisor == 0) 
				{
					isPrime = false;
					break;
					
				}//end if statement
								
			}//end loop
			
			//if else to decide what to display
			if (isPrime) {
				System.out.println(currentNumber + " is prime.");
			}
			else 
				System.out.println(currentNumber + " is not prime.");
			
			//incrementing counters and resetting boolean
			count++;
			currentNumber++;
			isPrime = true;
			
			
		} // end loop
		
	}

}
