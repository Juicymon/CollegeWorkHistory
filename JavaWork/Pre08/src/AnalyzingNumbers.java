/*
 * Joseph Steiger
 * Version 1.0
 */

public class AnalyzingNumbers {
	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("ID001");
		
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		
		double[] numbers = new double[n]; //array declaration and initialization
		double sum = 0;
		
		//populating values of the array
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum+= numbers[i];
		}
		
		double average = sum / n; //finds average
		
		int count = 0;
		for (int i = 0; i < n; i++) //counts numbers above average
			if (numbers[i] > average) 
				count++;
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above average is " + count);

	}

}
