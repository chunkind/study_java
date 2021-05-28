package step14;

class MemberArray {
	public static void printMember(String name) throws DuplicateNameException {
		String[] names = { "서현", "유리", "아이유", "지나" };
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i]))
				throw new DuplicateNameException(name + "이라는 회원은 이미 저장되어 있습니다.");

		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println(name);
		/*
		 * 구현.. 소녀시대 멤버들의 이름이 출력되고 실행시 입력받은 아이돌가수의 이름이 마지막에 출력되도록 로직을 작성
		 */
	}
}
class DuplicateNameException extends Exception { // 첫 시작
	DuplicateNameException() {
		this("이미 있습니다...");
	}
	DuplicateNameException(String message) {
		super(message);
	}
}
public class TestApp {
	public static void main(String[] args) {
		// 이부분에서 예외가 발생....적어도 2개 발생...예외를 처리..
		// 하나는 api / 나머지 하나는 사제폭탄(DuplicateNameException)
		try {
			String str = args[0];// 실행시 아이돌 여자가수 이름을 하나 입력
			MemberArray.printMember(str);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력이 안되었습니다... 실행시 회원 이름을 입력 바랍니다");
		} catch (DuplicateNameException e) {
			System.out.println(e.getMessage());
		}

	}
}
