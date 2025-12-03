package exam;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String owner, int balance) {
		super(owner, balance);
	}
	
	@Override
	void withdraw(int amount) {
		if(amount > balance / 2) {
			System.out.println("적금 계좌는 한번에 잔액의 50% 이하만 출금 가능합니다");
			return;
		}
		
		super.withdraw(amount);
			
		if (balance >= 0) {
			System.out.println( amount + "원 출금 되셨습니다");
			System.out.println( "남은 잔액: " + balance);
		}
	}
}