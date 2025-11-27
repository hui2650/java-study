package overriding;

public class Calculator {
	public double areaCircle(double r) {
		System.out.println("부모 클래스의 메서드 실행");
		return Math.PI * r * r;
	}
}
