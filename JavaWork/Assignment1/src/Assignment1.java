/*
Joseph Steiger
5/29/2020
Version 1

//This program allows the user to check the parity of a number, see what time it would be after x number of minutes passes, find side c in the pythagorean theorem, have a random quote displayed to them, or just exit the program.

Psuedocode: Ask the user which option they would like to use
            Assign input to choice variable
            if choice == 1
                check if the number input is odd or even
                    if input % 2 == 0, is even, else odd
            if choice == 2
                determine what time it will be after x minutes passes based on user input of current hour, minute, and minutes passed
                    if minutes rolls over time, change hour and minutes accordingly
            if choice == 3 
                calcualte side c in the pythagorean theorem by using Math.pow and Math.sqrt - user inputs a and b
            if choice == 4 
                display a quote picked by a random number generator
            if choice == 5 
                exit program with goodbye message
            else tell the user they input a wrong option

*/
import java.util.Scanner; //scanner class import
public class Assignment1 {

    public static void main(String[] args) {
    
    //variable declarations
    Scanner input = new Scanner(System.in);
    int choice;
    
    //getting user input to determine what they wish to do
    System.out.println("Which function would you like to utilize? \n 1. Parity Checker \n 2. Clock Math \n 3. Pythagorean Theorem Calculator \n 4. Quote Generator \n 5. Quit");
    choice = input.nextInt();

    if (choice == 1){ //parity checker
        double parityCheck;
        System.out.println("Enter the number you wish to check the parity of: "); //user inputs number they wish to check
        parityCheck = input.nextDouble();
        if ((int)parityCheck % 2 == 0) //if else statement to determine if the number is odd or even
            System.out.println(parityCheck + " is even");
        else 
            System.out.println(parityCheck + " is odd");  
    }

    else if (choice == 2){ //clock math
        int hour, minute, minutesPassed, newMinute, newHour; //variables
        //user input
        System.out.println("Enter the hour: ");
        hour = input.nextInt();
        System.out.println("Enter the minute: ");
        minute = input.nextInt();
        System.out.println("How many minutes have passed: ");
        minutesPassed = input.nextInt();

        newMinute = minute + minutesPassed; 

        if (newMinute > 59){ //if the newMinute is over 59, then the hour must increase 
            newHour = hour + (newMinute / 60); //determines how many new hours to add 

            if (newHour > 12){ //if the hours are over 12, this statement rolls the time over accordingly
                newHour = newHour % 12;
            }

            newMinute = newMinute % 60; //this finds the correct newMinute by removing possible hours
        }
        else 
            newHour = hour; //assigns a value to new hour for the outputs

        System.out.println("The time was " + hour + ":" + minute);

        if (newMinute < 10){ //if else statement to correct place a 0 in the new time
            System.out.println("After " + minutesPassed + " minutes have passed, the new time is " + newHour + ":0" + newMinute);
        }
        else 
            System.out.println("After " + minutesPassed + " minutes have passed, the new time is " + newHour + ":" + newMinute);

    }
    else if (choice == 3){ //pythagorean theorem
        double a, b, c; //variables
        System.out.println("Enter sides a and b: "); //user input
        a = input.nextDouble();
        b = input.nextDouble();

        a = Math.pow(a, 2); //finds a squared
        b = Math.pow(b, 2); //finds b squards
        c = Math.sqrt(a + b); //finds the value of c, which would be sqrt(a^2 + b^2)

        System.out.println("Side c is " + (int)(c*100)/100.0); //prints the c value - note double was used because a and b don't have to be whole numbers

    }
    else if (choice == 4){ //quote generator
        int randNum = (int)(Math.random()*10)+1; //random number generator from 1-11 exclusive

        switch (randNum){ //switch statement was used because it's cleaner for a simple singly digit number from a random generator than if-else statements
            case 1: System.out.println("Don't wait, The time will never be just right. - Napoleon Hill"); break;
            case 2: System.out.println("Many of life's failures are people who did not realize how close they were to success when they gave up. - Thomas Eddison"); break;
            case 3: System.out.println("The distance is nothing; it's only the first step that is difficult. - Marquise du Deffand"); break;
            case 4: System.out.println("Happiness is not a goal; it is a by-product - Eleanor Roosevelt"); break;
            case 5: System.out.println("Live as if you were to die tomorrow. Learn as if you were to live forever - Mahatma Gandhi"); break;
            case 6: System.out.println("Our greatest glory is not in never falling, but in rising everytime we fall. - Confucius"); break;
            case 7: System.out.println("Try not to become a person of success, but rather try to become a person of value. - Albert Einstein"); break;
            case 8: System.out.println("Be yourself; everyone else is already taken. - Oscar Wilde"); break;
            case 9: System.out.println("Keep your face always toward the sunshine and shadows will fall behind you. - Walt Whitman"); break;
            case 10: System.out.println("Always do your best. What you plant now, you will harvest later. - Og Mandino"); break;
            default: System.out.println("Something went wrong"); break; //debugging line
        }

    }
    else if (choice == 5){ //exit choice
        System.out.println("Goodbye!");
    }
    else //user input error 
        System.out.println("That wasn't an option, sorry!");

    
    }
}