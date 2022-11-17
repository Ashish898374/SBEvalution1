package ExecutorFreameWork;

public class runAb implements Runnable {
	String name;
	

	public runAb(String name) {
		
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(name+Thread.currentThread().getName()+"end");
		
		
	}

}
