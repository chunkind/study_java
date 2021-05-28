package step03.child;

import step03.parent.Parent;

public class Child extends Parent {
	public void test() {
		System.out.println(publicTest);
		System.out.println(protectedTest);
//		System.out.println(defaultTest);
//		System.out.println(privateTest);
	}

	public Child() { 
		//자식 생성자 구현부.... 첫라인에서 부모 생성 super() 가 숨어 있다!!
		System.out.println("Child Construct!!");
	}

	@Override
	public void access() {
		super.access();
		System.out.println("상속받은 필드 ::" + publicTest);
		System.out.println("상속받은 필드 ::" + protectedTest);
	}
}