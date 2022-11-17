package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class functionpro {
	public static void main(String[] args) {
		List<String> res=Arrays.asList("apna","public","road","lamda","road","road");
		
		int    ss=Collections.frequency(res, "road");
		System.out.println(ss);
	}

}
