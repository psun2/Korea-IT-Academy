package jdbc_p;

public class BusDTO {
	String no, type, district;
	int price;

	public BusDTO(String no, String type, int price, String district) {
		super();
		this.no = no;
		this.type = type;
		this.price = price;
		this.district = district;
	}

	@Override
	public String toString() {
		return "BusDTO [no=" + no + ", type=" + type + ", district=" + district + ", price=" + price + "]";
	}

}