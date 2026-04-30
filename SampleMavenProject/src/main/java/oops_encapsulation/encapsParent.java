package oops_encapsulation;

public class encapsParent {

	private int roll_num;
	private String name;
	private String subject;
	private int mark;
	
	public void setRollNum(int roll_num){ // better add/use 'set' word to method name to recognize setter method
		
		this.roll_num = roll_num;
	}
	
	public int getrollNum() { // getter method should return a value to the calling method, mandatorily
		
		return roll_num;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	

}

//now go to child class and call the getter and setter methods. Create object in child class and invoke these methods.