package oops_interface;

public class InterImplementClass implements InterfaceParent1{
	
	public static void main(String[] args) {
		InterImplementClass obj = new InterImplementClass();
		obj.sum();
		obj.display2();
		InterfaceParent1.display1(); // invoking using childclass object - interfacename.methodname
		
		InterfaceParent1 obj1 = new InterImplementClass(); // calling using interface reference
		obj.sum();
	}

	public void sum() {
		
		int num1 = 2;
		int num2 = 5;
		int total = num1+num2;
		System.out.println("Total: " + total);

	}
}
