package RemoveIfLambdaExparesion;

public class smallStudent {
	private int roll;
	private String name;
	private int marks;
	
	
public smallStudent() {
		
		// TODO Auto-generated constructor stub
	}

public smallStudent(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	
	public int getRoll() {
		return roll;
	}
	@Override
	public String toString() {
		return "smallStudent [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
