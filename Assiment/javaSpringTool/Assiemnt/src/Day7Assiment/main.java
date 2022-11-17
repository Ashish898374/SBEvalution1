package Day7Assiment;

import Day5Assiment.thread;

public class main {
	public static void main(String[] args) throws InterruptedException {
		productOfSum s1=new productOfSum();
         s1.start();
       
         synchronized (s1) {
        	 for(int i=1;i<=10;i++) {
        		 s1.wait();
        		 System.out.println(s1.sum);
        		
        	 }
			
		}
	}

}
