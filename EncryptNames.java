package Day5Assinment;

public class EncryptNames
{
	//names = {"Tejas Kamble", "Nikhil Pathak", "Sabir Shake", "Salman Khan", "Joni Liver"};
	
	public static String[] encryptNames(String[] names) 
	{
		  String[] encryptedNames = new String[names.length];
		  
		  for (int i = 0; i < names.length; i++)
		  {

			  String name = names[i];  //names = "Tejas Kamble"

		    String[] parts = name.split(" ");
		    String firstName = parts[0]; //Tejas
		    String lastName = parts[1];  // Kamble
		    
		    String encryptedFirstName = "";
		    
		    for (int j = 0; j < firstName.length(); j++) 
		    {

		    	char c = firstName.charAt(j); // Select a Single Character from String

		    	if (c >= 'A' && c <= 'Z')
		        {    
		        c = (char) ((c - 'A' + 1) % 26 + 'A');
		        }
		      else if (c >= 'a' && c <= 'z') 
		      {
		        // Shift it by one position
		        c = (char) ((c - 'a' + 1) % 26 + 'a');
		      }

		      encryptedFirstName += c;
		    }
		  
		    String encryptedLastName = "";
		    
		    for (int j = 0; j < lastName.length(); j++)
		    {
		      char c = lastName.charAt(j);
		      
		      if (c >= 'A' && c <= 'Z') 
		      {
		        // Shift it by one negative position
		        
		        c = (char) ((c - 'A' - 1 + 26) % 26 + 'A');
		      }
		      else if (c >= 'a' && c <= 'z') {
		      
		        c = (char) ((c - 'a' - 1 + 26) % 26 + 'a');
		      }
		      encryptedLastName += c;
		    }

		    String encryptedName = encryptedFirstName + " " + encryptedLastName;

		    encryptedNames[i] = encryptedName;
		  }

		  return encryptedNames;
		}
	//////////////////////////////////////////////////////////////////////////////////////// Decryption  //////////////////////////////

	public static String[] DecryptNames(String[] Enames) 
	{
		  String[] decryptedNames = new String[Enames.length];
		  
		  for (int i = 0; i < Enames.length; i++)
		  { 

			  String name = Enames[i];  //names = "Tejas Kamble"

		    String[] parts = name.split(" ");
		    String firstName = parts[0]; //Tejas
		    String lastName = parts[1];  // Kamble
		    
		    String decryptedFirstName = "";
		    
		    for (int j = 0; j < firstName.length(); j++) 
		    {

		    	char c = firstName.charAt(j); // Select a Single Character from String

		        if (c >= 'A' && c <= 'Z') 
			      {
			        // Shift it by one negative position
			        
			        c = (char) ((c - 'A' - 1 + 26) % 26 + 'A');
			      }
			      else if (c >= 'a' && c <= 'z')
			      {
			      
			        c = (char) ((c - 'a' - 1 + 26) % 26 + 'a');
			      }

		      decryptedFirstName += c;
		    }
		  
		    String decryptedLastName = "";
		    
		    for (int j = 0; j < lastName.length(); j++)
		    {
		      char c = lastName.charAt(j);
		      
		      if (c >= 'A' && c <= 'Z')
		        {    
		        c = (char) ((c - 'A' + 1) % 26 + 'A');
		        }
		      else if (c >= 'a' && c <= 'z') 
		      {
		        // Shift it by one position
		        c = (char) ((c - 'a' + 1) % 26 + 'a');
		      }
		      decryptedLastName += c;
		    }

		    String decryptedName = decryptedFirstName + " " + decryptedLastName;

		    decryptedNames[i] = decryptedName;
		  }

		  return decryptedNames;
		}
//////////////////////////////////////////////////////////////////////////////
	
	
	public static void main(String[] args)
	{
		String[] names = {"Tejas Kamble", "Nikhil Pathak", "Sabir Shake", "Salman Khan", "Joni Liver"};

		String[] encryptedNames = encryptNames(names);
		
		String[] DecryptNames = DecryptNames(encryptedNames);

		System.out.println("The encrypted names are:");
		
		  for (int i = 0; i < encryptedNames.length; i++)
		  {
		    System.out.println(encryptedNames[i]);
		  }
		  
		  System.out.println("The Decrypted names are:");
			
		  for (int i = 0; i < DecryptNames.length; i++)
		  {
		    System.out.println(DecryptNames[i]);
		  }
		  
		  

	}

}
