package oops_inheritance;
//simple
public class Dog extends Animal {
	
	public void bark() {
		System.out.println("Dogs bark");
	}
	public static void main(String[] args) {
		
		Dog objdog = new Dog();
		objdog.bark();
		objdog.animal();
	}

}
