package step04.itf;

public interface DataSource {
	String HOST = "10.123.1.2"; // public static final 이 생략
	static final int PORT = 8080; // public 생략
	
	void a(); //public 이 생략... 구현하는 객체를 보면 public 이 무조건 들어간다.
}