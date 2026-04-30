package all_accessmodifiers;

public class All_AccessModifier {
	
	public void publicMethod() {
		System.out.println("This is a public method");
	}
	
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	protected void protMethod() {
		System.out.println("This is a protected method");
	}
	void defaultMethod() {
		System.out.println("This is a default method");
	}

	public static void main(String[] args) {
		
		All_AccessModifier obj = new All_AccessModifier();
		
		obj.publicMethod();
		obj.privateMethod();
		obj.protMethod();
		obj.defaultMethod();
		
	}

}
