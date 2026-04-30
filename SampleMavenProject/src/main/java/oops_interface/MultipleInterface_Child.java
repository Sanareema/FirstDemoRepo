package oops_interface;

public class MultipleInterface_Child implements MultipleInterface_Par1, MultipleInterface_Par2{

	public static void main(String[] args) {
		
		MultipleInterface_Child obj = new MultipleInterface_Child();
		
		obj.display();
		obj.test();
		obj.show(); 
	}

	@Override
	public void test() {
		System.out.println("printing from test method in parent 2");
		
	}

	@Override
	public void display() {
		
		System.out.println("printing from display method in parent 1");
	}

	@Override //only one override in the implementing class, for two parents with exact same abstract method name 
	public void show() {
		
		System.out.println("printing from show method in parent1 and parent2"); 
	}
	
	
}
