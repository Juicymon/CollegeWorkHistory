/*
 * Joseph Steiger
 * 6/10/2020 
 * Version 1.0
 */
import java.util.Scanner;

public class PokemonGame {
	public static void main(String[] args) {
		System.out.println("ID001");
		
		//variables that need a full scope
		Scanner input = new Scanner(System.in);
		String userStarter = "";
		int starterChoice, firstLoopCounter = 0;
		int potionCount = 10;
		int playerPokemonCurrentHP = 100;
		final int POTION_HEALING = 20;
		
		//while loop to ensure a proper choice is made
		while (firstLoopCounter == 0) 
		{
			
			//user picks pokemon
		System.out.println("Which starter pokemon would you like to use? \n 1. Charmander \n 2. Squirtle \n 3. Bulbasaur");
		starterChoice = input.nextInt();
			
		//assigns users starter pokemon
		if (starterChoice == 1) 
		{
			userStarter = "Charmander";
			firstLoopCounter++;
		}
		else if(starterChoice == 2)
		{
			userStarter = "Squirtle";
			firstLoopCounter++;
		}
		else if (starterChoice == 3)
		{
			userStarter = "Bulbasaur";
			firstLoopCounter++;
		}
		else 
			System.out.println("That wasn't an option"); //if user picks something incorrect, counter doesnt go up and loop asks for input again
		
		} //end loop
		
		System.out.println("You chose: " + userStarter);
		
		//users first choice
		System.out.println("\nWhat would you like to do? \n 1. Search for Pokemon \n 2. Use a potion \n 3. Quit the game");
		int gameplayChoice1 = input.nextInt();
		
		
		//loop to continue the game until the user quits
		while (gameplayChoice1 != 3) 
			
		{
			if (gameplayChoice1 == 1) //search for pokemon
			{
				int findPokemon = (int)(Math.random()*10) + 1; //random gen to determine if user finds pokemon
				
				if (findPokemon <= 5) //1-5 = found
				{
					System.out.println("You found a Pokemon!");
					
					int foundPokemonStartHP = (int)(Math.random()*51) + 50; //randomly assigns the found pokemons health between 50 and 100
					int foundPokemonCurrentHP = foundPokemonStartHP;
					int pokemonType = (int)(Math.random()*3)+1; //random number to determine pokemon type
					String typeOfPokemon = "";
					
					//switch case to determine type of pokemon found
					switch (pokemonType) 
					{
					case 1: typeOfPokemon = "Fire"; break;
					case 2: typeOfPokemon = "Water"; break;
					case 3: typeOfPokemon = "Grass"; break;
					default: System.out.println("Something went wrong"); break;
						
					}
					
					System.out.println("The Pokemon is a " + typeOfPokemon +" type, it has " + foundPokemonCurrentHP + " health"); //print pokemon and health
					
					//gets player choice for what to do 
					System.out.println("What would you like to do? \n 1. Fight the Pokemon \n 2. Use a Pokeball \n 3. Use a Potion \n 4. Flee");
					int gameplayChoice2 = input.nextInt();
					boolean inCombat = true;
					
					while (inCombat) //option to use while engaged with found pokemon
					{
						if (gameplayChoice2 == 1) //fight pokemon
						{
							//random damage for both user and the "enemy" pokemon
							int playerDamage = (int)(Math.random() * 12) + 1;
							int enemyDamage = (int)(Math.random() * 12) + 1;
							
							//damage decrements
							foundPokemonCurrentHP -= playerDamage;
							playerPokemonCurrentHP -= enemyDamage;
							
							//display of damage done and health left
							System.out.println("You did " + playerDamage + " damage to the enemy Pokemon, it has " +  foundPokemonCurrentHP + " HP left");
							System.out.println("The enemy Pokemon did " + enemyDamage + " damage to your Pokemon, you have " + playerPokemonCurrentHP + " HP left");
							
							//check to see if one of the pokemone has fainted
							if (foundPokemonCurrentHP <= 0)
							{
								System.out.println("The enemy Pokemon has fainted.");
								break;
							}
							else if (playerPokemonCurrentHP <= 0) 
							{
								System.out.println("Your Pokemon has fainted");
								playerPokemonCurrentHP = 0;
								break; 
							}
							
							//gets user input again to decide if the combat loop is to continue. 
							System.out.println("What would you like to do? \n 1. Fight the Pokemon \n 2. Use a Pokeball \n 3. Use a Potion \n 4. Flee");
							gameplayChoice2 = input.nextInt();
						} //end fight if statement
						
						else if (gameplayChoice2 == 2) //use pokeball if 
						{
							double successRate = foundPokemonStartHP / foundPokemonCurrentHP; //success chance
							int randChance = (int)(Math.random()*10) + 1; //random number to go against
							
							if (randChance < successRate) //if the random number is less than the chance, you caught the pokemon.
							{
								System.out.println("You caught the Pokemon!");
								break;
							}
							else 
								System.out.println("You failed to catch the Pokemon!");
							
							System.out.println("What would you like to do? \n 1. Fight the Pokemon \n 2. Use a Pokeball \n 3. Use a Potion \n 4. Flee");
							gameplayChoice2 = input.nextInt();
						}//end pokeball if
						
						else if (gameplayChoice2 == 3)//use potion
						{
							if (potionCount > 0) //ensures user has potions left
							{
							playerPokemonCurrentHP += POTION_HEALING; //heals
							potionCount--; //takes a potion away from total
							
								if (playerPokemonCurrentHP > 100) //if health is over 100, removes extra health
								{
								playerPokemonCurrentHP -= playerPokemonCurrentHP % 100;
								}
							}
							else 
								System.out.println("You are out of potions!");
							
							//display users current hp, potions left, and combat options
							System.out.println("Your current HP is " + playerPokemonCurrentHP + ". You have " + potionCount + " potions left.");
							System.out.println("What would you like to do? \n 1. Fight the Pokemon \n 2. Use a Pokeball \n 3. Use a Potion \n 4. Flee");
							gameplayChoice2 = input.nextInt();
							
						}//end potion if
						
						else if (gameplayChoice2 == 4) //flee
						{
							System.out.println("You fled combat");
							inCombat = false;
						}
						
					}// end combat loop
					
				} //end pokemon found if 
				else 
					System.out.println("You didn't find a Pokemon!");
				
				if (playerPokemonCurrentHP == 0) //checks to see if player pokemon is active after fight, if health is 0, game over
					break;
				
				
			} //end search if
			
			else if (gameplayChoice1 == 2) //use potion
			{
				if (potionCount > 0) 
				{
				playerPokemonCurrentHP += POTION_HEALING; //heal amount
				potionCount--; //loss of a potion
				
					if (playerPokemonCurrentHP > 100) //checks to see if the health is too much
					{
					playerPokemonCurrentHP -= playerPokemonCurrentHP % 100;
					}
				}
				else 
					System.out.println("You are out of potions!");
							
			} //end use potion if 
			
			//gets user input again for the game loop
			System.out.println("\nYour current Pokemon's health is " + playerPokemonCurrentHP + ". You have " + potionCount + " potions left.");
			System.out.println("What would you like to do? \n 1. Search for Pokemon \n 2. Use a potion \n 3. Quit the game");
			gameplayChoice1 = input.nextInt();
			

		} //end loop
		
		System.out.println("Thanks for playing!"); 

	}//end main

}//end class
