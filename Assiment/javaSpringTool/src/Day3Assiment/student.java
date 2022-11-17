package Day3Assiment;

public class student {
	private String name;
	private String emails;
	private int marks;
	private int roll;
	
	public student() {
	
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmails() {
		return emails;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public student(String name, String emails, int marks, int roll) {
		super();
		this.name = name;
		this.emails = emails;
		this.marks = marks;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", emails=" + emails + ", marks=" + marks + ", roll=" + roll + "]";
	}
	

}
