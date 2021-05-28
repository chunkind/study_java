package step05;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * 한 파일 안에 여러개의 클래스를 만들수 있다.
 * 파일이름과 일치하는 클래스가 반드시 포함 되어있어야 한다.
 * 접근지정자는 파일명과 일치하는 클래스에 public만 붙일수 있다.
 * 
 * Variable의 종류 :: 
 * Member Variable (Field) / Local Variable 
 * 선언된 위치에 따라서 구분
 *
 * Field -- 1)클래스 바로 아래 / 메소드 블럭 밖에 선언된다.
 *          2)기본값이 있다....초기화 하지 않고 바로 사용해도 에러 안난다.
 *          3)Heap영역에 저장된다
 *          4)Class의 식구, 맴버라 하고 클래스가 메모리에 살아있는 동안 유지된다.
 *
 * local Variable 
 *       -- 1)메소드 블럭 안에서 선언
 *          2)기본값이 없다.....초기화 하지 않고 사용하면 컴파일시 에러 난다
 *          3)Stack 영역에 저장
 *          4)메소드가 { 열리면 생성되었다가 } 닫히면 자동적으로 메모리에서 내려온다
 *          5)Temporary, Automatically V라고도 한다. 
 */
public class BankingTest {
	public static void main(String[] args) {
		//명시적 생성자가 있을때는 컴파일러가 기본생성자를 대신 넣어주지 않는다..
		Account account = new Account();
		Account account1 = new Account(10000.0);

		account1.deposit(800.0);//안됨.. 입금 금액은 천원이상
		account1.deposit(8000.0);
		account1.deposit(3000.0);
		account1.withdraw(30000.0);//안됨... 인출하려는 금액이 커서
		account1.withdraw(2000.0);
		System.out.println("현재 잔액 ::" + account1.getBalance() + " $");
	}
}

class Account {
	private double balance;
	Account(){}

	// 시티은행은 최초 입금액이 적어도 1만원 이상이어야 통장이 개설된다.
	Account(double balance) {
		if (balance >= 10000.0) {
		} else {
			System.out.println("최초 입금액이 적어도 1만원 이상!!");
			this.balance = balance;
		}

	}

	// setter 지금 필요없다... 생성자를 통해서 주입되었다...balance
	public double getBalance() {
		return balance;
	}

	// 입금....천원 이상.
	public void deposit(double money) {
		if (money >= 1000) {
			balance += money;
		} else {
			System.out.println("입금액은 천원 이상이어야 한다");
		}
	}

	// 출금... 잔액보다 작거나 같은 금액.
	public void withdraw(double money) {
		if (money <= balance) balance -= money;
		else System.out.println("인출하려는 금액이 너무 큽니다");
	}
}