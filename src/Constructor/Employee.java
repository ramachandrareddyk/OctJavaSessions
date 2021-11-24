package Constructor;

public class Employee {

	String name;
	int age;
	double salary;
	char gender;
	
	//Constructor name will be same as the class name
	//COnstructor is like a method but cons...never return any thing
	
	//1. Default cons..
	//2. Parametarised cons...
	
	//Cons.. will execute at the time of creating an object
	// Default cons..
	
	/*
	 * public Employee() { System.out.println("This is my cons...."); }
	 * //Parametarised cons... public Employee(int age) { System.out.println(age); }
	 */
	
	
	
	public Employee(String name) {
		this.name=name;
	}
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		System.out.println("Hello");
	//	Employee e1= new Employee();
		
		Employee e2= new Employee("ramach");
System.out.println(e2.name);

		Employee e3= new Employee("Tom", 70);
		
		System.out.println(e3.name+"  "+e3.age);
		
		Employee e4= new Employee("Tom", 70, 55000.00);
		
		System.out.println(e4.name+"  "+e4.age+"  "+e4.salary);
	}

	public Employee(String name, int age, double salary, char gender) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}
