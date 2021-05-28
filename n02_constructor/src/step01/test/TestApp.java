package step01.test;

import step01.vo.Car;
import step01.vo.Engine;
import step01.vo.Person;

/**
 * @Auth: chunkind@naver.com
 * @Date: 2021. 05. 28.
 * 특정한 사람이 (2사람을 생성...)
 * 각각의 차량을 구매한 정보를 출력하는 로직을 작성
 */
public class TestApp {
	public static void main(String[] args) {
		Person p1 = new Person("roho", 36, "여의도");
		Person p2 = new Person("niki", 28, "삼성동");
		
		Car c1 = new Car("bmw", 30000, "white", new Engine(200, 3000));
		Car c2 = new Car("volvo", 5000, "black", new Engine(250, 1000));
		
		p1.setCar(c1);
		p2.setCar(c2);
		
		System.out.println(p1.getName()+"고객님 "+c1.getModel()+"의 차량정보 "+c1.getEngine()+"엔진정보");
		System.out.println(p2.getName()+"고객님 "+c2.getModel()+"의 차량정보 "+c2.getEngine()+"엔진정보");
	}
}