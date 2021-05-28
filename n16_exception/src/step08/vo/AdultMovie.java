package step08.vo;

import step08.exception.UserAgeException;

public class AdultMovie {
	public void enter(int age) throws UserAgeException {
		if (age < 19) {
			throw new UserAgeException("당신은 성인영화를 관람할수 없습니다..");
		} else {
			System.out.println("Ticketing... 입장");
			System.out.println("당신은 성인영화를 관람하실수 있습니다...");
		}
	}
}