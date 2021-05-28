package step02.vo;

public class Manager extends Employee {
	private String dept;

	public Manager(String empId, String name, String addr, int salary, String dept) {
		super(empId, name, addr, salary);
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + ", Manager is dept =  " + dept;
	}
}