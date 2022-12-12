import java.util.Arrays;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sting (enter \"Exit\" to quit): ");
		String userInput = input.nextLine();
		
		while (!(userInput.equals("Exit"))) {
			
		char[] array = userInput.toCharArray();
		
		for (char e : array) {
			System.out.print(e + " ");
		}//end for loop
		
		System.out.println();
		
		System.out.println(Arrays.toString(array));
		
		System.out.print("\nEnter a sting (enter \"Exit\" to quit): ");
		userInput = input.nextLine();
		
		}//end loop
		
		System.out.println("Goodbye");
	}

}
