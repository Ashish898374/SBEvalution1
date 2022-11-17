package Question1;

public class student {

	

	
		int roll;
	    String name;
	    int marks;

	    public student(int roll, String name, int marks) {
	        this.roll = roll;
	        this.name = name;
	        this.marks = marks;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "roll=" + roll +
	                ", name='" + name + '\'' +
	                ", marks=" + marks +
	                '}';
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

	    public int getMarks() {
	        return marks;
	    }

	    public void setMarks(int marks) {
	        this.marks = marks;
	    }

	}


