package ExceptionHandling;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		// ArithmeticException
		
		try{
		int num1 = 50;
		int num2 = 0; 
		int div = num1/num2;
		System.out.println(div); 
		}
		
		catch(ArithmeticException ae){
			
			System.out.println("Arithmetic Exception Handled");
		}
		
		finally {
			
			System.out.println("Important code inside finally block is executed");
		}
		
			System.out.println("Hello");
		
		//ArrayIndexOutOfBoundException
			try{
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[5]); 
			}
			catch(Exception e) {
				
				System.out.println("ArrayIndexOutOfboundException. handled in catch block");
			}
		
		// NullPointerException
				
				try{
				String val = null;
				System.out.println(val.length());
				}
				
				catch(Exception e) {
					System.out.println("NullPointerException. Handled inside catch block");
				}
	}

}
