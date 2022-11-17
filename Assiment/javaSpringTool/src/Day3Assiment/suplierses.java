package Day3Assiment;
import java.util.function.Supplier;
import java.util.jar.Attributes.Name;

import practice.Student;
public class suplierses {
	public static void main(String[] args) {
		Supplier<String> s = () -> "This is Supliers method";
		System.out.println(s.get());
		Supplier<Student> s2 = () -> new Student(5,"Ram",20);
		System.out.println(s2.get().getName());

	}

}
