/*
 * Joseph Steiger
 * 5/9/2020
 * Version 1.0
 * 
 * This program is a shopping list for the user. They input their items, and then check if something is on the list
 */

import java.util.Scanner;
public class ShoppingList {

	public static void main(String[] args) {
		System.out.println("ID001");
		//variables and scanner objects
		Scanner input = new Scanner(System.in);
		int listSize;
		String removeNewLineString = ""; //variable used to remove newline characters
		
		//user input for array size
		System.out.print("Please enter how many items are on your grocery list: ");
		listSize = input.nextInt();
		
		removeNewLineString = input.nextLine(); //this line is used to remove the newline character created after .nextInt because it causes an issue when taking input later on
		
		//if else statement in case the user inputs an incorrect list size
		if (listSize > 0) 
		{
			String[] groceryList = new String[listSize]; //creation of the array
			int itemNumber = 1; //counter for item number
			
			//for loop to take all user inputs of items on the list
			for (int i = 0; i < groceryList.length; i++) 
			{
				System.out.println("Enter item " + itemNumber + ":");
				groceryList[i] = input.nextLine();
				itemNumber++;
			}//end of loop
			
			//prompt for next input
			System.out.println("\nWelcome to your digitcal grocery list!");
			System.out.println("What item are you looking for?");
			
			String searchItem = input.nextLine();
			boolean itemFound = false; //boolean to be used for determining if item exists
			
			//for loop to search through every string in the array
			for (int i = 0; i < groceryList.length; i++) 
			{
				//if statement to change boolean expression 
				if (searchItem.contains(groceryList[i])) 
				{
					itemFound = true;
				}
			}//end of loop
			
			//if else statement to display whether the item exists or not
			if (itemFound) {
				System.out.println(searchItem + " is on your list!");
			}
			else 
				System.out.println(searchItem + " is not on your list!");
			
		}//end of first if
		else
			System.out.print("You can't have a list that is " + listSize);

		
		
	} //end of main

}//end of class
