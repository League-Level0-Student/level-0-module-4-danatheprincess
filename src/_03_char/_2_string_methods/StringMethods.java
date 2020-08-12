package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String bee = "Some Other String";
		
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		//bee.charAt(0);
		System.out.println(bee.charAt(2));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		System.out.println(bee.length());
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
	
		for(int h = 0; h < bee.length(); h++){
			
			//System.out.println(h);
			System.out.println(bee.charAt(h));
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
		char targetChar = 'S';
		
		//Print the position of string i from bee String var.
		for(int k=0; k < bee.length(); k++) {
			
			//We need a conditional to only print out the index number for the targetChar.
			if(bee.charAt(k) == targetChar) {
				
				System.out.println("Target char resides at : " + k);
			
			}
			
			//System.out.println(k);
		}
		
		//bee.indexOf("i");
		//bee.contains("i");
		
	}
}


