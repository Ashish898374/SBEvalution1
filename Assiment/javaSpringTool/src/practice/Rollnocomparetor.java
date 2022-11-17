package practice;

import java.util.Comparator;

public class Rollnocomparetor implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.smallStudent() >s2.smallStudent()? +1: -1;
	}

}
