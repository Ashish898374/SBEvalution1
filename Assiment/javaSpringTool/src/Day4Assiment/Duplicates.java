package Day4Assiment;

public class Duplicates {
	private int roll;
	private String name;
	private int studentid;
	private int marks;
	
	
	public Duplicates() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Duplicates(int roll, String name, int studentid, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.studentid = studentid;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Duplicates [roll=" + roll + ", name=" + name + ", studentid=" + studentid + ", marks=" + marks + "]";
	}
	

}
