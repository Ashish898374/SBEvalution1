package MethodRefarence;

public class Main {
	public static void  seho(String n) {
		System.out.println("method reference "+" "+n);
	}
	public static void main(String[] args) {
		first l1=Main::seho;
		l1.hello("ashish");
				}

}
