package ch_16;

public class CalMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		//길이가 4인 정사각형의 넓이 구하여 출력하기
		
		//가로가 5, 세로가 10인 직사각형의 넓이르 구하여 출력하기
		
		double result1 = calc.areaRectangle(4);
		double result2 = calc.areaRectangle(5,10);
		int result3 = calc.plus(5,10);
		
		System.out.println("정사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " + result2);
		
		System.out.println(calc.pi);
		//static 멤버는 객체 생성 없이도 불러올 수 있음
		System.out.println(Calculator.pi);
		
		System.out.println(calc.plus(5,10));
		System.out.println(result3);
	}
}
