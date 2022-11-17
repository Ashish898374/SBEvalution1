package StreamMethodTerminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class rendom {
	public static void main(String[] args) {
		List<String> arr=Arrays.asList("one","two","three","four");  // terminal method 
		Stream<String> p2= arr.stream();
		p2.forEach(s-> System.out.println(s));   // forEach dubara use nahi kar sakte expation ayega;
	}

}
