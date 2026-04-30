package oops_Abstraction;

public class AbstractChild1 extends AbstractParent1 {

	int num1, num2, total;
	// non param constructor
	
	private AbstractChild1() {
		super(); // calls parent constructor
		System.out.println("child constructor");

	}
	
	public static void main(String[] args) {
	//two ways we can call the sum() method. 1. create object of child class. cannot create object of parent class as it is "abstracted". 2. create reference of parent class in child class

		AbstractChild1 obj = new AbstractChild1();
		obj.sum();
		System.out.println(obj.details("Reema"));
		System.out.println(obj.age(10));
		obj.display(); // calling non abstract method in parent
		
		//creating child object with parent reference (as parent is abstract class) - interface also same concept
		AbstractParent1 obj1 = new AbstractChild1(); // child class is accessing abstract parent's methods via reference(obj1) of parent class
		
		obj.display();
		obj1.sum();
		
		//System.out.println(obj1.fruit("Apple")); not accessible, as obj1 is abstract parent's reference for accessing abstract parent methods/properties, not child methods/properties
		System.out.println(obj.fruit("Apple")); //accessible, as obj is child class object accessing child class methods/properties		
	}

	@Override
	public void sum() {
		num1 =10;
		num2 = 20;
		total =num1+num2; 
		System.out.println("Total: " +total);
	}

	@Override
	public String details(String name) {
		
		return name;
	}

	@Override
	public int age(int age) {
		
		return age;
	}
	
	public String fruit(String Apple) {
		
		return Apple;
	}
	
}