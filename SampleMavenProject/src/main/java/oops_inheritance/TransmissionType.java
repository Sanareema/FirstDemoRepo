package oops_inheritance;

//multi-level inheritance
public class TransmissionType extends Car{
	
	public void manual() {
		System.out.println("Manual transmission ");
	}
	public void automatic() {
		System.out.println("Electric Transmission");
	}

	public static void main(String[] args) {
		
		TransmissionType tt = new TransmissionType();
		
		tt.electric();
		tt.nonelectric();
		tt.car1();
		tt.car2();
		tt.manual();
		tt.automatic();
		
	}

}
