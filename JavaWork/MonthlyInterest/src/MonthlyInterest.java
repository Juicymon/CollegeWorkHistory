/*
Joseph Steiger
5/23/2020

This program takes the annual interest rate and balance from the user and calculates the interest for the next month


Pseudocode: Create double variable for balance, annual interest rate, and interest
			Prompt user to input values for balance and annual interest rate
			Assign the input to each respective variable
			Calculate the monthly interest from the annual interest rate and balance
			Assign the monthly interest rate to the interest variable
			Output the monthly interest to the user
*/

import java.util.Scanner;
public class MonthlyInterest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //scanner variable created
		
		System.out.println("ID002");
		
		System.out.print("Enter the current balance: "); //prompt for user input of balance
		double balance = input.nextDouble(); //user input assigned to variable
		
		System.out.print("Enter the annaul interest rate: "); //prompt for user input of annual interest rate
		double annualInterestRate = input.nextDouble(); //user input assigned to variable
		
		double interest = balance * (annualInterestRate/1200); //formula used to find and assign a value for interest
		
		interest = (int)(interest*100)/100.0; //removes excess decimals from the interest rate 
		
		System.out.println("Interest for the next month: " + interest); //output to user
	}

}
