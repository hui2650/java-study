package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		//자동차 객체를 만든다
		Car myCar = new Car();
		
		// Car 클래스의 필드인 tire에 Tire객체를 대입
		myCar.tire = new Tire();
		myCar.run();
		
		// HankookTire 객체를 대입
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		Driver driver = new Driver();
		
		Bus bus = new Bus(); 
		Taxi taxi = new Taxi();
		
		Vehicle v1 = new Bus();
		Vehicle v2 = new Taxi();
		
		driver.drive(new Bus()); 
		driver.drive(new Taxi()); 
		
		driver.drive(bus); 
		driver.drive(taxi); 
		
		driver.drive(v1); 
		driver.drive(v2); 
		
		
		
		
		
		
		
		
		
		
		
		
	}
}