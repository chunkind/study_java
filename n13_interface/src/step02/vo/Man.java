package step02.vo;

import step02.action.Attackable;

public class Man implements Attackable{

	@Override
	public int attack() {
		System.out.println("주먹으로 10의 데미지를 준다.");
		return 10;
	}

}
