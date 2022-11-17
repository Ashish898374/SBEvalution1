package Day5Assiment;

public class thread  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			String tname=Thread.currentThread().getName();
			System.out.println(tname);
		}
		
	}
	

}
