/*
 * Joseph Steiger
 * Version 1.0
 * 5/30/2020
 * 
 * This program determines the users birthday based on 5 sets of numbers
 */
import java.util.Scanner;
public class GuessBirthday {

	public static void main(String[] args) {
		System.out.println("ID001");
		
		//String for set1
		String set1 = 
				" 1 3 5 7\n" + 
				" 9 11 13 15\n" +
				"17 19 21 23\n" +
				"25 27 29 31";
		//set 2
		String set2 = 
				" 2 3 6 7\n" +
				"10 11 14 15\n" +
				"18 19 22 23\n" +
				"26 27 30 31";
		//set 3
		String set3 = 
				" 4 5 6 7\n" +
				"12 13 14 15\n" + 
				"20 21 22 23\n" + 
				"28 29 30 31";
		//set 4
		String set4 = 
				" 8 9 10 11\n" +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		//set 5
		String set5 = 
				"16 17 18 19\n" +
				"20 21 22 23\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		
		int day = 0; //day variable
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to answer question 1
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		int answer = input.nextInt();
		
		if (answer == 1)//counter if statement
			day += 1;
		
		//Prompt user again
		System.out.print("\nIs your birthday in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if (answer == 1) 
			day += 2;
		
		//prompt for set 3
		System.out.print("\nIs your birthday in set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if (answer == 1)
			day += 4;
		
		//prompt for set 4
		System.out.print("\nIs your birthday in set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if (answer == 1)
			day += 8;
	
		//prompt for set5
		System.out.print("\nIs your birthday in set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		if (answer == 1)
			day += 16;
		
		//outputs users birthday
		System.out.println("\nYour birthday is " + day + "!");
	}

}
