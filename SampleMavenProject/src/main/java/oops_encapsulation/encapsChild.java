package oops_encapsulation;

public class encapsChild {

	public static void main(String[] args) {
		
		encapsParent obj = new encapsParent();
		obj.setName("Reema");
		System.out.println(obj.getName());
		obj.setRollNum(10);
		System.out.println(obj.getrollNum());
		obj.setSubject("English");
		System.out.println(obj.getSubject());
		obj.setMark(100);
		System.out.println(obj.getMark());
		
	}

}
