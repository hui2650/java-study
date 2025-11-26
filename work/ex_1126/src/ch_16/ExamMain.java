package ch_16;

public class ExamMain {
	public static void main(String[] args) {
		
		//다른 클래스에 있는 메서드를 사용하려면 해당 클래스의 객체를 만들어야 한다
		
		//객체 생성 방법
		//클래스명 변수명 new 클래스명();
		Exam1 exam = new Exam1();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int result1 = exam.maxFinder(arr);
		System.out.println("배열의 최대값은 : " + result1);
		
		double result2 = exam.circleArea(5);
		System.out.println("원의 넓이는 : " + result2);
		
		// void가 있기 때문에 그냥 값만 넣어줬음
		exam.circleRound(7);
		
		int result3 = exam.calc(2, 8, "+");
		
		System.out.println("연산 결과는 : " + result3);
		
		TimeTable table = new TimeTable();
		
		table.showTable(5);
		
	}
} 
