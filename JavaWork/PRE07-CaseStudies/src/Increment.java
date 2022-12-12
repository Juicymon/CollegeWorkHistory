/*
 * Joseph Steiger
 * 6/11/20
 */
public class Increment {

	public static void main(String[] args) {
		System.out.println("ID001");
		
		int x = 1;
		
		System.out.println("Before the call, x is " + x);
		
		increment(x); //method call with x passed in 
		
		System.out.println("After the call, x is " + x);

	}
	
	public static void increment (int n) { //method is void, so no value will be returned
		n++;
		System.out.println("n inside the method is "+ n);
		//no return means x is unchanged
	}

}
