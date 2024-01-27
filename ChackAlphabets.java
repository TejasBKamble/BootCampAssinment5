package Day5Assinment;

import java.util.Scanner;

public class ChackAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    // Prompt the user to enter a string
	    System.out.println("Please enter a string:");
	    // Read the string
	    String input = scanner.nextLine();
	    // Close the scanner
	    scanner.close();
	    // Initialize the counters for alphabets, digits and special characters
	    int alphabets = 0;
	    int digits = 0;
	    int special = 0;
	    // Loop through each character in the input string
	    for (int i = 0; i < input.length(); i++) {
	      // Get the current character
	      char c = input.charAt(i);
	      // Check if it is an alphabet
	      if (Character.isLetter(c)) {
	        // Increment the alphabets counter
	        alphabets++;
	      }
	      // Check if it is a digit
	      else if (Character.isDigit(c)) {
	        // Increment the digits counter
	        digits++;
	      }
	      // Otherwise, it is a special character
	      else {
	        // Increment the special counter
	        special++;
	      }
	    }
	    // Print the results
	    System.out.println("The number of alphabets in the string is: " + alphabets);
	    System.out.println("The number of digits in the string is: " + digits);
	    System.out.println("The number of special characters in the string is: " + special);

	}

}
