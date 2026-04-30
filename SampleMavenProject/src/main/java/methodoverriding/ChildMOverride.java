package methodoverriding;

public class ChildMOverride extends ParentMOverride {
	
	public void display() {
		super.display();
		System.out.println(" this is child");
	}
public int sum(int a, int b) {
	
		this.add(1, 2);
		System.out.println(super.sum(3, 4));
		int sum = a+b;
		return sum;
		
	}

	public static void main(String[] args) {
		
		ChildMOverride obj = new ChildMOverride();
		obj.display();
		System.out.println(obj.sum(10, 5));
		obj.add(20,30);

	}
	@Override
	public void add(int a, int b) {
		
		super.add(a, b);
	}

}
