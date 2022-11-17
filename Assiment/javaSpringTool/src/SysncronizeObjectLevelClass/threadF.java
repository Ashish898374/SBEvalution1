package SysncronizeObjectLevelClass;



public class threadF extends Thread {
	A a;
    
	String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		a.pan(name);
	}

	public threadF(A a, String name) {
		super();
		this.a = a;
		this.name = name;
	}
	 
	

}
