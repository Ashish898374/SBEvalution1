package Day4Assiment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;
public class localfirst {

	public static void main(String[] args) {
	

		List<Studentes> students= new ArrayList<>();
		
		
		students.add(new Studentes(14,"thor",120000,6));
		students.add(new Studentes(14,"Oddi",150000,12));
		students.add(new Studentes(14,"Honda",80000,8));
		students.add(new Studentes(14,"Accai",60000,10));
		students.add(new Studentes(14,"Bmw",130000,11));
		students.add(new Studentes(14,"safari",180000,9));
		
		
		
		students.stream()
		.filter(s -> s.getQuantity() > 10)
		.forEach(s -> System.out.println(s));
		System.out.println("----------------------------------------------");
		
		
		
		List<Studentes> filteredList= students
					.stream()
					.filter(s -> s.getPrice() > 50000 ).collect(Collectors.toList());
	
		
		filteredList.forEach(s -> System.out.println(s));
		

		
		
		
		
		
			
	}

}
