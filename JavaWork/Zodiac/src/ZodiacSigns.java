/*
 * Joseph Steiger
 * 5/26/2020
 * 
 * This program determines a users Zodiac sign based on their input birth month and day.
 * 
 * Psuedocode: Ask user for input of birth month
 * 			   Assign value to month 
 * 			   Ask user for input of birth day
 * 			   Assign value to day
 * 			   if user born from Jan 20 - Feb 18 - Aquarius
 * 			   If user born from Feb 19 - March 20 - Pisces
 * 			   If user born from March 21 - April 19 - Aries
 * 		       If user born from April 20 - May 20 - Taurus
 * 	    	   If user born from May 21 - June 20 - Gemini
 *             If user born from June 21 - July 22 - Cancer
 *             If user born from July 23 - August 22 - Leo
 *             If user born from August 23 - September 22 - Virgo
 *             If user born from September 23 - October 22 - Libra
 *             If user born from October 23 - November 21 - Scorpio
 *             If user born from November 22 - December 21 - Sagittarius
 *             If user born from December 22 - 19 - Capricorn
 *             Generate a random number for month
 *             Assign this to randomMonth
 *             Generate a random number for day
 *             Assign this to randomDay
 *             Repeat If statements from above for random number
 *             Output info
 */
import java.util.Scanner;
public class ZodiacSigns {

	public static void main(String[] args) {
		System.out.println("ID003");
		//variable declarations 
		int month, day;
		Scanner input = new Scanner(System.in);
		//User input
		System.out.println("Enter the month you were born: ");
		month = input.nextInt();
		System.out.println("Enter the day you were born: ");
		day = input.nextInt();
		
		//if else statements for user input, each statement if statement has a criteria that must be met
		if ((month == 1 && day > 19) || (month == 2 && day <= 18)) {
			System.out.println("Your Zodiac sign is Aquarius! Aquarius' are deep thinkers and highly intellecutal people who love helping others.");
		}
		else if ((month == 2 && day > 18) || (month == 3 && day <= 20)) {
			System.out.println("Your Zodiac sign is Pisces! Pisces' are selfless and always willing to help others.");
		}
		else if ((month == 3 && day > 20) || (month == 4 && day <= 19)) {
			System.out.println("Your Zodiac sign is Aries! Aries' have exceptional organizational skills.");
		}
		else if ((month == 4 && day > 19) || (month == 5 && day <= 20)) {
			System.out.println("Your Zodiac sign is Taurus! Taurus' are practical and well grounded.");
		}
		else if ((month == 5 && day > 20) || (month == 6 && day <= 20)) {
			System.out.println("Your Zodiac sign is Gemini! Gemini's are expressive and quick witted.");
		}
		else if ((month == 6 && day > 20) || (month == 7 && day <= 22)) {
			System.out.println("Your Zodiac sign is Cancer! Cancers are usually deeply intuitive and sentimental. They can be very emotional and senstive");
		}
		else if ((month == 7 && day > 22) || (month == 8 && day <= 22)) {
			System.out.println("Your Zodiac sign is Leo! Leo's are natural born leaders. They are dramatic, creative, and confident.");
		}
		else if ((month == 8 && day > 22) || (month == 9 && day <= 22)) {
			System.out.println("Your Zodiac sign is Virgo! Virgo's are always paying attention to the smallest details and have a deep sense of humanity.");
		}
		else if ((month == 9 && day > 22) || (month == 10 && day <= 22)) {
			System.out.println("Your Zodiac sign is Libra! Libra's are peaceful, fair, and they hate being alone.");
		}
		else if ((month == 10 && day > 22) || (month == 11 && day <= 21)) {
			System.out.println("Your Zodiac sign is Scorpio! Scorpio's are passionate, determined, decisive, and well researched people.");
		}
		else if ((month == 11 && day > 21) || (month == 12 && day <= 21)) {
			System.out.println("Your Zodiac sign is Sagittarius! Sagittarius' are curious and energetic, often being travelers.");
		}
		else if ((month == 12 && day > 21) || (month == 1 && day <= 19)) {
			System.out.println("Your Zodiac sign is Capricorn! Capricorn's often have an inner state of indepenence, mastering self control.");
		}
		else 
			System.out.println("That wasn't a correct month or day");
		
		//random number generators
		int randomMonth = (int)(Math.random()*(12-1+1))+1;
		int randomDay = (int)(Math.random()*(31-1+1))+1;
		
		System.out.println("Generating random month and day: " + randomMonth + " " + randomDay);
		
		//if else statements for the random sign chosen, the same as the above but with changed variables used
		if ((randomMonth == 1 && randomDay > 19) || (randomMonth == 2 && randomDay <= 18)) {
			System.out.println("The random Zodiac sign is Aquarius! Aquarius' are deep thinkers and highly intellecutal people who love helping others.");
		}
		else if ((randomMonth == 2 && randomDay > 18) || (randomMonth == 3 && randomDay <= 20)) {
			System.out.println("The random Zodiac sign is Pisces! Pisces' are selfless and always willing to help others.");
		}
		else if ((randomMonth == 3 && randomDay > 20) || (randomMonth == 4 && randomDay <= 19)) {
			System.out.println("The random Zodiac sign is Aries! Aries' have exceptional organizational skills.");
		}
		else if ((randomMonth == 4 && randomDay > 19) || (randomMonth == 5 && randomDay <= 20)) {
			System.out.println("The random Zodiac sign is Taurus! Taurus' are practical and well grounded.");
		}
		else if ((randomMonth == 5 && randomDay > 20) || (randomMonth == 6 && randomDay <= 20)) {
			System.out.println("The random Zodiac sign is Gemini! Gemini's are expressive and quick witted.");
		}
		else if ((randomMonth == 6 && randomDay > 20) || (randomMonth == 7 && randomDay <= 22)) {
			System.out.println("The random Zodiac sign is Cancer! Cancers are usually deeply intuitive and sentimental. They can be very emotional and senstive");
		}
		else if ((randomMonth == 7 && randomDay > 22) || (randomMonth == 8 && randomDay <= 22)) {
			System.out.println("The random Zodiac sign is Leo! Leo's are natural born leaders. They are dramatic, creative, and confident.");
		}
		else if ((randomMonth == 8 && randomDay > 22) || (randomMonth == 9 && randomDay <= 22)) {
			System.out.println("The random Zodiac sign is Virgo! Virgo's are always paying attention to the smallest details and have a deep sense of humanity.");
		}
		else if ((randomMonth == 9 && randomDay > 22) || (randomMonth == 10 && randomDay <= 22)) {
			System.out.println("The random Zodiac sign is Libra! Libra's are peaceful, fair, and they hate being alone.");
		}
		else if ((randomMonth == 10 && randomDay > 22) || (randomMonth == 11 && randomDay <= 21)) {
			System.out.println("The random Zodiac sign is Scorpio! Scorpio's are passionate, determined, decisive, and well researched people.");
		}
		else if ((randomMonth == 11 && randomDay > 21) || (randomMonth == 12 && randomDay <= 21)) {
			System.out.println("The random Zodiac sign is Sagittarius! Sagittarius' are curious and energetic, often being travelers.");
		}
		else if ((randomMonth == 12 && randomDay > 21) || (randomMonth == 1 && randomDay <= 19)) {
			System.out.println("The random Zodiac sign is Capricorn! Capricorn's often have an inner state of indepenence, mastering self control.");
		}
		else 
			System.out.println("No random month or day chosen.");
		
	}
}
