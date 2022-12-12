/*
 * Joseph Steiger
 * 5/25/2020
 * 
 * This program calculates a users total pay based on hours, hourly pay, overtime, and overtime pay
 * 
 */
import java.util.Scanner;

public class TotalPay {
	public static void main(String[] args) {
		//variable declarations
		Scanner input = new Scanner(System.in);
		double hours, hourlyPay, overtimeHours, overtimePay, regularWages, overtimeWages, totalPay;
		
		//user inputs
		System.out.print("How many hours did you work: ");
		hours = input.nextDouble();
		System.out.print("What is your hourly pay: $");
		hourlyPay = input.nextDouble();
		System.out.print("How many hours of overtime did you work: ");
		overtimeHours = input.nextDouble();
		System.out.print("What is the hourly pay of overtime: $");
		overtimePay = input.nextDouble();
		
		regularWages = hours * hourlyPay; //calculation of regular wages
		
		//If Else statement to determine if overtime should be calculated
		if (overtimeHours > 0) {  //any value above 0 will make the statement true
			overtimeWages = overtimeHours * overtimePay; //overtime pay
			totalPay = overtimeWages + regularWages; //total pay with overtime and regular wages
		}
		else {
			totalPay = regularWages; //total pay if no overtime was done
		}
		
		System.out.println("Your total pay is $" + (int)(totalPay*100)/100.0); //outputs total pay to user

	}

}
