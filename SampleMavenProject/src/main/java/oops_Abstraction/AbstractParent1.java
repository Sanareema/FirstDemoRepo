package oops_Abstraction;

public abstract class AbstractParent1 {
	
	//constructor
			AbstractParent1() {
				
				System.out.println("Parent constructor");
			}
	
	public abstract void sum();
	public abstract String details(String name);
	public abstract int age(int age);
	
	public void display() { // non abstract method inside abstract class
		
		System.out.println("this dispaly method is an instance method(non abstarct) inside an abstract class");
	}

}
