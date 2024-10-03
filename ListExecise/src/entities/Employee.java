package entities;



public class Employee {
	private int id;
	private double salary;
	private String name;

	public Employee(int id, float salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void salaryIncrease(float increasePercent) {
		this.salary += salary * (increasePercent*0.01);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + ", "+ name + ", " + salary;
	}
}
