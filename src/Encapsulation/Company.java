package Encapsulation;

public class Company {

	
	public String name;
	public int age;
	private int salary;
	
	public String getName() {
		return "Peter";
	}
	
	private int getSalary() {
		return 45000;
	}
	
	public static void main(String[] args) {
		Company com= new Company();
		
		com.name= "Tom";
		com.age=56;
		com.salary=56000;
		
		System.out.println(com.getName());

		System.out.println(com.getSalary());
	}

}
