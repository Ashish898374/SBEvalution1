package SB101Day2;

public class Quetion4 {
	private String Productname;
	private  int ProductID;
	private int Quentity;
	private int price;
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getQuentity() {
		return Quentity;
	}
	public void setQuentity(int quentity) {
		Quentity = quentity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Quetion4(String productname, int productID, int quentity, int price) {
		super();
		Productname = productname;
		ProductID = productID;
		Quentity = quentity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Quetion4 [Productname=" + Productname + ", ProductID=" + ProductID + ", Quentity=" + Quentity
				+ ", price=" + price + "]";
	}
	

}
