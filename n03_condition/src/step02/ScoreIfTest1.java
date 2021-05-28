package step02;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * 해당 성적별로 학점을 출력하는 소스 코드를 작성
 * 이때 제어문에 사용하는 if, else if, else라는 키워드 모두 사용
 * 
 * &, && => and 우선순위가 & < && 가 된다.
 * |, || => or 우선순위가 | < || 가 된다. 
 * 
 */
public class ScoreIfTest1 {
	public static void main(String[] args) {
		//컴파일 시점에 값을 셋팅(문제점 : 하드코딩)
		int score = 78;
		/* 성적이 90~100점인 경우는 A학점을 출력 
		 * 성적이 80~89점인 경우는 B학점을 출력
		 * 성적이 70~79점인 경우는  C학점을
		 * 출력 성적이 그외인 경우는 "Try Again"을 출력
		 */
		if (score >= 90 && score <= 100) {
			System.out.println("A 학점을 드립니다");
		} else if (score >= 80 && score < 90) {
			System.out.println("B 학점을 드립니다");
		} else if (score >= 70 && score < 80) {
			System.out.println("C 학점을 드립니다");
		} else {
			System.out.println("Try Again");
		}
	}
}
/* 해당 코드의 문제점 :: 78점이라는 성적이 소스코드에 하드코딩 되어져 있다.
 * 이렇게 되면 이 프로그램은 78점일 때에만 돌아가는프로그램이 된다
 * 
 * 해결책 :: 값이 컴파일 시점에 입력되어 돌아가도록 하지 말고 
 * 실행 시점에 그때마다 다른 값을 넣을수 있고 그 값이 실행될수 있도록 변수로처리할수 있어야 한다.
 * 어떤 사람에 대한 성적인지도 알수 있도록 처리해주자...
 */