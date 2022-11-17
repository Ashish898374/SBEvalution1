package Day7Assiment;

public class productOfSum  extends Thread{
 int sum=0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				sum+=i;
			}
			this.notify();
			
		}
		// TODO Auto-generated method stub
		
	}

}
