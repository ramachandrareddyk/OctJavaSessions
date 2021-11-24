package ExceptionHandling;

public class ThrowKeyword {

	
	public static void main(String[]args) {
		String s=null;
		if(s==null) {
			System.out.println("Byee...");
			
			try {
				throw new Exception("No value from excel");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
