package Day5Assinment;

public class DecimaltoRoman {

	public static String decimalToRoman(int number) {

		int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

		String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

		String result = "";

		for (int i = 0; i < decimalValues.length; i++)
		{
		    while (number >= decimalValues[i]) {
		      number -= decimalValues[i];
		      // Append the corresponding roman symbol to the result
		      result += romanSymbols[i];
		    }
		  }
		  return result;
		}
	
	public static void main(String[] args) 
	{
		
		int[] numbers = {1, 5, 10, 15, 20, 25, 50, 75, 100, 150, 200, 250, 500, 750, 1000, 1500, 2000, 2500, 3000, 3999};
		
		  System.out.println("The decimal and roman numbers are:");
		  
		  for (int i = 0; i < numbers.length; i++)
		  {
		    int number = numbers[i];
		    String roman = decimalToRoman(number);
		    System.out.println(number + " -> " + roman);
	     }

   }
}
