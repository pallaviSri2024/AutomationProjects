package Inheritance;

class Calculation{
	public void addition(int x, int y) {
		int z= x +y;
		System.out.println("The sum of two numbers=" + z);
	}
	public void subtraction(int x, int y) {
		int z = x-y;
		System.out.println("The difference of two numbers=" + z);
	}
}

public class Inheritance extends Calculation{
	public void multiplication(int x, int y) {
		int z = x * y;
		System.out.println("The multiplication of two numbers="+ z);
	}
	public static void main(String[] args) {
		int a= 20, b= 10;
		Inheritance demo = new Inheritance();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		
	}

}
