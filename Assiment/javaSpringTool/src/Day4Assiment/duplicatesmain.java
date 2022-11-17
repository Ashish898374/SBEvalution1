package Day4Assiment;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class duplicatesmain {
	public static void main(String[] args) {
		Set<Duplicates> arr=new TreeSet<>();
		arr.add(new Duplicates(14,"ashish",25,500));
		arr.add(new Duplicates(8,"yadav",27,550));
		arr.add(new Duplicates(6,"varma",23,600));
		arr.add(new Duplicates(5,"kallu",18,700));
		arr.add(new Duplicates(3,"syam",20,570));
		
		List<Duplicates> filteredList= arr
				.stream()
				.filter(s -> s.getMarks() < 500)									.collect(Collectors.toList());
	
	
	filteredList.forEach(s -> System.out.println(s));
		
	}

}
