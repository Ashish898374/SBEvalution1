package getNameSetName;

public class getmain  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println(name+" "+"start Runable");
		}
	}

	
	

}
