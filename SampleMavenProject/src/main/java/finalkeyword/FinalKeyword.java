package finalkeyword;

public class FinalKeyword {
	
	public final void finalMethod() {
		
		System.out.println("this is in finalMethod");
	}

	public static void main(String[] args) {
		
		final int num = 5;
		
		//num = 7; num already declared as 'final'. So, not changeable.
		
		System.out.println(num);
		
	}

}
