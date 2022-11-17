package Lamdaopretor;

import practice.Student;

public class interfaces  {
	public static void main(String[] args)  {
		apna l1=(s) ->{
			// agar ak parameter ho to () {} dono breaket optional hote hai name ke jagah koi bhi value pass kar sakte hai
			System.out.println("student id is"+s.getId());
			System.out.println("student name is"+s.getName());
			System.out.println("student rollno is"+s.smallStudent());
		};
			
			l1.uses(new Student(14,"ashish",23));
		
	}

}
