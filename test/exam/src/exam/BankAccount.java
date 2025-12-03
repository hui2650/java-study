package exam;

public class BankAccount {
	String owner;
	int balance;
	
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("잔액 부족");
		}
		
	}
	
}
