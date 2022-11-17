package SuspendingThreadTimeSleep;

public class Time extends Thread {

	@Override
	public void run() {   // yaha pe throws keyword ka use nahi hoga kyuki run method me error dega only try catch method ka use kar 
		// sakte hai ye static method hota hai 
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			  System.out.println("start method runing"+i);
		  
		
		try { Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	  
	}
	public static void main(String[] args) throws InterruptedException {  // yaha main method me run method ka use nahi hua hai to 
		// yaha throws keyword ka use hua hai 
		
		
		Time a1=new Time();
		Thread t=new Thread(a1);
		t.start();
		
		Thread.sleep(5000);
		System.out.println("start main method method");
	}
	

}
