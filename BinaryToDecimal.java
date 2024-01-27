package Day5Assinment;

import java.util.Scanner;

public class BinaryToDecimal {

	public static int cnvrtBin2Dec(String binary) {
		  // Use the built-in method Integer.parseInt() with radix 2
		  return Integer.parseInt(binary, 2);
		}

		// b. A function that takes a decimal number and returns a string of binary digits
		public static String cnvrtDec2Bin(int decimal) {
		  // Use the built-in method Integer.toBinaryString()
		  return Integer.toBinaryString(decimal);
		}

		// c. A function that compares two strings and returns true if they are equal, false otherwise
		public static boolean compareBinaryDigits(String s1, String s2) {
		  // Use the built-in method String.equals()
		  return s1.equals(s2);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		  // Prompt the user to enter a binary number
		  System.out.println("Please enter a binary number:");
		  // Read the binary number as a string
		  String binary = scanner.nextLine();
		  // Close the scanner
		  scanner.close();
		  // Call the cnvrtBin2Dec function and store the result
		  int decimal = cnvrtBin2Dec(binary);
		  // Call the cnvrtDec2Bin function and store the result
		  String binary2 = cnvrtDec2Bin(decimal);
		  // Call the compareBinaryDigits function and store the result
		  boolean comparison = compareBinaryDigits(binary, binary2);
		  // Print the results
		  System.out.println("The decimal equivalent of " + binary + " is " + decimal);
		  System.out.println("The binary equivalent of " + decimal + " is " + binary2);
		  System.out.println("The comparison result is " + comparison);
		  // If the comparison result is true, the logics are fine
		  if (comparison) {
		    System.out.println("The logics developed are fine.");
		  }
		
	}

}
