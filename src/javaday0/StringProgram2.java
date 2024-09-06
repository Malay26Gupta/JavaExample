package javaday0;

public class StringProgram2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "A quick brown fox jumps over the lazy dog.";
		
		//get index of character 'd'
		int indexD = myString.indexOf('d');
		System.out.println("Index of d: "+ indexD);
		
		//Get the character at index twice the first instance of ‘w’.
		int indexOfW = myString.indexOf('w');
		char characterTwiceW = '\0';
		if(indexOfW != -1)
		{
			int indexTwiceW = indexOfW * 2;
			if(indexTwiceW < myString.length())
			{
				characterTwiceW = myString.charAt(indexTwiceW);
			}
		}
		System.out.println("Character at index twice first 'w' :" + characterTwiceW);
		//Get a substring from index 15 to 22.\
		System.out.println("Substring from index 15 to 22:" + myString.substring(15, 23));
		
		//Convert the string to Uppercase.
		System.out.println("Uppercase string: " + myString.toUpperCase());
		//Get the last index of character ‘u’
		
		//Append ‘in the night’ to the above string.
		String appendString = myString + " in the night.";
		System.out.println("New String: " + appendString);	
	}
}
