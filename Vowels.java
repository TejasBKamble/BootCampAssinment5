package Day5Assinment;

import java.util.Arrays;
import java.util.Scanner;

public class Vowels {
	// A function that takes a string as input and returns a two-dimensional array
	// The array stores the number of vowels and their frequencies
	// The array has 6 rows and 2 columns
	// The first row stores the total number of vowels
	// The other rows store the number of each vowel in the order of a, e, i, o, u
	// For example, if the input is "hello", the output is {{2, 0}, {1, 0}, {0, 0}, {1, 0}, {0, 0}, {0, 1}}
	
	public static int[][] countVowels(String input) 
	{

		input = input.toLowerCase();

	  int[][] result = new int[6][2];

	  for (int i = 0; i < input.length(); i++) {

		  char c = input.charAt(i);

	    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

	    	result[0][0]++; //count Vowels
	   
	      
	      switch (c) {
	        case 'a':
	          result[1][0]++;
	          result[1][1] = 0;
	          break;
	        case 'e':
	          result[2][0]++;
	          result[2][1] = 1;
	          break;
	        case 'i':
	          result[3][0]++;
	          result[3][1] = 2;
	          break;
	        case 'o':
	          result[4][0]++;
	          result[4][1] = 3;
	          break;
	        case 'u':
	          result[5][0]++;
	          result[5][1] = 4;
	          break;
	      }
	    }
	  }
	  // Return the array
	  return result;
	}



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Please enter a sentence:");
		  
		  String sentence = scanner.nextLine();
		  
		  scanner.close();
		  
		  int[][] result = countVowels(sentence);
		  
		  System.out.println("The result is:");
		  
		  for (int i = 0; i < result.length; i++) {
		    System.out.println(Arrays.toString(result[i]));
		  }

	}

}
