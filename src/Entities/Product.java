package Entities;

public class Product {
	
	private String pname;
	private Double price;
	
	public Product(String pname, Double price) {
		this.pname = pname;
		this.price = price;
	}
	public Product() {
	}
	public String getPname() {
		return pname;
	}
	public void setName(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
