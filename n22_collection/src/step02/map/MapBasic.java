package step02.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapBasic {
	public static void doProcess() {
		HashMap<String, Integer> map = new HashMap<String,Integer> ();
		map.put("배창규", 98);
		map.put("최민재", 89);
		map.put("윤장훈", 95);
		map.put("정도용", 84);
		map.put("오형석", 86);
		
		//1. Map을 생성했다면 Map안에 들어있는 key값을 얻어낸다.
		System.out.println("======== entryset() or keySet()=======");
		Set <String> Set = map.keySet();
		
		//2. set에 들어있는 key값들을 얻어낸다.
		Iterator<String> it = Set.iterator();
		int total = 0;
		while(it.hasNext()){
			String name = it.next();
			int score = map.get(name);
			total += score;
		}
		System.out.println("총점 : " + total+ "점");
		System.out.println("평점 : " + total/map.size()+ "점");
		System.out.println("최고점수 : " + Collections.max(map.values()));
		//3. key값을 통해서 key에 해당하는 점수를 얻어낸다.
	    //이때 총점, 평균, 최고점수를 각각 출력하는 로직을 작성하시오...
	}
}
