package step09.banking;

public class Account{
	double balance;	//잔액
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amt){//10000+5000=15000
		//balance = balance + amt;
		balance += amt;
	}
	public void withdraw(double amt){
		//balance = balance - amt;
		balance -= amt;
	}

}