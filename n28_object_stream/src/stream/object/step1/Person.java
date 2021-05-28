package stream.object.step1;

import java.io.Serializable;

/*
 * 직렬화란 :: ObjectOutputStream을 통해서 Sink쪽으로 객체가 날라가는 것을 말한다.
 * 이때 객체의 덩어리가 날라가는 것 처럼 생각될수 있지만 사실이 아니다
 * 객체의 필드가 직렬화 되어져서 날라가는 것이다. 
 * 출력하는 기능으로는 ObjectOutputStream  writeObjcet(obj)가 사용
 * ::
 * 직렬화를 가능하게 하려면 반드시 (?) 해야된다
 * Person 클래스가 반드시 Serializable 이라는 인터페이스를 구현해야 직렬화가 가능 
 */
public class Person implements Serializable{
			private String name;
			private int age;
			private String address;
			private String password;
			
			public Person(String name, int age, String address, String password) {
				super();
				this.name = name;
				this.age = age;
				this.address = address;
				this.password = password;
			}

			public String getName() {
				return name;
			}

			public int getAge() {
				return age;
			}

			public String getAddress() {
				return address;
			}

			public String getPassword() {
				return password;
			}

			@Override
			public String toString() {
				return "Person [name=" + name + ", age=" + age + ", address="
						+ address + ", password=" + password + "]";
			}
			
}
