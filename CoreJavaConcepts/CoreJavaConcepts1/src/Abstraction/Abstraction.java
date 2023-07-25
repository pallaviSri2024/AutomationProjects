package Abstraction;

abstract class Bank{
	abstract int getInterestRate();
}
class Citi extends Bank{
	int getInterestRate(){
		return 7;
	}
}
class Hsbc extends Bank{
	int getInterestRate() {
		return 6;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Bank b = new Citi();
		System.out.println("Citi Rate of Interset is"+ b.getInterestRate()+"%");
		Bank c= new Hsbc();
		System.out.println("Hsbc Rate of Interest is" + c.getInterestRate()+"%");
		

	}

}
