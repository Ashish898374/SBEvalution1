package SuspendingThreadTimeSleep;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		A a1 = new A();
		Thread t = new Thread(a1);

		t.join();
		t.start();
		Thread.sleep(2000);
		int result = a1.sum;
		for (int i = 1; i <=10; i++) {
		System.out.println("inside main thread....");
		System.out.println(result);
		}

	}

}
