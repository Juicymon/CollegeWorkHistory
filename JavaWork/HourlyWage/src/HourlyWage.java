/*
 * Joseph Steiger
 * 5/25/2020
 * 
 * This program calculates minimum wage based on user input of hours and hourly pay
 */

import java.util.Scanner;

public class HourlyWage {

	public static void main(String[] args) {
		
		//variable and scanner declaration
		Scanner input = new Scanner(System.in);
		double hours, hourlyPay, grossPay;
		
		//user inputs
		System.out.print("How many hours did you work: ");
		hours = input.nextDouble();
		System.out.print("How much do you get paid an hour: $");
		hourlyPay = input.nextDouble();
		
		grossPay = hours * hourlyPay; //calculation to get grossPay
		
		
		System.out.print("Your gross pay is $" + (int)(grossPay*100)/100.0); //output of gross

	}

}
