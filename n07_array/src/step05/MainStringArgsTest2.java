package step05;

public class MainStringArgsTest2 {
	public static void main(String[] args) {
		/*
		 * 실행시 값을 3개 넣을려고 한다. 만약에 값을 넣지 않으면 메세지를 출력하고 정상종료가 되도록하자.
		 */

		if (args.length != 3) {
			System.out.println("실행시 인자값 3개를 넣으세요. Try Again!");
			System.exit(0);
		}

		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);

		// 실행시 입력된 값으로 배열의 사이즈를 지정할 수 있다.

		int[] student = new int[num1]; // 동적인 프로그램.

		// 향상된 for문
		for (int s : student) {
			System.out.println(s);
		}
		int result = num1 + num2 + num3;
		System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + result);
	}
}
