/*
Joseph Steiger
5/29/2020


Psuedocode: Ask user to input inventory for all 3 stores
			Ask user for widget value
			Ask user for widgets sold at store 1
			Ask user for widgets sold at store 2
			Ask user for widgets sold at store 3
			(After each user input, a value is assigned to a variable)
			Calculate totalValue
			If totalValue > 2000 give commission
			Else don't display total commission
			Display inventory left at all 3 stores
*/
import java.util.Scanner;
public class FlowchartActivity {

	public static void main(String[] args) {
		
		//Variable declarations
		int store1, store2, store3, beginInv, soldInv;
		double widgetValue, totalValue = 0;
		Scanner input = new Scanner(System.in);
		
		//Prompt user to input inventory
		System.out.println("Enter your total beginning inventory for all three stores: ");
		beginInv = input.nextInt();
		
		//get widget value
		System.out.println("How much is each widget worth: ");
		widgetValue = input.nextDouble();
		
		//get widgets sold at store 1
		System.out.println("How many widgets were sold at Store 1: ");
		soldInv = input.nextInt();
		store1 = beginInv - soldInv;
		
		//get widgets sold at store 2
		System.out.println("How many widgets were sold at Store 2: ");
		soldInv = input.nextInt();
		store2 = beginInv - soldInv;
		
		//get widgets sold at store 3
		System.out.println("How many widgets were sold at Store 3: ");
		soldInv = input.nextInt();
		store3 = beginInv - soldInv;
		
		//find totalValue
		totalValue = ((beginInv * 3) - (store1 + store2 + store3)) * widgetValue;
		
		//if else statement to determine whether or not to display total commissions
		if (totalValue > 2000 ) {
			System.out.println("Your total commission for the inventory sold at all three stores is $" + (int)(totalValue*100)/100.0);
		}
		else {
			System.out.println("Your total commission was less than $2000.");
		}
		//output of all 3 stores inventory left
		System.out.println("Store 1 has " + store1 + " inventory left.");
		System.out.println("Store 2 has " + store2 + " inventory left.");
		System.out.println("Store 3 has " + store3 + " inventory left.");	
	
	}
}
