package StringManupulations;

public class StringManupulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Hello this is my first java and testing";
		
		System.out.println(str.length());
		System.out.println("LI "+0);
		System.out.println("Hi "+(str.length()-1));
		
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(38));
System.out.println("-------");
		
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("l"));
		
		System.out.println(str.indexOf("Hello"));
		
		
		
		String message="   Welcome Testing    ";
		
		System.out.println(message.trim());
		//replace
		
		System.out.println(message.trim().replace(" ", ""));
		
		String DOB="10-10-1995";
		
		System.out.println(DOB.replace("-", "/"));
		
		String a= "MAHESH";
		
		System.out.println(a.toLowerCase());
		
		String b= "gopi";
		
		System.out.println(b.toUpperCase());
		
		
		//Contains
		
		String s1="My browser is chrome";
		
		System.out.println(s1.contains("chrome"));
		
		
		String s2="Safari";
		
		if(s2.contains("Safari")) {
			System.out.println("Launch browser");
		}
		
		System.out.println(s2.equals("Safari"));
		System.out.println(s2.equals("Safariiii"));
		
		System.out.println(s2.equalsIgnoreCase("safari"));
		
		System.out.println("................");
		String f1="Hello Testing";
		String f2="Hello testing";
		
		System.out.println(f1.equals(f2));
		System.out.println(f1.equalsIgnoreCase(f2));
		
		System.out.println(f1+f2);
		
		
		String x="Java;Python;C#;JavaScript;HTML";
		
		String lang[]=x.split(";");
		
		System.out.println(lang.length);
		
		for(String e:lang) {
			System.out.println(e);
		}
		
		String m="Your total amount is 30000";
		
		System.out.println(m.substring(5));
		
		System.out.println(m.substring(5, 10));
		System.out.println("-------------------------");
		
		stringReverce();
	}
	
	public static void stringReverce() {
		String a= "Testing";
		
		String rev="";
		StringBuffer s=new StringBuffer(a);
		
		System.out.println(s.reverse());
		
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			System.out.println(rev);
		}
		
	}

}
