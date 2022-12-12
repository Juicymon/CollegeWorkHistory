/*
 * Joseph Steiger
 * 6/12/2020
 */
import java.util.*;

public class SimonSays {

	public static void main(String[] args) {
		System.out.println("ID004");
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.println("Input a command with or without \"Simon Says\" (Type \"Exit\" to quit)");
		String command = input.nextLine();
		
		
		while (!(command.equals("Exit") || !(command.equals("exit")))){ //if input contains simon says
			if (command.toLowerCase().contains("simon says")) {
				String[] stringArray = command.substring(11).split("\\W+"); //add string to array
				
				stringArray[0] += "ed";//add ed to first word 
				System.out.print("I");
				//print the array
				for (String e :stringArray) {
					System.out.print(" " + e);
				}
				
			}
			else 
				System.out.println("I stood still because Simon Says was missing!"); //if simon says wasnt included
			
			System.out.println("\n \nInput a command with or without \"Simon Says\" (Type \"Exit\" to quit)");
			command = input.nextLine();
			
		}//end loop
		
		System.out.println("Goodbye!");
	}

}
