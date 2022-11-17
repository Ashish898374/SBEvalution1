package pradicates;

import java.util.function.Predicate;

public class main {
	public static void main(String[] args) {
		
		// predicate method if sysmbol is minus output is minus;
		
//		Predicate<Integer> p1=new simple();
//		System.out.println(p1.test(-15));
		
		
//		lembda expresion
		Predicate<Integer>p2=i->i>=0;
		System.out.println(p2.test(-10));
	}

}
