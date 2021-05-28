package step02.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import step02.vo.CustomerVO;

/*
 * Map ::
 * put(key,value) / remove(key) / 
 * keySet() : Set/ values() : Collection
 * 
 * entrySet() : Set
 * Iterator i=set.iterator()
 * while(i.hasNext()){
 *  Map.Entry e = (Map.Entry)i.next();
 *  String key = e.getKey();
 *  String value = e.getValue();
 *  }
 * 
 */
public class MapEx02 {
	public static void doProcess() {
		HashMap<String, CustomerVO> map = new HashMap<String, CustomerVO>();
		
		map.put("111", new CustomerVO("lee", "이경규", 56));
		map.put("222", new CustomerVO("soung", "성유리", 28));
		map.put("333", new CustomerVO("kim", "김재동", 34));
		
		//1. Map에 들어있는 성유리의 정보를 출력..
		System.out.println(map.get("222"));
		
		
		//2. id가 kim인 객체를 찾아서 그 사람의 이름을 출력		
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Map.Entry e=(Map.Entry)it.next();
			CustomerVO vo = (CustomerVO)e.getValue();
			if(vo.getId().equals("kim")){
				System.out.println("id가 kim인 사람의 name : "+vo.getName());
				break;
			}
		}
				
		//3. map에 들어있는 키값만 찾아서 키값들만 출력
		//   (keySet()을 사용)
		Set<String> keySet=map.keySet();
		System.out.println(set);
		
		//4. map에 들어있는 사람들의 나이의 총합을 구하고 그 평균연령을 출력
		//  (set의 iterator()를 사용)
		/*it = set.iterator();
		int custAllAge=  0;
		
		while(it.hasNext()){
			String key=  it.next();
			CustomerVO cust = (CustomerVO)map.get(key);
			custAllAge += cust.getAge();
		}
		System.out.println("고객들의 총 연령은 :: "+custAllAge+" 세");*/
		
		//이번에는 다른 방법을 사용...
		int custAllAge2 = 0;
		Collection<CustomerVO> c=map.values();
		Iterator<CustomerVO> i=c.iterator();
		while(i.hasNext()){
			custAllAge2 +=  i.next().getAge();
		}
		System.out.println("고객나의의 총합 : "+custAllAge2+" 세");
		System.out.println("고객들 나이의 평균 : "+custAllAge2/map.size()+" 세");
	}
}
















