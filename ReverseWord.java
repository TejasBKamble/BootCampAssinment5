package Day5Assinment;

import java.util.Scanner;

public class ReverseWord {

	 public static String reverseWords(String str)
	 {
		    String[] words = str.split("\\s+");
		    StringBuilder sb = new StringBuilder();
		    
		    for (int i = words.length - 1; i >= 0; i--) 
		    {
		                                                       
		      sb.append(new StringBuilder(words[i]).reverse()); // Reverse each word and append it to the result
		      
		      if (i > 0) 
		      {
		        sb.append(" ");
		      }
		    }
		    return sb.toString();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a sentence:");
	    String sentence = sc.nextLine();

	    String result = reverseWords(sentence);
	    System.out.println("The result is: " + result);

	    sc.close();
	}

}
