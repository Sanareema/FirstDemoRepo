package accessmodifier_outsidepackage;

import all_accessmodifiers.All_AccessModifier;

public class Outside_Package extends All_AccessModifier {

	public static void main(String[] args) {
		
		Outside_Package obj = new Outside_Package();
		obj.publicMethod();
		obj.protMethod();
		// outside package no access to private and default access modifiers
		
		All_AccessModifier obj1 = new All_AccessModifier();
		obj1.publicMethod(); // here parent class object can call only public access modifier. 
		// to call protected access modifiers we have to create child class object.
	
	}

}
