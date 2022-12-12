/*
 * Joseph Steiger
 * 6/11/20
 * 
 * Scope is important based on the usage a variable has. Things declared in a method are local, and thus can only be used inside that method. 
 * When calling a method with arguments, the value of the argument goes to the parameter, and thus it must be declared in a way that the method can receive it.
 */
public class TestPassByValue {
	
	/** Main Method */

	public static void main(String[] args) {
		System.out.println("ID002");
		//variable declarations 
		int num1 = 1;
		int num2 = 2;
		
		System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
		
		//Invoke the swap method to attempt to swap two variables
		swap(num1, num2);
		
		System.out.println("After invoking the method, num1 is " + num1 + " and num2 is " + num2);

	}
	
	/** Swap two Variables */ 
	
	public static void swap (int n1, int n2) {
		System.out.println("\t Inside the swap method");
		System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
		
		//swap n1 and n2
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
	}

}
