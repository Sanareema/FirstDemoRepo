package oops_interface;

public interface InterfaceParent1 {

		public abstract void sum();
		
		public static final int num1 = 10; // this is declared and intialised as constant, cannot be changed
		
		int num2 = 20;
		
		public static void display1() {
			
			System.out.println("print test");
		}
		
		default void display2() {
			
			System.out.println("Print numbers: " + num1+ " " + num2);
			
			//num2 = 30; // considered automatically as final.
			}
}
