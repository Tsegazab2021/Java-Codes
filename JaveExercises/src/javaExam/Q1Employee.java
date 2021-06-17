package javaExam;

public class Employee {

	private String name;
	private String city;
	private String state;
	private double grossSalary;
	private double netSalary;
	private double tax = 0.2;

	public Employee(String name, String city, String state, double grossSalary, double netSalary) {

		this.name = name;
		this.city = city;
		this.state = state;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {

		this.netSalary = netSalary;
	}

	public void calculateNetSalary(int pfpercentage) {
		this.netSalary = this.grossSalary - (this.grossSalary * tax / 100);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", state=" + state + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + ", tax=" + tax + "]";
	}

	public static void main(String[] args) {

		Employee emp = new Employee("Hagos","Charlotte", "NC",100000, 80000);
		System.out.println(emp);
	}

}
