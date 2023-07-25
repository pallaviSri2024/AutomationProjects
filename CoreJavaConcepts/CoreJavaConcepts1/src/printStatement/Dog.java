package printStatement;

import Variables.Variables;

public class Dog {
	
	public static void bark() {
		System.out.println("Oreo barks");
	}

	public static void sleep() {
		System.out.println("Oreo sleeps");
	}
	
	public static void eat() {
		System.out.println("Oreo eats Oreo");
		System.out.println("Who eats more = " +Variables.name);
	}
	
	public static void main(String[] args) {
		// method calling
		
		bark();
		eat();
		sleep();
		eat();

	}

}
