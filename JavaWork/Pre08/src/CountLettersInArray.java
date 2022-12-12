/*
 * Joseph Steiger
 * Version 1.0
 */
public class CountLettersInArray {

	public static void main(String[] args) {
		System.out.println("ID003");
		
		//declare an create an array
		char[] chars = createArray();
		
		//display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);
		
		//count the occurrences of each letter
		int[] counts = countLetters(chars);
		
		//display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);

	}//end main
	
	//creates an array of characters
	public static char[] createArray() {
		
		//declare an array of characters and create it
		char[] chars = new char[100];
		
		//create lowercase letters randomly and assign them to the array
		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		return chars;
	}//end createArray method
	
	//display array of characters
	public static void displayArray(char[] chars) {
		//display characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) 
				System.out.println(chars[i]);
			else 
				System.out.print(chars[i] + " ");
				
		}
	}//end displayArray method
	
	//count occurrences of earch letter
	public static int[] countLetters(char [] chars) {
		//declare and create an array of 26 int
		int[] counts = new int[26];
		
		//for each lowercase letter in the array, count it
		for (int i = 0; i < chars.length; i++) 
			counts[chars[i] - 'a'] ++;
		
		return counts;
		
	}//end count letters method
	
	//display counts
	public static void displayCounts(int[] counts) {
		for(int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0) 
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			else {
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
			}
		}
	}

}
