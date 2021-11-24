package JavaSessions;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1= new Car();
		c1.name="BMW";
		c1.price=70;
		c1.color="white";
		c1.test();
		Car.test1();
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+Car.Wheels);

		Car c2= new Car();
		c2.name="Audi";
		c2.price=50;
		c2.color="Blue";
		
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+Car.Wheels);
		
		Car c3= new Car();
		c3.name="MS";
		c3.price=10;
		c3.color="Black";
		
		System.out.println(c3.name+" "+c3.price+" "+c3.color+" "+Car.Wheels);
	}

}
