package SysncronizeObjectLevelClass;

public class A {
	public void pan(String name) {
	// imagin karna hai 100 line code likha hai thread ek bar me ek hi run karega kyu ki sab thread sath me nahi
		// ja sakte syncronize this mean name ko kiya hai thod run time fast ho jayega kyuki syncronize kiya gya hai
  synchronized(this) {
		for(int i=1;i<5;i++) {
			System.out.println("welcome to start"+name);
			
		}
  }
  }

}
