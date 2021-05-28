package vo;

public class Student extends Member{
	private String className;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [className=" + className + ", getId()=" + getId() + ", getPw()=" + getPw() + ", getName()="
				+ getName() + ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}
}