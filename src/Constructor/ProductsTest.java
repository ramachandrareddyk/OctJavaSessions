package Constructor;

import java.util.ArrayList;

public class ProductsTest {

	public static void main(String[] args) {
		
		Product p1= new Product("Mi Mobile", 10000.00);

		System.out.println(p1.pname+"   "+p1.price);
		
		
		
		ArrayList<String> SellersList= new ArrayList<String>();
		
		SellersList.add("Mi Store");//0
		SellersList.add("Croma");//1
		SellersList.add("Sangetha");//2
		SellersList.add("HP Store");//3
		
		Product p2= new Product("Samsung", 15000.00, SellersList);
		
		System.out.println(p2.pname+"  "+p2.price+"  "+p2.sellerList);
		System.out.println(SellersList.get(0));
		
		
		
		
		
		
		
	}

}
