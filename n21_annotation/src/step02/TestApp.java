package step02;

public class TestApp {
	public static void main(String args[]) {
		NewClass nc = new NewClass();

		nc.oldField = 10;                     //@Depreacted가 붙은 대상을 사용
		System.out.println(nc.getOldField()); //@Depreacted가 붙은 대상을 사용
	}
}

class NewClass {
	int newField;

	int getNewField() { 
		return newField;
	}	

	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() { 
		return oldField;
	}
}