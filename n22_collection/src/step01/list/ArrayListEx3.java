package step01.list;

import java.util.ArrayList;
import java.util.List;

import step01.vo.PersonVO;

/*
 * List안에 PersonVO를 저장...저장한 순서대로 들어간다.
 * ArrayList를 생성 ::
 * add() / remove() / get(i) / isEmpty() / clear(),removeAll()
 * trimToSize()
 */
public class ArrayListEx3 {
	public static void doProcess() {
		List<PersonVO> list=  new ArrayList<PersonVO>();
		
		//1. list에 vo 객체들을 저장..add()/addElement()
		list.add(new PersonVO("최란", "안양", 24));
		list.add(new PersonVO("은지", "수원", 24));
		list.add(new PersonVO("온유", "안양", 23));
		list.add(new PersonVO("지연", "서울", 26));
		list.add(new PersonVO("우진", "서울", 25));
		list.add(new PersonVO("정기", "서울", 27));
		
		System.out.println(list); //toString()
		System.out.println("List안에 저장된 사람의 갯수 : "+list.size()+" 명");
		
		//3. 첫번쨰 저장된 사람을 찾아서 정보를 출력..get()
		PersonVO vo1=(PersonVO)list.get(0);		
		System.out.println("첫번째 저장된 사람의 정보 :: "+vo1);
		
		//4. 향상된 for문을 이용해서 list에 저장된 사람들의 총 연령을 구함
		int total = 0;
		for(PersonVO vo : list){
			total += vo.getAge();
		}
		System.out.println("List에 저장된 사람들의 총 연령 :: "+total+" 세" );
		
		//5. 평균연령을 구함
		System.out.println("List에 저장된 사람들의 평균연령 :: "+total/list.size()+" 세");
	}
}
