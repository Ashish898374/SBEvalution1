package FilterMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import ReturnLamdaExpresionFromAmethod.main;
import practice.Student;
import java.util.stream.Stream;
public class stu {
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		student.add(new Student(14,"yadav",464));
		student.add(new Student(10,"market",560));
		student.add(new Student(7,"yadav",230));
		student.add(new Student(20,"market",500));
		student.add(new Student(14,"yadav",405));
		student.add(new Student(40,"market",300));
		
		
		student.stream()
		.filter(s -> s.getId() < 500)
		.forEach(s -> System.out.println(s));
	}

}
