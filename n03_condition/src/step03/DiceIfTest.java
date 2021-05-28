package step03;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * Dice Test ::
 * 주사위는 1~6까지의 숫자를 랜덤하게 출력하는 특징을 가지고 있다.
 * Math 클래스의 random()을 이용해서 주사의 로직을 제어문과 함께 작성
 */
public class DiceIfTest {
	public static void main(String[] args) {
		//System.out.println("random value :: "+Math.random());
		
		//랜덤값은 double이니까 int를 casting해서 괄호로 싸준다
		//1~6사이의 값이 random하게 할당되도록 random() 사용
		int num = (int) (Math.random() * 6 + 1); 
		System.out.println(num);

		//if, else if, else를 이용해서 Dice 1...
		//제어문 안의 statment가 한줄일때는 {를 생략 가능
		if (num == 1)
			System.out.println("Dice 1...");
		else if (num == 2)
			System.out.println("Dice 2...");
		else if (num == 3)
			System.out.println("Dice 3...");
		else if (num == 4)
			System.out.println("Dice 4...");
		else if (num == 5)
			System.out.println("Dice 5...");
		else
			System.out.println("Dice 6...");
	}
}