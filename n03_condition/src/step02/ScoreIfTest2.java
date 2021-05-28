package step02;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * 컴파일 시점이 아닌 실행시점에 값을 투입
 * 이 투입된 값을 소스 코드에서 다시 변수로 할당할 것이다.
 */
public class ScoreIfTest2 {
	public static void main(String[] args) { // main을 실행 메소드/ void가 리턴 타입/ String으로 제약
		// int score = 78;
		int score = Integer.parseInt(args[0]); // 데이타 타입이 맞지 않아서 형변환 함 String --> int = integer
		String name = args[1];

		if (score >= 90 && score <= 100) {
			System.out.println(name + " A 학점을 드립니다");
		} else if (score >= 80 && score < 90) {
			System.out.println(name + "B 학점을 드립니다");
		} else if (score >= 70 && score < 80) {
			System.out.println(name + "C 학점을 드립니다");
		} else {
			System.out.println("Try Again");
		}

	}

}
/* 실행할때마다 Run<Run configuration으로 들어가서 인자갑을 일일이 세팅하는 것은 매우 번거로운 일이다 이런 환경에서 값을
 * 주입시키지 않는다
 * 해결책 : : 실행시 콘솔창에서 값을 바로 입력하고 입력된 값이 소스 코드의 변수로 할당되도록 로직을 다시 작성
 */