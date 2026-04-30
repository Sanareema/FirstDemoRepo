package superkeyword;


public class Superchild_const extends SuperParent_const {
	
	public Superchild_const(){
		super(2,3);
		System.out.println("this is printing from child constructor");
		
	}
	
	public Superchild_const(int n3) {
		
		System.out.println("third number: " + n3);
	}
	
	public static void main(String[] args) {
		
		//Superchild_const obj1 = new Superchild_const(); // 'new' invokes constructor - no need of object creation here.
	//also checks if there is any method call as first statement, if none, it will auto invoke parent class non param constructor, if there is any
	// if parent has param constructor, we have to use object calling or super keyword in the child main/other methods	
		//SuperParent_const obj2 = new SuperParent_const(); // 'new' invokes constructor
		
		Superchild_const obj3 = new Superchild_const(5);	
	}

}

// param or non param constructor obj creation with 'new' keyword will invoke a non param constructor from parent class - check if true