package RaceCondition;

public class comon  {
	public synchronized void fun(String name) {
	
		System.out.print("welocome"+" ");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name);
	}

	

}
