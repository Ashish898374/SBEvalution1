package Inter_thread_communication_Notify_wait;

public class waitclass {
	public static void main(String[] args) throws InterruptedException {
		notyifyclass n1=new notyifyclass();
		n1.start();
		synchronized (n1) {
			n1.wait();
			
		
		
		System.out.println(n1.num+"last");
		}
	}

}
