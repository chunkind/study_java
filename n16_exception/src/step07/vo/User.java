package step07.vo;

import step07.exception.ZeroNotDivide;

public class User {
	public void go() throws ZeroNotDivide {
		int i = 0;
		int j = 10;
		if (i == 0)
			throw new ZeroNotDivide("분모가 0이면 안됩니다...."); // 여기서 사제 폭탄 터짐

	}
}
