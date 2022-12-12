import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{
		int ch=0;
		  System.out.println("Welcome to world of Math Functions!!!");
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter 1st number : ");
		  int first = scan.nextInt();
		  System.out.println("Enter 2nd number : ");
		  int second = scan.nextInt();
		  
		  System.out.println("What would you like to do with those numbers?\nMenu \n");
		  System.out.println("1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Square"); //Missing option to square
		  ch = scan.nextInt(); //Missing line to store user input
		  
		  switch (ch)
		  {
		  case 1 : 
		   
			  System.out.println(add(first,second));
		   
		   break;
		  case 2:
			  System.out.println(subtract(first,second)); 
		   
		   break;
		  case 3:
			  System.out.println(multiply(first, second)); 
		   
		   break;
		  case 4: 
			  System.out.println(division(first, second));  
		   
		   break;
		  default :
			  System.out.println(square(first)); 
		   
		   break;
		  }
	}
	
	private static int add(int a, int b) //This method will add integers a and b
	{
		return a + b; //line was missing + b
	}
	
	private static int subtract(int a, int b)
	{
		return a - b; //It returns the subtraction of a and b.
	}
	
	private static int multiply(int a, int b) //this line had a syntax error, it failed to declare b as an int
	{
		return a * b;
	}
	
	private static double division(double a, double b)
	{
		return a / b; 
	}
	
	private static double square(double a) //variable was declared as an int
	{
		return Math.pow(a, 2);
	}
	
	//ADD NECESSARY STAEMENTS IN THE MENU AND IN THE SWITCH STATEMENT TO MAKE SURE THE PROGRAM WORKS CORRECTLY.
}
