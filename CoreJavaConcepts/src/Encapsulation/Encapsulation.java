package Encapsulation;

class Student{
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Pallavi");
		System.out.println(s.getName());
	}

}
