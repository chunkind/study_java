package step09.vo;

import step09.exception.AmountInputException;
import step09.exception.InvaildOutputException;

public class Account {
	int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) throws AmountInputException {
		if (amount < 1000)
			throw new AmountInputException("1000원 이상 입금하지 않으면 입금 못함..");
		balance += amount;
		System.out.println(amount + " 원 입금완료");
		System.out.println(getBalance() + "원 남으셨습니다.");
	}

	public void withdraw(int amount) throws InvaildOutputException {
		if (amount > balance)
			throw new InvaildOutputException("잔액보다 더 많이 출금 불가능 !! ");
		balance -= amount;
		System.out.println(amount + "원 출금완료");
		System.out.println(getBalance() + "원 남으셨습니다..");
	}

	public int getBalance() {
		return balance;
	}
}
