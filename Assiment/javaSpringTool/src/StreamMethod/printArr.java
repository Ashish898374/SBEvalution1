package StreamMethod;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class printArr {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// arr ko print aise hi karte hai starting value and last value ,last value se ek value kam print hoga 
		// without for loops use kiye 
		
//		IntStream .range(1, 10).forEach(System.out::println);
		
	
		// number me 4 se long number kitane bar h count karega 
//	long b= Stream.of(1,4,7,8,5,2,3,4,6,9,4).filter(s->s>4).count();
//	System.out.println(b);
		
		
		// arr ka 20 number print karega 20 tak number nahi 
		IntStream num=IntStream.iterate(2, x ->x+1);
		num.limit(20).forEach(System.out::println);
	}

}
