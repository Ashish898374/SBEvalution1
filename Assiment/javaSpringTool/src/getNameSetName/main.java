package getNameSetName;

public class main {
	public static void main(String[] args) {
		getmain g1=new getmain();
		Thread tt=new Thread(g1);
		Thread t2=new Thread(g1);
		Thread t3=new Thread(g1);
		
		t2.setName("yadav");
		tt.setName("ashish");
		t3.setName("unit5");
		
		tt.start();
		t2.start();
		t3.start();
	}

}
