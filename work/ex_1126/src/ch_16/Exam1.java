package ch_16;

import java.util.Scanner;

public class Exam1 {
	//배열의 최대값을 찾는 maxFinder 메서드 만들기
	//최대값을 찾아서 반환하기
	
	public int maxFinder(int ...values) {
		
		 int max = values[0];   

		    for (int value : values) {
		        if (value > max) {
		            max = value;
		        }
		    }
		    return max;
	}
	
	//원의 넓이를 구하는 circleArea 메서드 만들기
	//원의 넓이 : 3.14 * r * r 
	//반환하기
	
	public double circleArea(int r) {
//		double area = 3.14 * r * r;
		return Math.PI * r * r;	
	}
	
	//원의 둘레를 구하는 circleRound 메서드 만들기
	//원의 넓이 : 2 * 3.14 * r
	//출력하고 끝내기
	
	//void = 값 반환 X, 출력하고 끝
	public void circleRound(int r) {
		
		double round = 2 * 3.14 * r;
		
		System.out.println("원의 둘레는 : " + round);
	}
	
	//화씨를 섭씨로 바꾸는 fToc 
	//섭씨 : (화씨-32)/1.8
	//함수를 실행하면 온도를 입력받아서 출력하기
	
	public void fToc() {
		Scanner sc = new Scanner(System.in);
		
		double fc;
		System.out.println("화씨를 입력하세요");
		fc = sc.nextInt();
		
		double dc = (fc-32)/1.8;
		
		System.out.println("화씨 -> 섭씨 온도는 : " + dc);
	}
	
	//숫자 두개와 연산자를 매개변수로 받아서 사칙연산을 하는 calc메서드 만들기
	//매개변수 : 정수 2개, 문자열 1개
	
	public int calc(int x, int y, String op) {
		
		// switch문 방식
//		switch(op) {
//		case "+":
//			return x + y;
//		case "-":
//			return x - y;
//		case "*":
//			return x * y;
//		case "/":
//			return x / y;
//		default:
//			return 0;
//		}
		
		if(op.equals("+")) {
			return x + y;
		}else if(op.equals("-")) {
			return x - y;
		}else if(op.equals("*")) {
			return x * y;
		}else if(op.equals("/")) {
			return x / y;
		}else {
			System.out.println("연산 기호가 올바르지 않습니다");
			return 0;
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}
