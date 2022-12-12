/*
 * Joseph Steiger
 * 6/18/2020
 * 
 * This program demonstrates the uses of arraylists and the file class
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class Activity74B {

	public static void main(String[] args) throws IOException {
		
		//file instance creating
		File file = new File("accounts.txt");
		
		if (file.exists()) { //checks if file was created correctly
			System.out.println("The file exists");
		}
		else
			file.createNewFile();
		
		Scanner inputScanner = new Scanner(System.in); //normal scanner object
		
		PrintWriter output = new PrintWriter(file); //printer to write to the file
		
		System.out.println("Would you like to enter a username and password? (Y/N)");
		char choice = inputScanner.next().charAt(0);
		
		//while the user want to enter usernames and passwords, this loop will allow them to do so
		while (choice != 'N') { //enter loop
			System.out.print("Enter the username: ");
			String usernameString = inputScanner.next();
			output.print(usernameString); //writes the username to the file
			System.out.print("Enter the password: ");
			String passwordString = inputScanner.next();
			output.println(" " + passwordString); //writes the password to the file
			
			System.out.println("Would you like to enter another username and password? (Y/N)");
			choice = inputScanner.next().charAt(0);
		} //end password loop
		output.close();
		
		System.out.println("Goodbye");
		
		
		//---------part2-------
		
		//two array lists
		ArrayList<String> usernames = new ArrayList<String>();
		ArrayList<String> passwords = new ArrayList<String>();
		
		Scanner readingFile = new Scanner(file); //scanner for the file 
		
		//reads through the file line by line and assigns the username and password to the arraylists
		while (readingFile.hasNext()) {
				usernames.add(readingFile.next());
				passwords.add(readingFile.next());
		}
		
		readingFile.close(); //closes scanner

		boolean loggedIn = false;
		
		while (loggedIn == false) { //loop continues until user logs in
		System.out.print("Enter a username to login: ");
		String username = inputScanner.next();
		
		if (usernames.contains(username)) { //if username array contains entered username, ask for password
			int indexOfUsername = usernames.indexOf(username);
			System.out.print("Enter the password for " + usernames.get(indexOfUsername) + ": "); 
			String password = inputScanner.next();
			
			if (passwords.get(indexOfUsername).equals(password)){ //the password for the username should be at the same index, thus entered password should equal password at indexofusername
				System.out.println("Success!");
				loggedIn = true;
			}
			else 
				System.out.println("Wrong password!");
			
		}
		else 
			System.out.println("Username not found!");
		} //while loop end
	}

}
