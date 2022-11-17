package Maxstudentmarks;

public class stt {
	private int roll;
	private String name;
	private int id;
	
	
	public stt() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public stt(int roll, String name, int id) {
		super();
		this.roll = roll;
		this.name = name;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "stt [roll=" + roll + ", name=" + name + ", id=" + id + "]";
	}
	

}
