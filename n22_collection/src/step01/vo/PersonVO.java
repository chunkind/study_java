package step01.vo;

public class PersonVO {
	private String name;
	private String addr;
	private int age;
	
	public PersonVO(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", addr=" + addr + ", age=" + age
				+ "]";
	}
}
