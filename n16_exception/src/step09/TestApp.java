package step09;

import step09.exception.AmountInputException;
import step09.exception.InvaildOutputException;
import step09.vo.Account;

public class TestApp {
	public static void main(String[] args) throws AmountInputException {
		Account acc = new Account(10000);
		// 1. 입금시 1000원 이상 하지 않으면 예외 발생시킴..AmountInputException
		try {
			acc.deposit(2000);
		} catch (AmountInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.deposit(800);
		} catch (AmountInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.deposit(1300);
		} catch (AmountInputException e) {
			System.out.println(e.getMessage());
		}

		// 2. 잔액이 13300원이 나오는지를 확인
		System.out.println("getBalance() : " + acc.getBalance() + "원 잔액!!");

		// 3. 출금시 잔액보다 더 많이 출금하면 예외발생... InvalidOutputException
		try {
			acc.withdraw(3000);
		} catch (InvaildOutputException e) {

			System.out.println(e.getMessage());
		}
		try {
			acc.withdraw(32000);
		} catch (InvaildOutputException e) {

			System.out.println(e.getMessage());
		}

		// 4. 잔액을 확인하면 10300원이 나타난다
		System.out.println("getbalance() : " + acc.getBalance() + "원 잔액!!");
	}
}
