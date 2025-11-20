package ch01;

public class DataType {
	public static void main(String[] args) {
		//오버플로우
		//언더플로우
		//각 타입마다 담을 수 있는 범위가 있다.
		//byte의 범위가 -128 ~ 127
		byte b1 = -128;
		byte b2 = -30;
		byte b3 = 0;
		byte b4 = 30;
//		byte b5 = 128; 범위에 벗어났다고 에러가 남
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		//long
		//값을 long타입으로 만들고 싶으면 값 뒤에 L을 붙여라
		long l1 = 100000000L;
		
		//문자타입과 문자열 타입을 구분해서 사용을 한다
		//문자형
		//하나의 문자를 저장하는 자료형
		//메모리 크기: 2byte
		//기본값: \u0000 (유니코드 값 0, null 문자);
		
		char c = 1;
		System.out.println(c);
		
		//유니코드
		//각국의 언어를 코드로서 저장해놓는 인코딩 방식이다.
		
		//자바에서 문자는 반드시 작은 따옴표에 작성해야한다
		
		char c1 = 'A'; //문자를 저장할 수 있다
		System.out.println(c1);
		char c2 = 44032; //유니코드를 직접 저장하는게 가능하다.
		System.out.println(c2);
		char c3 = 65; //아스키코드를 저장할 수도 있다.
		System.out.println(c3);
		
		float f1 = 0.1234567890123456789f; //뒤에 f 또는 F 필수
		double d1 = 0.1234567890123456789; //뒤에 d 생략가능
		
		System.out.println(f1); //소수점 7자리
		System.out.println(d1); //소수점 15자리 d가 더 정밀하게 표현
		
		//논리형 boolean
		boolean isOn = true;
		boolean isStudent = false;
		
		System.out.println("전등 상태 : " + isOn);
		System.out.println("학생입니까? : " + isStudent);
		
		//정수형
		//byte, short, long, int(가장 많이 쓴다)
		
		//문자형
		// character (하나뿐)

		//논리형
		//boolean
		
		//실수형
		//float, double
		
		//2. 참조자료형
		//문자열 타입
		//큰 따옴표안에 감싸진 1글자 이상의 문자들
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		//이스케이프 문자
		//문자열 내부에서 특수한 기능을 가진 문자.
		// \" : 문자열 내부에서 "를 쓸 수 있게 해주는 문자
		// \' '문자 포함
		// \\ \\문자 포함
		// \n 출력시 줄 바꿈
		
		String str3 = "나는 \"자바\"를 배웁니다";
		System.out.println(str3);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다\n"); // \n으로 줄바꿈함
		
		//Java13 버전 이후로는 텍스트 블록 문법도 제공
		String str4 = """
				여기에
				믄자열을
				작성합니다.
				""";
		System.out.println(str4);
		
	}
}
