package step04.test;

import java.util.Vector;

import step04.ship.Boat;
import step04.ship.Cruise;
import step04.ship.Ship;

public class TestApp {
	public static void main(String[] args) {
		
//		Vector를 만들어 각각의 Boat 객체와 Cruise객체를 생성하여 넣는다 
		Vector<Ship> v = new Vector<Ship>();
		v.add(new Boat("Boat01", 500));
		v.add(new Cruise("Curise01", 1000));
		
//		생성된 객체의 정보 출력 – 루프구문 사용
		System.out.println(" shipName       fuelTank     ");
		System.out.println("-----------------------------");
		for (int i = 0; i < v.size(); i++) {
			Ship sh = v.get(i);
			System.out.println(sh.toString());
		}
		System.out.println();
		
//		각각의 Ship 객체에 10 운항 후 객체 정보 출력 - 루프구문 사용
		System.out.println("10운항");
		System.out.println(" shipName       fuelTank     ");
		System.out.println("-----------------------------");
		for (int i = 0; i < v.size(); i++) {
			Ship sh = v.get(i);
			sh.sail(10);
			System.out.println(sh.toString());
		}
		System.out.println();
		
//		각각의 Ship 객체에 50 주유 후 객체 정보 출력 – 루프구문 사용
		System.out.println("50운항");
		System.out.println(" shipName       fuelTank     ");
		System.out.println("-----------------------------");
		for (int i = 0; i < v.size(); i++) {
			Ship sh = v.get(i);
			sh.refuel(50);
			System.out.println(sh.toString());
		}
		System.out.println();
	}
}
