package Day4Assiment;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class main {
	public static void main(String[] args) {
		List<Heigthmarks> mat=new ArrayList<>();
		mat.add(new Heigthmarks(12,"ashish",600));
		mat.add(new Heigthmarks(2,"sharma",540));
		mat.add(new Heigthmarks(14,"varma",801));
		mat.add(new Heigthmarks(6,"ram",732));
		mat.add(new Heigthmarks(42,"kallu",418));
		
		
Optional<Heigthmarks> opt = mat.stream().min( (s1,s2) -> s1.getmarks() < s2.getmarks() ? +1 :-1);
		
		
Heigthmarks maxStudent= opt.get();
		
		System.out.println(maxStudent);
		
	}

}
