package step03;

import javax.swing.JOptionPane;

public class ShowInputDialogTest1 {
	public static void main(String[] args) {
		// 임의의 수 1~100까지의 정수가 할당되도록
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;// 사용자가 입력한 값을 여기에 저장
		String temp = " "; // 사용자가 입력한 값을 임시로 저장하는 변수
		int count = 0; // 시도 횟수 / 몇번만에 맞췄는지.. 몇번 루핑

		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100까지의 숫자를 입력하세요... 끝내시려면 -1을 입력하세요");
			if (temp.equals("-1") || temp.equals(""))
				break;// 대소문자 무시하고
			System.out.println("입력된 값 :: " + temp);

			input = Integer.parseInt(temp);
			/*
			 * 제어문을 이용해서 내가 입력한 값과 answer이 똑같아질때까지 맞춰나가는 로직을 작성 이때 두개의 값이 동일해질때까지의 count도
			 * 마지막에 출력될 수 있도록
			 * 
			 */
			if (answer > input) {
				System.out.println("더 큰값을 입력하시오");
			} else if (answer < input) {
				System.out.println("더 작은값을 입력하시오");
			} else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는 " + count + "번 입니다");
				break;
			}

		} while (true);
	}

}
