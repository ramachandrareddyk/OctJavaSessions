package JavaSessions;

public class ClassAndObject {

	String name;
	int age;
	boolean isAvtive;
	
	public static void main(String[] args) {
		//class
		//object
		//Polymarphisam
			//1. method over loding
			//2. Method over raiding
		//inheritence
		//Encapsulation
		//Abstraction
		//Interface

		String a="Hello";
		
		
		ClassAndObject e1= new ClassAndObject();
		e1.name="Dean";
		e1.age=23;
		e1.isAvtive=true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.isAvtive);
		

		ClassAndObject e2= new ClassAndObject();
		
		e2.name="Mike";
		e2.age=45;
		e2.isAvtive=false;
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.isAvtive);
		
		
		new ClassAndObject();
		
		new ClassAndObject().name="Hari";
		
		
	}
	
	

}
