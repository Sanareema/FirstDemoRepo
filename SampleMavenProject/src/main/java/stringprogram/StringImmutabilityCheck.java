package stringprogram;

public class StringImmutabilityCheck {

	public static void main(String[] args) {
		
		String str = "Rain";
		System.out.println("String str has: " + str);
		
		String newstr = str;
		// String str = "Snow"; //String is immutable. Need to use StringBuffer or StringBuilder. Can't use 'str' again.

	}

}
