  package Inter_thread_communication_Notify_wait;

public class notyifyclass extends Thread {
   int num=0;
	@Override
	public void run() {
		synchronized (this) {
			
			
		
		// TODO Auto-generated method stub
	   for(int i=1;i<=10;i++) {
		   num=num+i;
	   }
	   this.notify();
		}
	}
	
	

}
