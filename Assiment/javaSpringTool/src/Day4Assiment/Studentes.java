package Day4Assiment;

public class Studentes {
    private int productID;
    private String productName;
    private int price;
    private int quantity;
	public Studentes() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Studentes(int productID, String productName, int price, int quantity) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Studentes [productID=" + productID + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}
