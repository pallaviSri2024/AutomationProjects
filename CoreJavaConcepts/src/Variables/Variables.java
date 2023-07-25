package Variables;

public class Variables {
//Global Variable	
 public static String name = "Oreo brother";
 
	public static void main(String[] args) {
		int a; //declaration
		a = 300; // initialization
		System.out.println(a);//utilization
		
		int b; //declaration
		b = 500; // initialization
		System.out.println(b);//utilization
		
	System.out.println("from main method() = " + name);
	m1();
	
	//Create Object
	Variables obj = new Variables();
	obj.m1();
	}
	public static void m1() {
		System.out.println("In m1 from main method() = " + name);
		//System.out.println("Instance Variable = " +rollnumber);
	}
}
