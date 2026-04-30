package methodoverriding;

import java.lang.foreign.AddressLayout;

public class ParentMOverride {
	
	public void display() {
		
		System.out.println(" this is a parent method");
	}
	
	public int sum(int a, int b) {
		
		int sum = a+b;
		return sum;
		
	}
	public void add(int a, int b) {
		 int total = a+b;
		 System.out.println("total: " + total);
	}
}
