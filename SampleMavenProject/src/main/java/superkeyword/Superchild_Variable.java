package superkeyword;

public class Superchild_Variable extends SuperParent_Variable {
		
		String color = "Blue";
		
	public void dispaly() {
		System.out.println(super.color); // parent class variable
		System.out.println(color); // current class variable
	}

	public static void main(String[] args) {
		
		Superchild_Variable obj = new Superchild_Variable();
		System.out.println(obj.color);
		obj.dispaly();
		
	}

}
