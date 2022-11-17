package SB101Day2;

public class CITYMETHOD {
	public static void main(String[] args) {
		printlist pr=(name)->{
			System.out.println(name);
		};
		pr.listof("mumbai");
		pr.listof("palghar");
		pr.listof("vasai");
		pr.listof("nallasopara");
		pr.listof("borivali");
	}

}
