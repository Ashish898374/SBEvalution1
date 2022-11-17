package RaceCondition;

public class threadA extends Thread { 
	comon c;
	String name;
	
	public threadA(comon c, String name) {
	
		this.c = c;
		this.name = name;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.fun(name); 
	}
	
	
}
