package Day5Assinment;

import java.util.Scanner;

public class ExtractWords {
	public static String[] extractWords(String sentence) {
		  // Use the split() method to get the words from the sentence
		  // The split() method takes a regular expression as a parameter
		  // The regular expression "\\s+" means one or more whitespace characters
		  // The split() method returns an array of strings
		  return sentence.split("\\s+");
		}

	public static void main(String[] args)
	{

		 Scanner scanner = new Scanner(System.in);
		  // Prompt the user to enter a sentence
		  System.out.println("Please enter a sentence:");
		  // Read the sentence
		  String sentence = scanner.nextLine();
		  // Close the scanner
		  scanner.close();
		  // Call the extractWords function and store the result
		  String[] words = extractWords(sentence);
		  // Print the result
		  System.out.println("The words in the sentence are:");
		  // Loop through the words array
		  for (int i = 0; i < words.length; i++) {
		    // Print the word
		    System.out.println(words[i]);
		  }
	}

}
