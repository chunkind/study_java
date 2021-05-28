package step02;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 생성자 오버로딩(Constructor Overloading).
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
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	/**
	 * @Auth K. J. S.
	 * @Date 2019. 1. 4.
	 * ssn(고객일련번호), name(고객이름), tel(고객전화번호) 받는 생성자.
	 */
	public Member(int ssn, String name, String tel) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.tel = tel;
	}
	
	/**
	 * @Auth K. J. S.
	 * @Date 2019. 1. 4.
	 * ssn(고객일련번호), name(고객이름), tel(고객전화번호), address(고객주소), email(고객 메일) 받는 생성자.
	 */
	public Member(int ssn, String name, String tel, String address, String email) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.tel = tel;
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
