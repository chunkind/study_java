package step02;

public class IdolFanAgeTest2 {
	public static void main(String[] args) {
		int[] idol = new int[5];
		idol[0] = 10;
		idol[1] = 20;
		idol[2] = 30;
		idol[3] = 40;
		idol[4] = 50;

		// 1. 세번째 칸의 연령층을 60으로 수정
		idol[2] = 60;

		// 2. 해당 배열의 사이즈를 출력
		System.out.println("배열 사이즈 : " + idol.length);

		// 3. for문을 이용해서 각각의 FanAge를 출력
		for (int i = 0; i < idol.length; i++) {
			System.out.println(idol[i] + "age");
		}

		// 4. 30대를 초과하는 연령층을 출력
		for (int i = 0; i < idol.length; i++) {
			if (idol[i] > 30) {
				System.out.println("30대 초과" + idol[i]);
			}
		}

		// 5. idol 그룹의 평균 연령대를 출력...~40세이다.
		int sum = 0;

		for (int i = 0; i < idol.length; i++) {
			sum += idol[i];
			System.out.println("idol 평균 연령대 :" + sum / idol.length + "세이다");

		}
	}

}
