package Constructor;

import java.util.ArrayList;

public class Product {
	
	
	String pname;
	double price;
	String color;
	ArrayList<String> sellerList;
	public Product(String pname, double price) {
		
		this.pname = pname;
		this.price = price;
	}
	public Product(String pname, double price, String color) {
		
		this.pname = pname;
		this.price = price;
		this.color = color;
	}
	public Product(String pname, double price, ArrayList<String> sellerList) {
		super();
		this.pname = pname;
		this.price = price;
		this.sellerList = sellerList;
	}
	public Product(String pname, double price, String color, ArrayList<String> sellerList) {
		
		this.pname = pname;
		this.price = price;
		this.color = color;
		this.sellerList = sellerList;
	}
	
	
	
	
	
	

}
