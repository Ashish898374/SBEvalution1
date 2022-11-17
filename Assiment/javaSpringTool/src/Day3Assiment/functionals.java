package Day3Assiment;
import java.util.function.*;
public class functionals {
	public static void main(String[] args) {
		Function<Integer,String> f = i -> "This is first  number "+i;
		System.out.println(f.apply(8));
		Function<String,Integer> f2 = s -> Integer.parseInt(s);
		System.out.println(f2.apply("100")+200);
		Function<String,Integer> f3 = Integer::parseInt;
		
		System.out.println(f3.apply("600")+200);
	}

}
