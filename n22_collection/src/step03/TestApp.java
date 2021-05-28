package step03;

import java.util.TreeSet;

import step03.set.LottoMachineService;
import step03.set.SetBasic;
import step03.set.SetEx01;

public class TestApp {
	public static void main(String[] args) {
		//1번 예제
		SetBasic.process();
		
		//2번 예제
		SetEx01.process();
		
		//3번 예제
		LottoMachineService service = new LottoMachineService();
		TreeSet set=service.createLottoNumber(); 
		System.out.println("당신이 추첨하신 Lotto Number : "+set);
	}
}
