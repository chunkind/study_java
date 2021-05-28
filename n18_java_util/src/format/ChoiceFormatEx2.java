package format;

import java.text.ChoiceFormat;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 3. 12.
 * # - 경계값을 범위에 포함 O
 * < - 경계값을 범위에 포함 X
 */
public class ChoiceFormatEx2 {
	public static void main(String[] args) {
		String pattern = "60#D|70#C|80<B|90#A";
		int[] scores = { 91, 90, 80, 88, 70, 52, 60 };

		ChoiceFormat form = new ChoiceFormat(pattern);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
	} // main
}
