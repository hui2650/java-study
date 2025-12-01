package ex_interface;

public class Main {
	public static void main(String[] args) {
		
		//인터페이스는 직접 객체로 만들 수 없다.
		Dog d = new Dog();
		
		d.eat();
		d.sleep();
		
		//Dog 입장에서는 "Animal 규격을 따르는 객체"가 된것이라서 Animal 타입으로 타입변환이 가능하다
		Animal a = d;
		
		// 타입변환 후에도 오버라이딩된 메서드는 사용가능하다
		a.eat();
		a.sleep();
		
		System.out.println("MyInterface의 상수 MAX_COUNT" + MyInterface.MAX_COUNT);
		MyInterface.printInfo();
		MyInterface mi = new MyService();
		//추상메서드 구현체의 사용
		mi.doWork();
		//디폴트 메서드의 사용
		mi.log("디폴트 메세지 출력");
		
		MusicPlayer player = new MusicPlayer();
		
		player.play();
		
		DocumentProcessor dp = new DocumentProcessor();
			
		dp.print();
		dp.sort();
		
		NotificationService notify = new NotificationService();
		
		EmailSender email = new EmailSender();
		SmsSender sms = new SmsSender();
		
		// 첫번째 인자로 Email, SMS를 전달
		// 두번째 인자로 메세지를 전달
		notify.notifyUser(email, "회원가입을 축하합니다");
		notify.notifyUser(sms, "인증번호는...");
		
		PayService payService = new PayService();
		
		CardPayment card = new CardPayment();
		KakaoPayPayment kakaoPay = new KakaoPayPayment();
		
		payService.processPayment(card, 9900);
		payService.processPayment(kakaoPay, 25000);
		
	}
}
