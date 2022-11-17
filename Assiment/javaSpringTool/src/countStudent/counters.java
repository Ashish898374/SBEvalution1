package countStudent;

public class counters {
	private int marks;
	private String name;
	
	
	public counters() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public counters(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "counters [marks=" + marks + ", name=" + name + "]";
	}
	

}
