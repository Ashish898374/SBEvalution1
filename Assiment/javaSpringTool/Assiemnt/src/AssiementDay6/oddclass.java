package AssiementDay6;

public class oddclass  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			
			if(i%2!=0) {
				
				System.out.println(i);
			}
		}
		
	}

}
