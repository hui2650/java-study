package overriding;

public class Main {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		
		//부모클래스의 메서드 실행
		cal.areaCircle(r);
		
		Computer c = new Computer();
		
		//자식클래스의 메서드 실행
		c.areaCircle(r);
		
		Student std = new Student();
		
		std.introduce();
		
		CalPlus plus = new CalPlus();
		CalMinus minus = new CalMinus();
		
		
		int result1 = plus.getResult(1,5);
		int result2 = minus.getResult(10,3);
		
		System.out.println("더하기 결과는 " + result1);
		System.out.println("빼기 결과는 " + result2);
		System.out.println("-------------------------------------");
		
		HybridWaterCar HybridWater = new HybridWaterCar(15, 30, 25); 
		
		HybridWater.showCurrentGague();
		
		
		
		
		
	}
}
