/*
 * Joseph Steiger
 * 5/20/2020
 * 
 * - Question Answer: To obtain the current second, minute, and hour, you must first declare a variable 
 * initialized with the value of the number of milliseconds since Jan 1, 1970. (System.currentTimeMillis()).
 * 
 * A new variable (totalSeconds) is to be declared that will represent the number of milliseconds as seconds, and its value is 
 * obtained by dividing the totalMilliseconds by 1000. 
 * 
 * Once the seconds since Jan 1, 1970, is obtained, the current second can be found by performing totalSeconds % 60, and setting this value
 * to the variable currentSecond. 
 * 
 * Then all you have to do is repeat this process for the minute and hour. 
 * 
 * Declare a variable for totalMinutes, divide totalSeconds by 60 to find totalMinutes value, then declare a new variable
 * currentMinute and assign it a value by using the formula totalMinutes % 60.
 * 
 * Declare a variable for totalHours, divide totalMinutes by 60 to find its value, then declare a new variable 
 * currentHour and assign its value by using the formula totalHours % 24.
 */

import java.util.Scanner;
public class ShowCurrentTime {

	public static void main(String[] args) {
		
	/*	System.out.println("ID001");
		
		//Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60; 
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;
		
		//display results
	System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

*/
		
	}
}
