package step02.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import step02.vo.CustomerVO;

/*
 * Map에서 제공되는 중요한 기능을 알아볼수 있는 로직
 * 여기서 나오는 기능은 자유자재로 원활하게 사용할수 있어야 합니다.
 * ::
 * put()
 */
public class MapEx01 {
	public static void doProcess() {
		HashMap<String, CustomerVO> map = new HashMap<String, CustomerVO>();
		
		map.put("111", new CustomerVO("lee", "이경규", 56));
		map.put("222", new CustomerVO("soung", "성유리", 28));
		map.put("333", new CustomerVO("kim", "김재동", 34));
		
		//1. Map에 들어있는 성유리의 정보를 출력..
		System.out.println(map.get("222"));
		
		
		//2. id가 kim인 객체를 찾아서 그 사람의 이름을 출력
		//   (set의 iterator()를 사용)
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String key = it.next();
			CustomerVO vo=map.get(key);
			if(vo.getId().equals("kim"))
				System.out.println("id가 kim인 사람의 이름 :: "+vo.getName());
		}		
		//3. map에 들어있는 키값만 찾아서 키값들만 출력
		//   (keySet()을 사용)
		Set<String> keySet=map.keySet();
		System.out.println(set);
		
		//4. map에 들어있는 사람들의 나이의 총합을 구하고 그 평균연령을 출력
		//  (set의 iterator()를 사용)
		it = set.iterator();
		int custAllAge=  0;
		
		while(it.hasNext()){
			String key=  it.next();
			CustomerVO cust = (CustomerVO)map.get(key);
			custAllAge += cust.getAge();
		}
		System.out.println("고객들의 총 연령은 :: "+custAllAge+" 세");		
	}
}
