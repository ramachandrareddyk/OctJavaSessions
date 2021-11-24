package Inheritence;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		
		b.start();
		b.price();
		b.stop();
		b.refuel();
		
		BMW.Capasity();
		
		Honda h= new Honda();
		
		h.color();
		h.start();
		
		h.price(56777);
		
		Maruthi m= new Maruthi();
		
		m.start();
		
		
		//top casting
		 Car c=new BMW();
		 
		 c.start();
		 
		 //Down Casting
		 // BMW b1=(BMW) new Car();

	}

}
