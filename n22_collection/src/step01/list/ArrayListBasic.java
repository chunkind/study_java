package step01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasic {
	public static void doProcess() {
		List<String> list = new ArrayList<String>();
		list.add("박상훈");
		list.add("유다형");
		list.add("오준식");
		list.add("오준식");
		list.add("애니멀");

		System.out.println("List에 들어있는 데이타의 갯수 : " + list.size());
		System.out.println("List에 들어있는 데이타 내용 : " + list);

		// 1. 첫번째 데이타를 삭제
		list.remove(0);
		System.out.println(list);
		// 2. 네번째 데이타를 아이유로 수정
		list.set(3, "아이유");
		System.out.println(list);
		// 3. List안에 데이타가 비어있는지의 여부 출력
		System.out.println("데이타 비었나??" + list.isEmpty());
		// 4. 두번째 데이타를 얻어서 내용을 출력
		String item = list.get(1);
		System.out.println(item);
		// 5. List안을 다시 초기화
		list.clear();
		// 6. 마지막으로 List 안이 비었는지의 여부를 출력
		System.out.println("데이타 비었나요?" + list.isEmpty());
	}
}
