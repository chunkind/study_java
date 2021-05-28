package step02;

// 운동선수에 대한 정보를 담고 있는 클래스
public class Player {
	// public이 붙어있는 필드는 다른 동네에 다 접근 가능하다 (다른 패키지 접근 가능) 단 public 없을시 다른 곳에 접근 불가능
	// Access Modifier 접근 지정자
	String name;
	double salary;
	String agent;
	boolean isManager;
	double bonus;
	
	/*
	 * 선수에 대한 정보를 주입하는 루트로 생성자를 사용했다. 
	 * 그렇기 때문에 setter()를 통해서 값의 주입은 필요없다. 대신에
	 * getter()는 만들어서 주입된 값을 리턴받도록 하자.
	 */
	public Player(String name, double salary, String agent, boolean isManager) {
		super();
		// this는 "해당 클래스 자기자신을 가리키는 키워드 : 해당 클래스 맴버인 name" 결과적으로 field
		this.name = name;
		this.salary = salary;
		this.agent = agent;
		this.isManager = isManager;
	}

	public String getPlayerDetails() {
		return name + "선수의 소속사는 : : " + agent;
	}

	// 선수의 연봉을 리턴하는 기능을 정의.
	public double getYearSalary() {
		return (salary * 12) + bonus;
	}

	// 해당 선숫가 담당 매니저가 있는지의 여부를 리턴해주는 기능을 정의
	public String getIsManager() {
		return name + "선수의 매니저 여부 : : " + isManager;
	}
}