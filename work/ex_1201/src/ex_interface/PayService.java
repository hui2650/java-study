package ex_interface;

public class PayService {
	public void processPayment(Payment payment, int amount) {
		payment.pay(amount);
	}
}
