package Day5Assinment;

import java.util.Scanner;

public class ReverseCase {
	
	public static String reverseCase(String str) {

		char[] chars = str.toCharArray();
		
		  for (int i = 0; i < chars.length; i++)
		  {
		    char c = chars[i];
		    if (Character.isUpperCase(c)) {

		    	chars[i] = Character.toLowerCase(c);
		    }
		    else if (Character.isLowerCase(c)) {

		    	chars[i] = Character.toUpperCase(c);
		    }
		  }
		  return new String(chars);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

		 System.out.println("Please enter a sentence:");

		  String sentence = sc.nextLine();

		  sc.close();

		  String result = reverseCase(sentence);

		  System.out.println("The result is: " + result);
	}

}
