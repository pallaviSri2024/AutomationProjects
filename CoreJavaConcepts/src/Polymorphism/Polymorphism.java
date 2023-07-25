package Polymorphism;

class Calculate {
	 // Method with 2 integer parameters
	 static int Multiply(int a, int b)
	 {
	 // Returns product of integer numbers
	 return a * b;
	 }
	 // Method 2
	 // With same name but with 2 double parameters
	 static double Multiply(double a, double b)
	 {
	 // Returns product of double numbers
	 return a * b;
	 }
	}

public class Polymorphism {
	
	public static void main(String[] args) {
		System.out.println(Calculate.Multiply(2, 4));
		System.out.println(Calculate.Multiply(5.5, 6.3));

	}

}
