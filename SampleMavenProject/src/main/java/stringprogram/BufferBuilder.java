package stringprogram;

// both Stringbuffer and Stringbuilder are memebers of charsequence interface along with String. they both handle strings mutable way.

public class BufferBuilder {

	public static void main(String[] args) {
				
		StringBuffer sb = new StringBuffer("Hello");
		StringBuilder sbs = new StringBuilder("Winter Days");
		
		System.out.println(sb);
		System.out.println(sbs);
		
		//insert() - to insert a new word/character to the string based on the index position
		
		System.out.println(sb.insert(5, "_")); // inserts _ on 5th position
		System.out.println("now sb is, after insert() use: " + sb );
		System.out.println(sb.insert(6, "girl")); // inserts "girl" from 6th position
		
		//append() - to join or add a new string to the end of a string
		System.out.println(sb.append(" Rose"));
		
		//replace() - to replace a string using index position
		System.out.println(sb.replace(11, 15, "Lilly")); //replaces 11-14th index position with new string, rest will be kept.
		
		//delete() - to delete a string based on index position
		System.out.println(sb.delete(8, 13)); //deletes from index 8 to 12
		System.out.println(sb.delete(5, 11)); //deletes from index 5 to 10
		
		//reverse() - to reverse a string
		System.out.println(sbs.reverse());
	}

}
