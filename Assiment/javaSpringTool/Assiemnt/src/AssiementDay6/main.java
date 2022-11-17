package AssiementDay6;

import Day5Assiment.thread;

public class main {
	public static void main(String[] args) throws InterruptedException {
		classfirst c1=new classfirst();
		oddclass o1=new oddclass();
		Thread t=new Thread(c1);
	    Thread o=new Thread(o1);
	    System.out.println("start even number");
		t.start();
		t.join();
		Thread.sleep(2000);
		System.out.println("start odd number");
		o.start();
		}

}
