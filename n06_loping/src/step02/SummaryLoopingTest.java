package step02;

/*
 * 1~10까지의 총합을 구하는 반복문의 로직.. : : for / while 
 */
public class SummaryLoopingTest {

	public static void main(String[] args) {
		System.out.println("====== for를 이용한 총합 구하기 ======");
		int sum = 0;// 합한 값들이 저장되는 변수로 사용

		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum +i
		}
		System.out.println("1~10까지의 총합 : : " + sum);

		System.out.println("====== While를 이용한 총합 구하기 ======");
		int i = 1;
		int whileSum = 0;
		while (i <= 10) {
			whileSum += i;
			i++;

		}
		System.out.println("1~10까지의 총합 ");

	}

}
