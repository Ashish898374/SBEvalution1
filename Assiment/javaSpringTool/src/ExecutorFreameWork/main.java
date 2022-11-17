package ExecutorFreameWork;

import java.security.Provider.Service;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
	public static void main(String[] args) {
		runAb[] A1= {new runAb("apna"),
		new runAb("ashish"),
		new runAb("yadav"),
		new runAb("ham"),
		new runAb("tum")
		};
		ExecutorService s1= Executors.newFixedThreadPool(3);
		for(runAb num:A1) {
			s1.submit(num);
			
			
		}
		s1.shutdown();
	}

}
