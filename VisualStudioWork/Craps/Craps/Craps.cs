//Joseph Steiger
//9/10/2021
//Assignment 1 - Craps
//ITCS 3112
using System;

namespace Craps
{
    class Craps
    {
        static void Main(string[] args)
        {
            bool gameIsRunning = false; //flag for stopping the game 
            int playerChips = 100;

            Console.WriteLine("***** CRAPS GAME *****"); //rules section for the player
            Console.WriteLine("How To Play:\n  -Two dice are rolled. The sum of these dice is the total of the roll.\n  -If the sum is equal to \n    " +
                "    -7 or 11 on the first throw, you win.\n        -2, 3, or 12 on the first throw, you lose.\n        -4, 5, 6, 8, 9, or 10 on the first throw, this sum is now your \"point\"." +
                "\n  -If you have a \"point\", you must keep rolling until you roll that value to win, or roll a 7 to lose.");
            Console.WriteLine("-------------------------------------------------------------------------------------------------------\n");


            Console.WriteLine("Do you wish to play Craps? (Y/N)");//user inputs if they wish to play
            char wantsToPlay = (char)Console.Read(); //user input is parsed to char
            Console.ReadLine();//eats the enter key to allow for other input to be read

            if (wantsToPlay == 'Y' || wantsToPlay == 'y')//determines if the game should start
                gameIsRunning = true; //starts game if user enters yes

            //loop to keep running while game is playing
            while (gameIsRunning) {
                int rollCounter =0, wager=0, diceSum = 0; 
                Random rnd = new Random(); //simple random number generator
                bool goodWager = false; //wager check
                bool playerIsPlaying = true; //dice rolling check

                //determines if the users wager is good
                while (!goodWager)
                {
                    Console.WriteLine("You currently have: " + playerChips + " chips. How many would you like to wager: ");
                    wager = Convert.ToInt32(Console.ReadLine()); //converts string value to int

                    //if wager is valid, accepts value
                    if (wager > playerChips || wager < 1)
                    {
                        Console.WriteLine("That wager is invalid.");
                        goodWager = false;
                    }
                    else
                        goodWager = true;
                }
                Console.Write("\n-------------------\n"); //creates spacing for game section
                int makePoint = 0; 
                while (playerIsPlaying) //while loop to keep rolling dice until player loses or wins
                {
                    diceSum = rnd.Next(1, 6) + rnd.Next(1, 6); //sums two dice rolls
                    rollCounter++; //coutns current roll
                    Console.WriteLine("You Rolled a: " + diceSum);

                    if (rollCounter == 1) //sets the makepoint without changing it after first roll
                    {
                        makePoint = diceSum;
                        Console.WriteLine("Your point to roll is: " + makePoint);
                    }//end if

                    if (((diceSum == 7 || diceSum == 11) && rollCounter == 1) || (makePoint == diceSum && rollCounter > 1)) //checks if the value is winning value
                    {
                        Console.WriteLine("You Won!");
                        playerIsPlaying = false; //ends loop
                        playerChips += wager; //adds wager value
                    }
                    else if (((diceSum == 2 || diceSum == 3 || diceSum == 12) && rollCounter == 1) || (diceSum == 7 && rollCounter > 1)) //checks if value is losing value
                    {
                        Console.WriteLine("You Lost!");
                        playerIsPlaying = false;
                        playerChips -= wager; //wager subtacted from chip count
                    }
                } // end while

                Console.WriteLine("-------------------");
                if (playerChips == 0) //ensures user can keep playing
                {
                    Console.WriteLine("\nYou ran out of chips!");
                    gameIsRunning = false;
                }
                else
                {
                    Console.WriteLine("\nWould you like to keep playing? (Y/N)");
                    wantsToPlay = (char)Console.Read();
                    Console.ReadLine();

                    if (!(wantsToPlay == 'Y' || wantsToPlay == 'y')) //checks if the user wants to keep playing
                    {
                        Console.WriteLine("You had " + playerChips + " chips remaining.");
                        gameIsRunning = false;
                    }
                }//end if   

            }//end while

            Console.WriteLine("Game over! Thanks for Playing!");
            Console.ReadLine();

        }//end main


    }
}//end program
