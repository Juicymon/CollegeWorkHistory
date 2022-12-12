import java.util.Scanner;  //This line imports the Scanner class from library which allows you to use Scanner in this class

/**
 * This program is supposed to give a better understanding about the Lab 2. 
 * This program shows a sample program on how to calculate the area of a circle.
 * This part of the code is called Block Comments also known as JavaDoc Comments. 
 * It is a necessary and must part of the code because it helps others to understand your code. 
 * @author Devansh Desai
 * @version 1.0.1
 * @date 8/1/2016
 */
public class CommentingSample {
 
 /**
 * This is the no-args main method. 
 * This method allows your program to run in the console. This method will perform the code as the line goes and as per the execution.
 */
 public static void main(String[] args)  //This is the main method. You need this to run the program in the console.
 {
  //Declare variables at the top
  int radius;  //int only holds all the integer.
  double area; //double can hold the decimal values.
  final double PI = 3.14; //to write a constant value, you use the keyword final
                          //According to conventions, constants should be capitalized. 
  
  //the process
  radius = 12; //you can initialize radius to something already
  area = PI * radius * radius; //calculating the area
  System.out.println("The area of a circle with radius " + radius + " is : " + area); //Printing this to the user 
                                                   //print statements also helps in debugging the code sometimes
  
  //Adding a scanner
  Scanner scan = new Scanner(System.in); //A scanner that scans what the user inputs.
  System.out.println("Enter your choice for radius : ");
  radius = scan.nextInt(); //Scans the next integer that the user will input and assign that value to radius
  
  System.out.println("The area of a circle with radius " + radius + " is : " + area + " <--- Wrong because it is the area when radius is 12"); //Printing this to the user 
        //The Area did not update automatically. It is because the value of only radius was updated and not the Area
  
  area = PI * radius * radius; //calculating the area with user input radius
  System.out.println("The area of a circle with radius " + radius + " is : " + area + " <-- The value updated according to new radius");
 }
}
