package step03.set;

import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {
	public static void process() {
		/*Set set=  new HashSet();
		set.add("김준호");
		set.add("차태현");
		set.add("데프콘");
		set.add("정준영");
		set.add("데프콘");
		set.add("차태현");
		
		System.out.println(set);*/
		
		//TreeSet :: Unique + sorting(정렬)
		Set set = new TreeSet();		
		set.add(new Integer(23));
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		set.add(60);
		set.add(60);
		set.add(new Integer(100));
		
		
		System.out.println(set);
		//set의 또다른 기능을 알아보자...
		TreeSet ts=  (TreeSet)set;
		
		System.out.println(ts.higher(20));
		System.out.println(ts.headSet(30));
		System.out.println(ts.tailSet(30));
	}
}
