package Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
	
		Employee emp= new Employee();
		
		emp.setSalary(70000);
		
		System.out.println(emp.getSalary());
		
		emp.setCity("Bangalore");
		
		System.out.println(emp.getCity());

	}

}
