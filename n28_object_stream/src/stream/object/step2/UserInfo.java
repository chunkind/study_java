package stream.object.step2;

import java.io.Serializable;

//ObjectStream을 통과하는 객체...
public class UserInfo implements Serializable {
			/**
	 * 
	 */
	private static final long serialVersionUID = -1847303370718317387L;
			static final String DEFAU_NAME = "아무개";
			static final int DEFAULT_AGE = 22;
			String name;
			int age;
			/*
			 * password같은 필드는 고객의 정보중 보안상 주의가 필요한 정보
			 * 이런 정보는 감춰서 스트림을 통과해야 한다.
			 * password 자체를 던지지 않는것이 아니라 
			 * 던져는 지는데 값으로 기본값을 덮어쓰고 날라간다.
			 * 이런 방법이 바로 transient를 이용하는 것이다.
			 */
			transient String password;  
			int pp;  //추가 
			
			public UserInfo(String name, int age, String password) {
				super();
				this.name = name;
				this.age = age;
				this.password = password;
			}
			
			public UserInfo(){
				this(DEFAU_NAME,  DEFAULT_AGE, "1111");
			}
			//생성자 2개를 작성... 인자값 3, 기본 생성자... 생성자 앞의 this를 사용 

			@Override
			public String toString() {
				return "UserInfo [name=" + name + ", age=" + age
						+ ", password=" + password + "]";
			}

			public String getPassword() {
				return password;
			}
			}
/*
 * 직렬화된 객체를 다시 역직렬화 했을때 동일한 객체를 사용
 * 클래스 이름이 같다고 동일한 객체가 아니다. 클래스의 내용이 변경되면 
 * 역직렬화는 결국 실패한다.
 * 직렬화한 객체를 역직렬화 했을때 하나의 동일한 객체가 수행되어야 하는데 
 * 이때 대상 클래스의 serialVersionUID 값이 동일한 객체임을 알려주는 식별값이 된다.
 * 우리 serialVersionUID 값을 따로 명시하지 않으면 jvm에서 기본값을 부여해준다
 *
 *클래스 내용이 수정되면 그때마다 다른 값이 부여된다.
 * 
 */
			
			
