package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List <String> li = new ArrayList<String>();
		
		// to add elements/objects in the collection
		li.add("red");
		li.add("blue");
		li.add("green");
		li.add("yellow"); // duplicate elements allowed in "List"
		li.add("yellow");
		li.add(null);
		li.add(null);
		System.out.println(li);
		
		//indexOf() - to return the index of the object
		System.out.println(li.indexOf("blue"));
		System.out.println(li.indexOf("yellow"));
		
		//lastIndexOf() - to return the last index of the repeated element
		System.out.println("Last index of yellow: " +li.lastIndexOf("yellow"));
		System.out.println("Last index of null: " + li.lastIndexOf(null));
		
		//get() - to retrieve the element in the given index position
		System.out.println("Element at 3rd index: " + li.get(3));
		
		//contains() - to check whether an element is present in the List. if present, returns true or returns false
		System.out.println(li.contains("black"));
		System.out.println(li.contains("green"));
		
		//isEmpty()
		System.out.println("Is the list li empty?: " + li.isEmpty());
		
		//size() - to find the size of the collection
		System.out.println(li.size());
		
		//iterate
		/*for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i)); */
		
		//iterate using for each loop
			
	/*	for(String s: li) {
			System.out.println(s);
		}*/
		// iterator
		
		Iterator<String> var = li.iterator();
		
		while(var.hasNext()) {
			
			System.out.println("Using iterator method: " + var.next());
		}
		var.remove(); // removes last element
		System.out.println(li);
	}
}
