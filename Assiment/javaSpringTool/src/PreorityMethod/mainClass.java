package PreorityMethod;

public class mainClass extends Thread {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method first");
	}

	public static void main(String[] args) {
	
		
		mainClass ta= new mainClass();
		mainClass tb=new mainClass();
		System.out.println("geta wala method"+ta.getPriority());
		System.out.println("second set wala method"+tb.getPriority());
		ta.setPriority(5);
		tb.setPriority(4);
		
		System.out.println("main"+ta.currentThread().getPriority());
	}

}
