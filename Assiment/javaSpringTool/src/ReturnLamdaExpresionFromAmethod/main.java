package ReturnLamdaExpresionFromAmethod;

public class main {
	public static print fun(){
		return n-> System.out.println("welcome"+" "+n);
	}
	public static void main(String[] args) {
		print l=fun();
		l.sayhello("sano");
		
	
		}

}
