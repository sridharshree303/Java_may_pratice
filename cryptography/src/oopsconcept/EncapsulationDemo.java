package oopsconcept;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getSalary());
		emp.setSalary(10000);
		System.out.println(emp.getSalary());
	}
}
