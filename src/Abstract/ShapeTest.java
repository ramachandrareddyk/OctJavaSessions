package Abstract;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape s=new Circler();
		
		s.draw();
		
		Shape s1=new Ractangle();
		s1.draw();
		
		s1.speed();
	}

}
