package step02.vo;

import step02.action.Attackable;

public class Tiger implements Attackable{

	@Override
	public int attack() {
		System.out.println("깨물어 100의 데미지를 준다.");
		return 100;
	}

}
