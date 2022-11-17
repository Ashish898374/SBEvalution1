package Day5Assiment;



public class main {
	public static void main(String[] args) {
		thread t1= new thread();
		thread k=new thread();
		Thread tn=new Thread(t1);
		Thread tm=new Thread(k);
		tn.setName("Doni");
		tm.setName("Kohali");
		tn.start();
		tm.start();
	}


}
