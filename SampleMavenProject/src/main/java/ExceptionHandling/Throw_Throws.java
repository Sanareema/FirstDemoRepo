package ExceptionHandling;

public class Throw_Throws {

	public static void main(String[] args) {
		
		int age = 17;
		
		if(age>=18) {
			System.out.println("above 18 is eligible for voting");
		}else {
				throw new ArithmeticException ("Below 18 years of age not eligible for voting");
			}
		}

	}


