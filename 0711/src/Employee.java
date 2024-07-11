
public class Employee {
	String sabun;
	double salary;
	
	public Employee() {
//		this.sabun = null;
//		this.salary = 0.0;
		this("임시사번", 10_000_000);
	}
	
	public Employee(String sabun) {
		this.sabun = sabun;
	}
	
	public Employee(double salary) {
		this.salary = salary;
	}
	
	public Employee(String sabun, double salary) {
		this.sabun = sabun;
		this.salary = salary;
	}

}
