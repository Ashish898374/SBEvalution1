package RaceCondition;

public class threadB  extends Thread{
 comon c;
 String name;
public threadB(comon c, String name) {
	this.c = c;
	this.name = name;
	
	
}
@Override
public void run() {
	// TODO Auto-generated method stub
	c.fun(name);
}
 
}
