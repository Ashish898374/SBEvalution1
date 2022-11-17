package pradicates;

import java.util.function.Predicate;

public class simple implements Predicate<Integer> {

	@Override
	public boolean test(Integer i) {
		return i>=0;
	}
	

}
