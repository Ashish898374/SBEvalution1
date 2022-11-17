package RaceCondition;

public class main {
	public static void main(String[] args) {
		comon c=new comon();
//		comon c1=new comon();
		threadA t1=new threadA(c,"ram");
		threadB t2=new threadB(c,"syam");
		t1.start();
		t2.start();
	}

}
