package Assignments;

//Create a class employee with the following instance variables	
class Employee{
	
	static long employeeId;
	static String employeeName;
	static String employeeAddress;
	static long employeePhone;
	static double basicSalary;
	static double specialAllowance = 250.80;
	static double HRA = 1000.50;
	
	//Create  an  overloaded  constructor  in  the employee class
	protected static long getEmployeeId(){
		return employeeId;
	}
	
	protected static void setEmployeeId(long employeeId) {
		Employee.employeeId=employeeId;
	}
	
	protected static String getEmployeeName(){
		return employeeName;
	}
	
	protected static void setEmployeeName(String employeeName) {
		Employee.employeeName=employeeName;
	}
	
	protected static String getEmployeeAddress(){
		return employeeAddress;
	}
	
	protected static void setEmployeeAddress(String employeeAddress) {
		Employee.employeeAddress=employeeAddress;
	}
	
	protected static long getEmployeePhone(){
		return employeePhone;
	}
	
	protected static void setEmployeePhone(long employeePhone) {
		Employee.employeePhone=employeePhone;
	}
	
	public static void calculateSalary () {	
		double salary = basicSalary + (basicSalary * specialAllowance/100) + basicSalary * HRA/100;
		System.out.println(salary);
	}
	
	public double calculateTransportAllowance () {
		double transportAllowance = 10/100*basicSalary;	
		return transportAllowance;
	}
	
}

class Boss extends Employee {

	protected static double getBasicSalary() {
	return getBasicSalary();
	}
	
	protected static void setBasicSalary(double basicSalary) {
	Boss.basicSalary = basicSalary;
	}

@Override
public double calculateTransportAllowance () {
	double transportAllowance = 15 * basicSalary/100;	
	return transportAllowance;
}

}

class Trainee extends Employee {

	protected static double getBasicSalary() {
	return getBasicSalary();
	}

	protected static void setBasicSalary(double basicSalary) {
	Trainee.basicSalary = basicSalary;
	}

	@Override
	public double calculateTransportAllowance () {
	double transportAllowance = 10/100 * basicSalary;
	return transportAllowance;
}
} 

public class InheritanceActivity {
	
	static Boss boss = new Boss();
	static Trainee trainee = new Trainee();
	
	public static void main(String[] args) {
		
		testCase1(); //manager salary
		System.out.println(boss.calculateTransportAllowance()); //manager transport allowance
		
		testCase2(); //trainee salary
		System.out.println(trainee.calculateTransportAllowance()); //trainee transport allowance
		}

	protected static void testCase1() {
		
		boss.setEmployeeId(101);
		boss.setEmployeeName("Ram");
		boss.setEmployeeAddress("Gurugram");
		boss.setEmployeePhone(999999);
		boss.setBasicSalary(80000);
		boss.calculateSalary();
		
	}

	protected static void testCase2() {
		
		trainee.setEmployeeId(102);
		trainee.setEmployeeName("Rohan");
		trainee.setEmployeeAddress("Noida");
		trainee.setEmployeePhone(899999);
		trainee.setBasicSalary(30000);
		trainee.calculateSalary();
		
	}

}


