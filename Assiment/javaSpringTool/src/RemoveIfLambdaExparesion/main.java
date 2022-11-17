package RemoveIfLambdaExparesion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import practice.Student;

public class main {
	public static void main(String[] args) {
		List<smallStudent> list=new ArrayList<>();
		list.add(new smallStudent(14,"ashi",280));
		list.add(new smallStudent(12,"apna",304));
		list.add(new smallStudent(7,"collage",21));
		list.add(new smallStudent(12,"apna",320));
		list.add(new smallStudent(8,"collagess",311));
		list.add(new smallStudent(18,"apnii",240));
		list.add(new smallStudent(8,"collage",201));
		list.removeIf(s->s.getMarks() <200 );
		
		Collections.sort(list,(s1,s2)->s1.getRoll()> s2.getRoll()? +1: -1);
		
		for(smallStudent s:list) {
			System.out.println(s);
		}
		
	}

}
