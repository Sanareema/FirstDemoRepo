package aggregationpgm;

public class AggregationChild{
	
	int id;
	String subject;
	AggregationParent ref;
	
	public AggregationChild(String subject, int id, AggregationParent ref) {
		
		this.id = id;
		this.subject = subject;
		this.ref = ref;
	}

	private void display() {
		System.out.println(" ID: " + id + " " + "Subject: " + subject);
		System.out.println(" Name: " + ref.name+ " " + "Mark: " + ref.mark);
	}
	public static void main(String[] args) {
		
		AggregationParent obj1 = new AggregationParent("Reema", 100);

		AggregationChild obj = new AggregationChild("Math", 10, obj1);
		obj.display();
		
	}

}
