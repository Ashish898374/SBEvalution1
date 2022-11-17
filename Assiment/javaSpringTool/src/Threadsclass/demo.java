package Threadsclass;

public class demo {
	public static void main(String[] args) {
		threadA t1=new threadA();
		t1.start();
		threadB t2=new threadB();
		t2.start();
		threadC t3=new threadC();
		t3.start();
		for(int i=0;i<10;i++) {
			System.out.println("starting main thread "+i);
		}
	}

}
