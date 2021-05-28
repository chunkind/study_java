package step06;

public class PersonArraryTest1 {

	public static void main(String[] args) {
		// 1. 여러명의 사람을 저장할 배열을 생성.. 세칸짜리 p
		Person[] p = new Person[3];
		System.out.println(p); // 배열의 주소값
		System.out.println(p.toString());
		System.out.println(p.hashCode()); // 해쉬코드로 찍어라.

		// 2. for문을 이용해서 각각의 칸에 들어있는 값을 출력.
		/*
		 * for(int i=0; i<p.length i++){ System.out.println(p[i]); }
		 */

		for (Person per : p) { // per는 참조변수
			System.out.println(per + ",");
		}
		System.out.println("\n");

		// 3. 각각의 배열의 항목에 Person 객체를 할당
		p[0] = new Person("아이유", 25, "여의도");
		p[1] = new Person("수지", 25, "동대문");
		p[2] = new Person("탑", 27, "판교");

		// 4. for문을 이용해서 각각의 칸에 들어있는 값을 출력.
		System.out.println("===== 주소값 출력 ===== \n"); // 주소값이 항상 문자열로 찍힘.

		for (Person per : p) { // per는 참조변수.
			System.out.println(per + ", "); // 주소값
		} // 반찬통 안에 있는 위치값.

		// 5. 각각 객체의 정보를 출력.
		System.out.println("\n ===== Person 정보 출력 =====");

		for (Person per : p) {
			System.out.println(per.getTotalInfo());
		}
	}
}

/*
 * Person에 대한 정보를 저장하는 클래스 해당 클래스를 통해서 원하는 만큼의 Person 이 만들어 진다. 만들어진(생성된) Person
 * 객체들은 Person타입의 배열에 넣어서 다룰것이다.
 */
class Person {

	private String name;
	private int age;
	private String address;

	public Person() {
	}

	public Person(String name, int age, String address) {

		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getTotalInfo() {
		return name + "\t" + age + "\t" + address;
	}
}
