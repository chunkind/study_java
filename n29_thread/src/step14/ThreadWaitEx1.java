package step14;

import java.util.ArrayList;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 3. 27.
 * wait(), notify(), notifyAll()
 * Object에 정의되어 있다.
 * 동기화 블록(synchronized블록)내에서만 사용할 수 있다.
 * 보다 효율적인동기화를 가능하게 한다.
 * 
 * 아래 예제는 계속 실행하다 보면 예외가 발생한다.
 * 
 * Math.random() 
 * -> 0 < x <= 1 
 * -> (0*3) < x <= (1*3)
 * -> 0 < x <= 3
 */
public class ThreadWaitEx1 {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // 여러 쓰레드가 공유하는 객체

		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut"), "CUST1").start(); //도넛 성애자
		new Thread(new Customer(table, "burger"), "CUST2").start(); //버거 성애자

		// 0.1초(100 밀리 세컨드) 후에 강제 종료시킨다.
		Thread.sleep(100);
		System.exit(0);
	}
}

class Customer implements Runnable {
	private Table table;
	private String food;

	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			if (eatFood())
				System.out.println(name + " ate a " + food);
			else
				System.out.println(name + " failed to eat. :(");
		} // while
	}

	boolean eatFood() {
		return table.remove(food);
	}
}

class Cook implements Runnable {
	private Table table;

	Cook(Table table) {
		this.table = table;
	}

	public void run() {
		while (true) {
			// 임의의 요리를 하나 선택해서 table에 추가한다. 
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // while
	}
}

class Table {
	String[] dishNames = { "donut", "donut", "burger" }; // donut이 더 자주 나온다.
	final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수

	private ArrayList<String> dishes = new ArrayList<>();

	public void add(String dish) {
		// 테이블에 음식이 가득찼으면, 테이블에 음식을 추가하지 않는다.
		if (dishes.size() >= MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes:" + dishes.toString());
	}

	public boolean remove(String dishName) {
		// 지정된 요리와 일치하는 요리를 테이블에서 제거한다.
		for (int i = 0; i < dishes.size(); i++)
			if (dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}
		return false;
	}

	public int dishNum() {
		return dishNames.length;
	}
}
