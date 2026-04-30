package aggregationpgm;

public class AggregationChild_2 {

		String subject;
		int mark;
		AggregationParent_2 ref;
		
		
		public AggregationChild_2(String subject, int mark, AggregationParent_2 ref ) {
			
			this.subject = subject;
			this.mark = mark;
			this.ref = ref;
		}
		
		public void display() {
			
			System.out.println("Id: " + ref.id);
			System.out.println("Name: " + ref.Name);
			System.out.println("Subject: " + subject);
			System.out.println("Mark: " + mark);
				}
	public static void main(String[] args) {
		
		AggregationParent_2 obj = new AggregationParent_2(1,"Lilly");
		
		AggregationChild_2 obj1 = new AggregationChild_2("English", 100, obj);
		obj1.display();
	}

}
