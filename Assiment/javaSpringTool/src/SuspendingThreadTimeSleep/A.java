package SuspendingThreadTimeSleep;

public class A  implements Runnable{
int sum;
	
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10; i++) {
			System.out.println("inside A thread");
			sum = sum + i;
			}
		

	}
	

}
