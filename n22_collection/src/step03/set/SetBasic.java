package step03.set;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {
	public static void process() {
		Set set = new HashSet();
		//add 
		set.add("임현주");
		set.add("오우진");
		set.add("유진호");
		set.add("애니멀");
		set.add("애니멀");
		//toString()이 Collection에서는 오버라이딩 되어져 있다
		System.out.println(set);  
		System.out.println("Set에 저장된 데이타의 갯수 : " +set.size() ); //4
		
		//오우진이 들어있는지의 여부 
		boolean b = set.contains("오우진");
		System.out.println("우진씨가 정말 저장되어 있나요??"+ b);
		
		//임현주에 있는 데이타를 삭제... 순서가 없다...index가 없다.
		//순서가 있다는 것은 내부적으로 데이타를 index로 관리함을 의미한다.
		set.remove("임현주");
		System.out.println(set);
		
		
		//set안에 들어있는 모든 데이타를 삭제..clear(). removeAll()
		set.removeAll(set);
		System.out.println(set);
		set.clear();
		System.out.println(set);
			
	}
}
