/*
 * Joseph Steiger
 * 6/13/2020
 * 
 * This program demonstrates the possibilities of making a more advanced chatbot
 * 
 * Psuedocode: 
 * 			  Prompt user to say something to the chatbot
 * 			  assign input to a string
 * 			   	  if that string contains the word 'want'
 * 						if that string contains want to buy
 * 							output appropriate response for want to buy
 * 					else 
 * 						output response just for want
 * 					else if string contains father or mother
 * 						output response related to that
 * 					else if string contains brother or sister
 * 						output response to that
 * 					else if string is empty
 * 						output response to that
 * 				once flag is entered, output goodbye
 * 			  
 */

import java.util.Scanner;
public class ArtificialIntelligence {

	public static void main(String[] args) {
		System.out.println("ID002");
		
		Scanner input = new Scanner(System.in);
		final String FLAG = "EXIT";
		String userInput = "";
		
		System.out.println("Say something to the ChatBot (Enter \"EXIT\" to Quit)");
		userInput = input.nextLine();
			
		while (!(userInput.equals(FLAG))){
			
			
			if (userInput.contains("want")) { //if want is found
				
				if(userInput.contains("want to buy"))  //if want to buy is found
				{
					int startSubString = userInput.indexOf("want to buy") + 11;
					String userWantsToBuy = userInput.substring(startSubString);
					
					System.out.println("Would you be happy if you had" + userWantsToBuy + "?");					
				}//end want to buy if
				
				else 
				{
					int startSubString = userInput.indexOf("want") + 4;
					String userWants = userInput.substring(startSubString);
					
					System.out.println("Why do you want" + userWants + "?");
				}//end want to buy else
				
			}//end want if
			
			else if (userInput.contains("father") || userInput.contains("mother")) 
			{
				System.out.println("Oh! What about your parents?");
			} //end parent else if
			
			else if (userInput.contains("brother") || userInput.contains("sister"))
			{
				System.out.println("I have a sister. Her name is siri");
			}//end sibling else if
			
			else if (userInput.isEmpty())
			{
				System.out.println("I'm sorry, I didn't hear anything. What did you say?");
			}//end empty if	
			else 
				System.out.println("That is very interesting");
		
			System.out.println("\nSay something to the ChatBot (Enter \"EXIT\" to Quit)");
			userInput = input.nextLine();
			
			
		}//end program loop
		

	}

}
