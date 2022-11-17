package FirstWeek;

public class Emp  implements Comparable<Emp>{
	 
	

	private String name;
	private int rollno;
	private int marks;
	
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		
		return this.marks-o.marks;
	}
	
	public Emp(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	
	
	
//	*****************************geter Method****************************
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return rollno;
	}
	
	public int getmarks() {
		return marks;
	}

	
//	*****************************ToString Method*****************************************
	@Override
	public String toString() {
		return "Emp [name=" + name + ", Roll no=" + rollno + ", marks=" + marks + "]";
	}

	 
	
	

}
