package Day3Assiment;
import java.util.function.*;
public class predicates {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 0;
		System.out.println(p.test(5));
		System.out.println(p.test(-5));
	}

}
