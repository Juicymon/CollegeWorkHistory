
import java.util.Scanner;
public class Activity6_1_B {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		  
		  
		  int choice = displayMenu(0);
		  
		  while (choice != 6) { //while loop to allow user to keep using program
		  	
		     if(choice == 1){ //if else chain to call the correct methods
		       System.out.print("Enter two numbers to add: ");
		       int num1 = scan.nextInt();
		       int num2 = scan.nextInt();
		       System.out.println("Sum = " + add(num1, num2));
		     }
		     else if (choice == 2) {
		    	 System.out.println("Enter 2 integers to subtract: ");
		    	 int num1 = scan.nextInt();
		    	 int num2 = scan.nextInt();
		    	 System.out.println("Difference = " + subtract(num1, num2));
		     }
		     else if (choice == 3) {
		    	 System.out.println("Enter 2 doubles to subtract: ");
		    	 double num1 = scan.nextDouble();
		    	 double num2 = scan.nextDouble();
		    	 System.out.println("Difference = " + subtract(num1, num2));
		     }
		     else if (choice == 4) {
		    	 System.out.println("Enter 2 numbers to multiply: ");
		    	 double num1 = scan.nextDouble();
		    	 double num2 = scan.nextDouble();
		    	 System.out.println("Difference = " + multiplication(num1, num2));
		     }
		     else if (choice == 5) {
		    	 System.out.println("Enter 2 numbers to divide: ");
		    	 double num1 = scan.nextDouble();
		    	 double num2 = scan.nextDouble();
		    	 System.out.println("Difference = " + division(num1, num2));
		     }
		     
		     choice = displayMenu(0);
		  } // end loop
		  
		  System.out.println("\nGoodbye!\n");
		  
		  } //end main method

		  public static int displayMenu(int choice){ //menu method
		
			Scanner scan = new Scanner(System.in);
			boolean correctChoice = false;
			
			//while loop to keep looping until user picks valid option
			while (correctChoice == false) {
		    System.out.println("1. Add");
		    System.out.println("2. Subtract");
		    System.out.println("3. Subtract with doubles");
		    System.out.println("4. Multiple");
		    System.out.println("5. Divide");
		    System.out.println("6. Quit");
		    System.out.print("Enter your choice: ");
		    choice = scan.nextInt();
		    
		    //if else statement to validate user input
		    if (choice > 6 || choice < 1) {
		    	System.out.println("That wasn't an option, try again!\n");
		    }
		    else {
		    	correctChoice = true;
		    } // end if else
		    
			} // end loop
		    return choice;
		     
		 } //end method

		 public static int add(int a, int b){ //addition method
		    int sum = a + b;
		    return sum;
		 }

		 public static int subtract(int a, int b){ //subtraction method for int
		    return a - b;
		 }

		 public static double subtract(double a, double b){ //subtraction method for double
			 
		    return a - b;

		 }
		 
		 public static double multiplication(double a, double b) { //multiplication method
			 return a * b;
		 }
		 
		 public static double division(double a, double b) { //division method
			 return a / b;
		 }


}
