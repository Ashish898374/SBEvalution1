package check;

public class main {
 public static void main(String[] args) throws InterruptedException {
	pra p1=new pra();
	Thread t=new Thread(p1);
	t.start();
	t.join();
	int result=p1.sum;
	for(int i=1;i<5;i++) {
		System.out.println("ending");
		System.out.println(result);
	}
}
}
