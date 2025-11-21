package ch05;

public class If {
	public static void main(String[] args) {
		//if의 기본형
		//if(조건식){ 조건식이 참일 때 실행할 명령 };
		
		//만약 실행할 명령이 하나라라면 중괄호를 생략할 수 있다
		// if(조건식) 조건식이 참일 때 실행할 명령
		//	else 조건식이 거짓일 때 실행할 명령;
		
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");
		}
		
		//정수형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 만들기
		
		int x = 15;
		
		if(x > 10 && x < 20) {
			System.out.println(true);
		}
		
		//문자형 변수 ch 가 'x' 또는 'X' 일때 true인 조건식
		
		char ch = 'x';
		
		if(ch == 'x' || ch == 'X') {
			System.out.println(true);
		}
		
		
		//문자형 변수 ch가 알파벳일때 true인 조건식
		
		ch = 'e';
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// 세 숫자를 비교해서 가장 큰 값 출력하기
		int a = 3;
		int b = 4;
		int c = 5;
		
		if( a > b && a > c) {
			System.out.println("a가 제일 큽니다");
		}else if(b > a && b > c) {			
			System.out.println("a가 제일 큽니다");
		}else {
			System.out.println("c가 제일 큽니다");
		}
		
		 
		String id = "admin";
		String pw = "1234";
		
		//아이디가 admin이면서 비밀번호가 1234가 일치할 때 "로그인성공"
		//일치하지 않으면 로그인 실패 를 출력하기
		
		if( id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인성공");		
		}else {
			System.out.println("로그인실패");
		}
		
		
		
		
		
		
		
	}
}
