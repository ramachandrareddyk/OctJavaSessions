package Abstract;

public class Honda extends Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Bike b=new Honda();
		
		b.run();
		
		Bike.speed();
		
	}

	@Override
	void run() {
		System.out.println("Running safely");
		
	}

}
