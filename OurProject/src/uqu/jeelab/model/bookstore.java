package uqu.jeelab.model;

public class bookstore {
	private String NameOfbook;
	private String price;
	public bookstore(String NameOfbook1, String price1) {
		NameOfbook = NameOfbook1;
		price=price1;
}
	public String getNameOfbook() {
		return NameOfbook;
	}
	public void setNameOfbook(String nameOfbook) {
		NameOfbook = nameOfbook;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
	
	
