package Day4Assiment;

public class Heigthmarks {
	private int roll;
	private String name;
	private int marks;
	
	
	
	public Heigthmarks() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Heigthmarks(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
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
	public int getmarks() {
		return marks;
	}
	public void setmarks(int marks) {
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Heigthmarks [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}
