/*
Joseph Steiger
5/19/2020
This program converts kilometers into miles.

Psuedocode: declare a variable for kilometers.
            declare a variable for miles.
            prompt user for input of kilometers.
            assign that value to the kilometers variable. 
            initialize the miles variable with the conversion formula for kilometers -> miles. 
            output the miles to the user.  

*/
import java.util.Scanner; //importing scanner from java library to get input from user

public class PostLab_1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //creating scanner 
    System.out.println("ID001");
    
    //declaring variables
    double kilometers;
    double miles;

    //prompting user for input
    System.out.println("Enter the number of kilometers: ");
    kilometers = input.nextDouble();

    miles = (kilometers * 0.62137119); //converting kilometers to miles and assigning its value to the miles variable

    System.out.println(kilometers + " kilometers is " + miles + " miles."); //outputting the users miles from the original input

    }
}