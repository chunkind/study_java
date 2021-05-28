package event.handler.test;
interface WindowL{
	void a();
	void b();
	void c();
	void d();
	void e();
	void f();
}
class WindowImpl implements WindowL{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}
class WindowClass extends WindowImpl{
	@Override
	public void a() {
		System.exit(0);
	}
}
public class Test {

	public static void main(String[] args) {
		WindowClass wc =new WindowClass();
		System.out.println("프로그램을 닫습니다...");
		wc.a();
	}
}





