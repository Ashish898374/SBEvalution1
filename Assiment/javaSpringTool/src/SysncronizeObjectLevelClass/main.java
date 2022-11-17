package SysncronizeObjectLevelClass;

public class main {
	public static void main(String[] args) {
		A a2=new A();
		threadF t=new threadF(a2, "ashish");
		threadF t3=new threadF(a2, "join");
		t.start();
		t3.start();
	}

}
