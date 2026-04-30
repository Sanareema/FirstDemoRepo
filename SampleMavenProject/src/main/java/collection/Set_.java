package collection;

import java.util.HashSet;
import java.util.Set;

public interface Set_ {
	
	public static void main(String[] args) {
		Set<String> name = new HashSet<String>();
		
		name.add("Rose");
		name.add("Lilly");
		name.add("Jasmine");
		name.add("Rose");
		name.add("Tulip");
		name.add("Lilly");
		name.add(null);
		name.add(null);
		
		System.out.println(name);
		
		name.remove("Tulip");
		System.out.println(name);
		
		//can't do index related methods
		
		//clear()
		name.clear();
		System.out.println(name);
		
		
		
	}
	
	

}
