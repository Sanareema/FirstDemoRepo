package ExceptionHandling;

public class CustomException {

	public static void main(String[] args) throws MyException {
		
		int age = 17;
		
		if(age>=18) {
			System.out.println("above 18 is eligible for voting");
		}else {
				throw new MyException ("Below 18 years of age not eligible for voting");
		}
	}
}


