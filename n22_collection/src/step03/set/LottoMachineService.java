package step03.set;

import java.util.Random;
import java.util.TreeSet;

/*
 * 1~45의 숫자중에서 랜덤하게 6개의 수를 골라서 Set에 담을 것이다.
 * 물론 Set에 저장되기 때문에 동일한 숫자는 결코 함께 저장되지 않는다.
 * 이때 저장되는 숫자가 정렬의 기능까지 담을수 있도록 하자
 * page 489 예제 11-25
 */
public class LottoMachineService {
	public TreeSet createLottoNumber(){
		TreeSet set = new TreeSet();
		//random() 를 이용해서 다시 작성...		
		for(int i=0; set.size()<6; i++){
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		return set;
	}
}

/*Random r = new Random();

while(set.size()<6){
	int num = r.nextInt(45)+1;
	set.add(num);
}*/











