package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar=new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());
		
		ar.add("Hello");
		ar.add(33.90);
		ar.add('t');
		ar.add(true);
		System.out.println("--------------------------");
		System.out.println(ar.get(4));
		
		
		System.out.println(ar);
		System.out.println("____________________________");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//Genaric type//user define type
		ArrayList<Object> a1= new ArrayList<Object>();
		
		a1.add("Hello");
		a1.add(33.90);
		a1.add('t');
		a1.add(true);
		System.out.println("###################################");
		for(Object e:a1) {
			System.out.println(e);
		}
		
		
		
		/*
		 * for(String s:empNames) { System.out.println(s); }
		 */
		
		ArrayList<Integer> empID = new ArrayList<Integer>();
		
		empID.add(1001);
		empID.add(1002);
		empID.add(1002);
		
		for(Integer i:empID) {
			System.out.println(i);
		}
		ArrayList<Object> empdata = new ArrayList<Object>();
		
		empdata.add("Rajith");
		empdata.add(1001);
		empdata.add(45000.00);
		empdata.add(true);
		empdata.add('M');
		
		for(int i=0; i<empdata.size();i++) {
			System.out.println(empdata.get(i));
			
			if(empdata.get(i).equals("Ranjith")) {
				System.out.println("Emp name is ranjth");
				break;
			}
		}
		
		//get all the links in web page
		//start loop
		//if(ele.text().equals('You tube'))
		//click();
		//break
		
		//Dropdown
		//get all options
		//loop
		//if(ele.text().equals('India'))
		//Select the value
		// break
		ArrayList<String> empNames = new ArrayList<String>();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		empNames.add("Ram");//1
		empNames.add("Rajesh");//2
		empNames.add("Rajesh");//3
		
		empNames.remove(0);
		empNames.add(empNames.size(),"Gopi");//4
		empNames.add(empNames.size()-empNames.size(),"Madhu");//0
		System.out.println(empNames);
		
		System.out.println(empNames.get(5));
		
		
		
		
		
	}
	
	public void removeDuplicatesInArray() {
		int[] arr= new int[] {1,2,4,2,4};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
		}
	}

}
