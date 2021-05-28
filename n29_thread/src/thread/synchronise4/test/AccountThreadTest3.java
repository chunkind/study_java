package thread.synchronise4.test;

import java.util.Random;

class Account {
	int balance = 1000; // 만원단위
//t1 - sleep 공간과 t2 - sleep 공간이 다르다 
	public void withdraw(int money) throws InterruptedException {
		if (balance >= money) { // true balance =200 t1= 200 t2 = 200
			Thread.sleep(1000); // t1 zzzz...200 | t2 zzz.. 200
			balance -= money;// t1 ...0 | t2 -200
			System.out.println(money);
		}
	}
	/*
	 * public void deposit(int money){ balance += money; }
	 */
}// Account

class AccountThread implements Runnable {
	Account acc = new Account(); // 공유 자원

	@Override
	public void run() { // 계좌이체...(출금 + 입금)
		while (acc.balance > 0) {
			// 100,200,300만원 중에서 하나의 값이 출금되도록
			int money = (int) (Math.random() * 3 + 1) * 100;
			try {
				acc.withdraw(money);
				System.out.println("당신의 통장 잔액은 : " + acc.balance + " 만원입니다");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*
			 * try{ acc.deposit(money); System.out.println("당신의 통장 잔액은 : "
			 * +acc.balance + " 만원입니다"); }catch(InterruptedException e){
			 * e.printStackTrace(); }
			 */
		}

	}

}

public class AccountThreadTest3 {
	public static void main(String[] args) {
		AccountThread act = new AccountThread();
		Thread t1 = new Thread(act);
		Thread t2 = new Thread(act);

		t1.start();
		t2.start();

	}
}
