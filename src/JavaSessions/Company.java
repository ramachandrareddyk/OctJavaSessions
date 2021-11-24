package JavaSessions;

import java.util.ArrayList;

public class Company {


	String name;
	int totalEmployes;
	public static void main(String[] args) {
		
		Company com=new Company();
		
		String ceo=com.ceoname();
		System.out.println(ceo);
		//System.out.println(com.ceoname());
		
		System.out.println(com.empCount());
		
		String[] Cofounder= com.coFounders();
		System.out.println(Cofounder.length);
		
		for(String e:Cofounder) {
			System.out.println(e);
		}
		
		ArrayList<String>ar=com.products();
		System.out.println(ar.size());
			
		for(String i:ar) {
			System.out.println(i);
		}
	}
	
	//return string dairectly without variable
	public String ceoname() {
		
		return "Tom";
	}
	
	//return int dairectly without variable
	
	public int empCount() {
		return 1000;
	}
	
	//return array
	
	public String[] coFounders(){
		String[] founders=new String[3];
		founders[0]="Tom";
		founders[1]="peter";
		founders[2]="Steve";
		
		return founders;
	}
	
	//return array list
	
	public ArrayList<String> products() {
		
		ArrayList<String> product=new ArrayList<String>();
		product.add("ThamsUp");
		product.add("Sprite");
		product.add("Mazza");
		product.add("Water");
		
		return product;
	}
	
	
}
