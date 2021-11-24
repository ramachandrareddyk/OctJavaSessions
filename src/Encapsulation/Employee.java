package Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private int salary;
	private String city;
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	
}
