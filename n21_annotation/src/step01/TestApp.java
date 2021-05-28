package step01;

public class TestApp {
	void parentMethod() { }
}
class ChildTestApp extends TestApp {
	@Override
//	void parentmethod() { } // 조상 메서드의 이름을 잘못적었음. 
	void parentMethod() { } // 이름을 정확히 적어야 에러가 안난다. 
}
