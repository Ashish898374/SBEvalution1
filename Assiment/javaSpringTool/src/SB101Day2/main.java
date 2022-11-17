package SB101Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<Quetion4> arr=new ArrayList<>();
		arr.add(new Quetion4("thar", 14, 2, 140000));
		arr.add(new Quetion4("fourtuner", 10, 1, 80000));
		arr.add(new Quetion4("Oddi", 4, 3, 180000));
		arr.add(new Quetion4("Scarpio", 7, 2, 70000));
		arr.add(new Quetion4("Bmw", 5, 6, 150000));
		Collections.sort(arr,(s1,s2)->s1.getPrice()<s2.getPrice()?+1:-1);
		System.out.println(arr);
		
	}

}
