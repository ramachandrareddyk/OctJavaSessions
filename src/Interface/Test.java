package Interface;

public class Test implements Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t= new Test();
		t.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
