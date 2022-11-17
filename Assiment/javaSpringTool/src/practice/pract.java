package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class pract {
	public static void main(String[] args) {
//		Student s1=new Student(12,"apna",24);
//		Student s2= new Student (12,"apna",24);
compareuse com=new compareuse();
Rollnocomparetor roll=new Rollnocomparetor();
	TreeSet<Student> list=new TreeSet<>(roll);
				list.add(new Student(14,"use",21));
				list.add(new Student(54,"nutal",91));

				list.add(new Student(24,"phase",41));

				list.add(new Student(17,"uses",81));
//			 Collections.sort(list,new compareuse());
				for(Student ss:list) {
					System.out.println(ss);
				}
//				System.out.println(list);

		
		}

}
