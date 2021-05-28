package step03;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 생성자 오버로딩(Constructor Overloading).
 * this 사용법  -
 * 해당 클래스 자기 자신을 의미하는 키워드 
 * 1) 로컬변수와 필드와 이름이 같을때 이를 구분하기 위해서 필드 앞에 붙인다.
 * 2) 생성자 앞에 붙인다.
 *    같은 클래스 내에서 또다른 생성자를 호출할때 this 쓰인다.
 *    생성자 오버로딩에서 반드시 사용될수  밖에 없다.
 *    
 *    this, this()
 *    this -> 객체 자신.
 *    this() -> 생성자에서 생성자 호출을 의미.
 */
public class Member {
	private int ssn;
	private String name;
	private String tel;
	private String address;
	private String email;

	/**
	 * @Auth K. J. S.
	 * @Date 2019. 1. 4.
	 * ssn(고객일련번호) 받는 생성자.
	 */
	public Member(int ssn) {
		super();
		this.ssn = ssn;
	}
	
	/**
	 * @Auth K. J. S.
	 * @Date 2019. 1. 4.
	 * ssn(고객일련번호), name(고객이름) 받는 생성자.
	 */
	public Member(int ssn, String name) {
		this(ssn);
		this.name = name;
	}
	
	/**
	 * @Auth K. J. S.
	 * @Date 2019. 1. 4.
	 * ssn(고객일련번호), name(고객이름), tel(고객전화번호) 받는 생성자.
	 */
	public Member(int ssn, String name, String tel) {
		this(ssn, name);
		this.tel = tel;
	}
	
	/**
	 * @Auth K. J. S.
	 * @Date 2019. 1. 4.
	 * ssn(고객일련번호), name(고객이름), tel(고객전화번호), address(고객주소), email(고객 메일) 받는 생성자.
	 */
	public Member(int ssn, String name, String tel, String address, String email) {
		this(ssn, name, tel);
		this.address = address;
		this.email = email;
	}

	/**
	 * @Auth K. J. S.
	 * @Date 2019. 1. 4.
	 * 객체 정보를 출력.
	 */
	public String getDetails() {
		return "============================고객정보============================\n" +
			   "ssn : " + ssn + "\nname : " + name + "\ntel : " + tel +
			   "\naddress : " + address + "\nemail : " + email + "\n" +
			   "=============================================================\n";
	}
	
}
