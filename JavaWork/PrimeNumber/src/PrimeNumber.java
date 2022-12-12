/*
 * Joseph Steiger
 * 6/7/2020
 * Version 1.0
 * 
 * This program displays the first 50 prime numbers to the user
 */
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("ID002");
		
		final int NUMBER_OF_PRIMES = 50; //total number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; //display 10 per line
		
		int count = 0; //counter of the amount of primes
		int number = 2; //a number to be tested for primeness
		
		System.out.println("The first 50 prime numbers are \n");
		
		//repeatedly find prime numbers
		while (count < NUMBER_OF_PRIMES) {
			//assume the number is prime
			boolean isPrime = true; //is the current number prime
			
			//test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { //if true, number is not a prime
					isPrime = false; //set isPrime to false
					break; //exit loop
					
				}
			}
			
			
			//display the prime number and increase the counter
			if (isPrime) {
				count++; //increase counter
				
			if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
				//display the number and advance to a new line
				System.out.println(number);
				}
			else 
				System.out.print(number + " ");
			}
			
			//check if the next number is prime
			number++;
			
		}
	}
}
