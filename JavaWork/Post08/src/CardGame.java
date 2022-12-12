/*
 * Joseph Steiger
 * 6/20/2020
 * 
 * This program simulates a card game 
 * 
 * Pseudocode for: mainMethod
 * 					Prompt user for input of choice
 * 						if choice == 1
 * 							ask user for a card number
 * 							create card number for computer
 * 							call declareWinnder method, pass users card, computers card, deck, and shuffled deck to the method
 * 						if choice == 2
 * 							call declareWinnerComputers method, pass in deck
 * 						if choice == 3
 * 							end program
 * 
 * 				for: shuffleDeck
 * 					create a new String array called shuffled
 * 					copy every string from the String array deck to the shuffled array using a loop
 * 					use a for loop to shuffle the deck
 * 						create two random numbers, use those numbers as index positions
 * 						swap the two index positions with each other
 * 
 * 			for: declareWinner
 * 				assign the strings from the shuffled deck based on the two passed in ints
 * 				find the index of the two strings from the shuffled deck in the original deck
 * 					compare the index values to decide who has the higher card
 *			for: declareWinnerComputers
 *				take the same logic from declareWinner
 *					loop 100 times with active counters to determine which computer wins
 *
 *			for: makeDeck
 *				make a ranks array and a suits array
 *				use two for loops
 *				step through every rank in a suit, for all 4 suits, assigning the value to the appropriate index position
 * 								
 */
import java.util.Arrays;
import java.util.Scanner;
public class CardGame {

	public static void main(String[] args) {
		System.out.println("ID001");
		
		//deck array and shuffledDeck array
		String[] deck = makeDeck();//calls makeDeck method
		String[] sDeck = shuffleDeck(deck); //calls shuffleDeck method and passes deck into it
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What would you like to do? \n 1. Play against the Bot \n 2. Auto Play \n 3. Quit \nEnter choice: ");
		int userChoice = input.nextInt(); //user input
		
		
		while(userChoice != 3) { //program loop
			
			if(userChoice == 1) { //menu option 1
				//user picks a card
				System.out.print("Enter a number between 1 - 52: ");
				int userCard = input.nextInt() - 1;
				
				if (userCard > 51 || userCard < 0) { //if input was invalid, tell user
					System.out.println("That value is out of range!");
				}
				else { //if input was valid, create the computers value and pass them both into the declareWinner method
					int computerCard = (int)(Math.random()*52);
					declareWinner(userCard, computerCard, deck, sDeck);
				}
			} //end menu option 1
		
			else if (userChoice == 2) { //menu option 2
				declareWinnerComputers(deck); //calls declareComputerWinner method and passes the deck array into it
			}//end menu option 2
			else if (userChoice == 3) {
				break;
			}
			else 
				System.out.println("That wasn't an option!");
			
			System.out.print("\nWhat would you like to do? \n 1. Play against the Bot \n 2. Auto Play \n 3. Quit \nEnter choice: ");
			userChoice = input.nextInt();
			
		}//end loop
		
		System.out.println("Goodbye!");
	}//end main
	
	//method for making the deck of cards
	public static String[] makeDeck() {
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
		String[] sortedDeck = new String[52];
		
		int index = 0;
		
		//two loops to step through all 52 cards and assign their value based on incrementing positions
		for (int i = 0; i < suits.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				sortedDeck[index] = rank[j] + " of " + suits[i];
				index++;
			}
		}
		return sortedDeck;
	}//end makeDeck method
	
	//method to shuffle a deck
	public static String[] shuffleDeck(String[] deck) {
		String[] shuffled = new String[52]; //new deck so the original isnt changed
		
		//copies the deck sorted deck array, allowing shuffled to be changed without changed the original deck
		for(int i = 0; i < shuffled.length; i++) {
			shuffled[i] = deck[i];
		}
		
		//shuffles the deck 100 times randomly
		for(int i = 0; i < 100; i++) {
			int index1 = (int)(Math.random()*52);
			int index2 = (int)(Math.random()*52);
			String temp = shuffled[index1];
			shuffled[index1] = shuffled[index2];
			shuffled[index2] = temp;
		}
		
		return shuffled; //returns the shuffled deck
	} // end shuffleDeck method
	
	//method to declare winner for human vs computer
	public static void declareWinner(int card1, int card2, String[] deck, String[] sDeck) {
		
		//the cards chosen by the user and the computer are represented by strings here
		String cardOne = sDeck[card1];
		String cardTwo = sDeck[card2];
		
		//using the Arrays method indexOf to find the index of the string (card) in the original deck to give each card a value
		int indexOfHumanCard = Arrays.asList(deck).indexOf(cardOne);
		int indexOfComputerCard = Arrays.asList(deck).indexOf(cardTwo);
		
		//displays their chosen cards
		System.out.println("You had a " + cardOne);
		System.out.println("Computer has a " + cardTwo);
			
		//decides who had the higher card based on the indexs in the original deck
		if (indexOfHumanCard > indexOfComputerCard)
			System.out.println("You had a higher card. You Win!");
		else if(indexOfComputerCard > indexOfHumanCard)
			System.out.println("Computer had a higher card. Computer Wins!");
		else 
			System.out.println("You both had the same card. Draw!");
	} //end declareWinner method
	
	//method for finding the winner of the auto play
	public static void declareWinnerComputers(String[] deck) {
		
		//win trackers
		int computer1Wins = 0;
		int computer2Wins = 0;
		int ties = 0;
		
		//100 loops/simulated games
		for(int i = 0; i < 100; i++) {
			String[] shuffledDeck = shuffleDeck(deck);//deck shuffled each loop
			//random card chosen each loop
			int computerCard1 = (int)(Math.random()*52);
			int computerCard2 = (int)(Math.random()*52);
			
			//same as the declareWinner method, find the strings in the original deck to determine index values
			String cardOne = shuffledDeck[computerCard1];
			String cardTwo = shuffledDeck[computerCard2];
			int indexOfComp1 = Arrays.asList(deck).indexOf(cardOne);
			int indexOfComp2 = Arrays.asList(deck).indexOf(cardTwo);
			
			//decides who won the current loop iteration
			if(indexOfComp1 > indexOfComp2) {
				System.out.println("Computer 1 had a higher card: " + cardOne);
				computer1Wins++;
			}
			else if(indexOfComp2 > indexOfComp1) {
				System.out.println("Computer 2 had a higher card: " + cardTwo);
				computer2Wins++;
			}
			else {
				System.out.println("Tie");
				ties++;
			}
		} //end 100 loop
		
		//outputting how many times each computer won and who had the most wins 
		System.out.println("Computer 1 had " + computer1Wins + " wins\nComputer 2 had " + computer2Wins + " wins\nThere were " + ties + " ties");
		
		if (computer1Wins > computer2Wins)
			System.out.println("Computer 1 wins");
		else 
			System.out.println("Computer 2 wins");
	} //end autoplay winner method
}//end class
