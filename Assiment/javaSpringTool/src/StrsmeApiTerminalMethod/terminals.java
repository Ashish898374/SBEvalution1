package StrsmeApiTerminalMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class terminals {
	public static void main(String[] args) {
		List<String> arr=Arrays.asList("ashish","yadav","jaunpur","maharastra");
		Stream<String> str=arr.stream();
		arr.forEach(s->System.out.println(s));
		
		// ek class me Strame ko ak bar hi use kar sakte 
	}

}
