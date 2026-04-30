package oops_inheritance;
//hierarchical inheritance
public class Winter extends Season {
	
	public void winter() {
		
		System.out.println("Winter is cool");
	}

	public static void main(String[] args) {
		
		Winter wint = new Winter();
		wint.winter();
		wint.season();
	}
}
