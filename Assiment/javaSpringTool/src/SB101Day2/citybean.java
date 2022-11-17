package SB101Day2;

public class citybean {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public citybean(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "citybean [city=" + city + "]";
	}

}
