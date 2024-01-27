package Day5Assinment;

import java.util.Scanner;

public class RemovalCharOrString {

	  public static String remove(String str, String toRemove) {
		    // Use the replace method to replace the char or substring with an empty string
		    return str.replace(toRemove, "");
		  }

		  public static void main(String[] args) 
		  {
		    Scanner sc = new Scanner(System.in);

		    System.out.println("Enter a sentence:");
		    String sentence = sc.nextLine();

		    System.out.println("Enter a char or substring to remove:");
		    String remove = sc.nextLine();

		    String result = remove(sentence, remove);
		    System.out.println("The result is: " + result);
		    
		    sc.close();
		  }
}
