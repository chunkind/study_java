package vo;

public class Teacher extends Member{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", getId()=" + getId() + ", getPw()=" + getPw() + ", getName()="
				+ getName() + ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}
}
