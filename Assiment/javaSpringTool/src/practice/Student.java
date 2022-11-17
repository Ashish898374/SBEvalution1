package practice;

import java.util.Objects;

public class Student implements Comparable<Student> {
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.Rollno-o.Rollno;
	}

	private int Rollno;
	private String name;
	private int id;
	
	
	






	public Student() {
		// TODO Auto-generated constructor stub
	}





	public Student(int rollno, String name, int id) {
		super();
		Rollno = rollno;
		this.name = name;
		this.id = id;
	}


	public int smallStudent() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", id=" + id + "]";
	}





	public String getMarks() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
