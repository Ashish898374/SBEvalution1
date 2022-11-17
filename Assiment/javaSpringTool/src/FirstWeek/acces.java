package FirstWeek;

import java.util.ArrayList;

import java.util.Collections;
import java.util.*;
public class acces {
//	compareable *********************************************************
	public static void main(String[] args) {
		ArrayList<Emp> emps= new ArrayList<>();
		emps.add(new Emp("ashish",40000,44));
		emps.add(new Emp("yadav",45000,25));
		emps.add(new Emp("rohan",38000,21));
		emps.add(new Emp("sonu",42000,12));
	    System.out.println(emps);
	    Collections.sort(emps);
	    System.out.println(emps);
	  
	}

}
