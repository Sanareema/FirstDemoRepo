package oops_inheritance;
//hierarchical inheritance
public class Summer extends Season{
	
	public void summer() {
		System.out.println("Summer is hot");
	}
		
	public static void main(String[] args) {
		Summer summ = new Summer();
		summ.summer();
		summ.season();
	}

}
