package superkeyword;

public class Superchild_Method extends SuperParent_Method{

	public void display2() {
		super.display();
		System.out.println("This is from display2 method in superchild class");
		super.display();
		System.out.println(this.product(10, 3));
		
		String clr = super.color("red");
		System.out.println("color is: " + clr);
	}
	public int product(int num3, int num4) {
	
		super.show();
		int pdt = num3 * num4;
		return pdt;
		
	}
	
	public void justsuper() {
		this.display2();
		super.display();
		super.show(); 
		System.out.println(super.color("Green"));
	}
		
	public static void main(String[] args) {
		
		Superchild_Method obj = new Superchild_Method();
		
			//obj.display();
			//obj.display2();
			//obj.product(5, 6);
			obj.justsuper();
	}

}
