package step04;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TestApp {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		for(int i=0; set.size()<6; i++){
			int num = (int)(Math.random()*45)+1; //1~45 사이의 랜덤한 숫자
			set.add(num);
		}
		//System.out.println(set);
		//Collections.sort(set);
		List list = new LinkedList(set);
		Collections.sort(list);
		
		//list안에 있는 값을 하나 추가하고(맨 앞에) 출력
		LinkedList link = (LinkedList)list;
		link.addFirst("ko");
		System.out.println(list);
		
		//list안에 있는 값을 하나 삭제하고(맨 앞에 값을) 출력
		link.removeFirst();
		System.out.println(list);		
	}
}
