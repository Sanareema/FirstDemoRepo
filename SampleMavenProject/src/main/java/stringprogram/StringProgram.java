package stringprogram;

public class StringProgram {

	public static void main(String[] args) {
		
		String s1 = "hi string literal";
		String s2 = "hi string literal";
		String color = "YELLOW";
		String name = "";
		String season= "Winter";
		
		String email = "learnjava@gmail.com";
		
		String s3 = new String("java");
		String s4 = new String("java");
		String s5 = new String("Java");
		String s8 = "Java";
		String s9 = "Java";
		
		String s6 = "Hi";
		String s7 = "  Good Morning  ";
		
		String kw= new String("Java Learning");
		System.out.println("Printing the string using the new keyword method: " + kw);
		System.out.println("Printing the string using the string literal method: " + s1 + "\n" + s2);
		
		// using "length method" : used for length or size of the string - length()
		System.out.println("Length of the string stored in kw varaible: " + kw.length());
		
		// using "charAt method" : used to return the character of the string based on the index position - charAt(give index position)
		System.out.println("Character at the mentioned index position of the string stored in kw: " + kw.charAt(2));
		
		// using "concat method" : used to combine two string or adding a new string at the end of an existing string - 
		System.out.println(s6.concat(color));
		System.out.println(s6.concat(" ").concat(color));
		System.out.println(s6); // checking string immutability property after concatenation process. Here s6 should be the original word
		
		// contains() - to check if a character or word is present in a string. Returns "true" or "false"
		System.out.println(kw.contains("g")); // returns true
		System.out.println(kw.contains("G")); // returns false
		
		// toUpperCase() - to convert lower case to upper case
		System.out.println(kw.toUpperCase());
		System.out.println(s2.toUpperCase());
		
		// toLowerCase() - to convert upper case to lower case
		System.out.println(color.toLowerCase());
		
		// isEmpty() - check if the string is empty or not  - returns true or false
		System.out.println("isEmpty method: " + color.isEmpty()); // here returns false
		System.out.println("isEmpty method: " + name.isEmpty()); // here returns true
		
		// equals() - to compare if two strings are equal - checks for content including case sensitivity and returns true if satisfies or either is wrong returns false.
		System.out.println("equals method: " + s4.equals(s3)); // returns true - java & java
		System.out.println("equals method: " + s4.equals(s5)); // returns false - java & Java 
		System.out.println("equals method: " + s5.equals(s8)); // true as content is same even if way is different
		
	    // == to compare the object reference, meaning if two variables point to the same 
		
		System.out.println(s3==s4); /* returns false(being object) even if java & java are same. s3, s4 stored in heap memory(used 'new' keyword). 
		== operator performs reference comparison(being objects), checking if two variables point to same locs- in this case not same as objects are not stored in same location even if content is same*/
		System.out.println("Equal operator way: " + s5==s8); // returns false . string in double quotes not printed because of operator precedence rule as + comes before ==
		System.out.println("word stored in s8: " + s8);
		System.out.println("word stored in s9: " + s9);
		System.out.println(s8==s9); //returns true as s8, s9 both are created in string literal way and content are same
		
		//equalsIgnoreCase() - to compare if two strings are equal ignoring the case
		System.out.println("equalsIgnoreCase method: " + s4.equalsIgnoreCase(s5)); // returns true as it ignores case - java & Java returns true
		System.out.println("eqigncase returning faalse value: " + s4.equalsIgnoreCase(s6));
			
	    //trim() - to remove leading and trailing space
		
		System.out.println(s7.trim());
		
	  //substring - to extract a part of the string
		System.out.println("Substring with given starting index: " + color.substring(3)); // from 3rd index position
		System.out.println(color.substring(1)); // from 1st index position
		System.out.println(color.substring(1, 4)); // given beginning and ending index. Stops before given ending index
		System.out.println(season.substring(0, 4)); // given beginning and ending index. Stops before given ending index
		String username = email.substring(0, email.indexOf('@'));
		String domain = email.substring(email.indexOf('@')+1); // + 1 to skip @ sign from domain name and move to next character
		System.out.println("Username: " + username);
		System.out.println("Domain name: " + domain);
		
	 // indexOf() - to find index position
		System.out.println(season.indexOf("r"));
		
     // lastIndexOf()
		System.out.println(color.lastIndexOf("L"));
	}

}
