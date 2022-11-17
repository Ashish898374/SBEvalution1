package Day3Assiment;
import java.util.function.Consumer;

import practice.Student;
public class consumerses {
	public static void main(String[] args) {
		Consumer<Student> c = s -> {
		System.out.println("Roll is "+s.smallStudent());
		System.out.println("Name is "+s.getName());
		System.out.println("Marks is "+s.getMarks());
		};
		c.accept(new Student(20,"Amit",10));
	}

}
