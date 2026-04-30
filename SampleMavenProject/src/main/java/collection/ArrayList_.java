package collection;

import java.util.ArrayList;

public class ArrayList_ {

	public static void main(String[] args) {
		
		ArrayList <String> alist = new ArrayList<String>();
		ArrayList <String> blist = new ArrayList<String>();
		
		//System.out.println(alist); // now empty
		
		alist.add("Lion");
		alist.add("Monkey");
		alist.add("Giraffe");
		alist.add("Ant");
		alist.add("Butterfly");
		System.out.println("Arraylist: " + alist); // now alist has list of elements
		
		//System.out.println(blist); // now empty
		
		blist.add("Apple");
		blist.add("Orange");
		blist.add("Berry");
		blist.add("Tomato");
		blist.add("Grapes");
		System.out.println("Arraylist: " + blist);
		
		//addAll() - add another list to another list
	
		alist.addAll(blist);
		System.out.println("alist: " + alist);
		
		
		//containsAll() -- checking list elemnts are available in another list
		System.out.println(alist.containsAll(blist));
		System.out.println(blist.containsAll(alist));
		
		//remove() -- removes element from the list
		alist.remove(4);
		System.out.println(alist);
		alist.remove("Ant");
		System.out.println(alist);
		
		//removeAll()
		
		alist.removeAll(blist);
		System.out.println(alist);
		
	}

}
