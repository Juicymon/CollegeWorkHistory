/*
Joseph Steiger
5/23/2020

This program takes the users input of a car and its initial cost and calculates a new value with the membership deal and tax added in


Psuedocode: Create string variable for car model
			Create double variable for initial cost, sales tax, discount, and final price
			Prompt the user for the car model
			Assign input to car model variable
			Prompt user for initial cost
			Assign input to initial cost variable
			Calculate sales tax from the initial cost and assign the value to the sales tax variable
			Add the sales tax and the initial cost to the final price
			Calculate the discount using the final price variable 
			Subtract the discount from the final price
			Output the car's model, initial cost, sales tax, discount, and final price to the user
			Output the salesman's commission at a 10% commission
*/

import java.util.Scanner;
public class CarDealership {

	public static void main(String[] args) {
		
		System.out.println("ID003");
		Scanner input = new Scanner(System.in); //scanner variable
		//variable declaration
		String carModel;
		Double initialCost;
		Double salesTax;
		Double discount;
		Double finalPrice;
		//inputs for the car model and cost as well as the scanner to assign values
		System.out.print("Enter the cars model: "); 
		carModel = input.next();
		System.out.print("Enter the initial cost: $"); 
		initialCost = input.nextDouble();
		
		//initialization and calculations for the sales tax, final price, and discount amount. 
		salesTax = initialCost * 0.036;
		finalPrice = initialCost + salesTax;
		discount = finalPrice * 0.15;
		finalPrice -= discount;
		
		
		
		//output of all the information
		System.out.println("The car model is a " + carModel);
		System.out.println("The inital cost is: $" + initialCost);
		System.out.println("The sales tax is: $" + salesTax);
		System.out.println("The discount is: $" + discount);
		System.out.println("The final price is: $" + finalPrice);
		System.out.println("Salesman commission: $" + (finalPrice * 0.10));
		
		
		
		
		

	}

}
