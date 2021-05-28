package step07;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * 3항 연산자 사용 에제
 */
public class OperaterFlowExamTest {
	public static void main(String[] args) {
		int score = 45;
		char grade = ' ';
		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		System.out.println("당신의 학점은 " + grade + "입니다");
	}
}

//변수의 타입이 기본형 : 값이 바로 할당
//변수의 타입이 클래스 타입 : 값을 참조하는 주소값

// 1.stack 영역에 p라는 공간이 만들어짐
// 2.Heap에 Field를 위한 공간이 만들어짐
// 3.묵시적 초기화 name에 null / age에 0 --> 생성자 구동에 의한 초기화 (명시적 초기화)
// 4.주소값 지정 - 객체가 저장된 위치값 / 객체가 생성
// 5.P라는 변수에 주소값이 할당
// 6.stack 영역에 P가 Heap 영역에 객체들 참조

/*
 * 주소값이 같다는건 참조한다는 뜻 heap에 있는 참조가 끊어진 객체를 제거할때 g.c -언제 제거할지 모름(Thread) 우선순위가 1
 * -낮다 하지만 쓰레기 객체가 많아질수록 순위가 올라간다. 참조가 끊어진 힙의 영역에 객체가 g.c의 먹잇감 즉각적인 제거는 안되지만
 * 절대적으로
 */
