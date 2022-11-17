package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> st=new ArrayList<>();
		st.add(new Product(4,"pen",50,2));
		st.add(new Product(5,"pencil",100,6));
		st.add(new Product(6,"ruber",200,10));
		st.add(new Product(8,"Sharpener",150,3));
		st.add(new Product(7,"scale",210,8));
		st.add(new Product(1,"Compass",140,9));
		st.removeIf( student2 -> student2.getQuntatity() < 2 );
		System.out.println(st);
		Collections.sort(st, (s1,s2) -> s1.getPrice() < s2.getPrice()? +1: -1);
//		System.out.println(st);
		

		for(Product stu:  st) {
			System.out.println(stu);
			
		}
		st.forEach(System.out::println);
	}

}
