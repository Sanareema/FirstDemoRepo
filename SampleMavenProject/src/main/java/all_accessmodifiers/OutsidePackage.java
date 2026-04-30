package all_accessmodifiers;

public class OutsidePackage extends All_AccessModifier{

	public static void main(String[] args) {
		
		OutsidePackage obj = new OutsidePackage();
		obj.defaultMethod();
		obj.protMethod();
		obj.publicMethod();
		// obj.privatMethod(); private method not visible outside class.
		
	}

}
