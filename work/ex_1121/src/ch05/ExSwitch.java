package ch05;

import java.util.Scanner;

public class ExSwitch {
	public static void main(String[] args) {
		//switch의 기본형
		//switch(비교값){
//			case 조건값1:
//				비교값이 조건값1과 일치할 떄 실행할 문장.
//				break;
//			case 조건값2:
//				비교값이 조건값2과 일치할 떄 실행할 문장.
//				break;
//			defalut:
//				비교값과 일치하는 조건값이 없을 때 실행할 문장.
//				break;
//	}
		//키보드에서 1~12사이의 월(月)을 입력받아서 month 변수에 저장
		//해당 월이 몇일까지 있는지 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
			
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12 :
			System.out.println("31일까지 있습니다");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30일까지 있습니다");
			break;
		case 2 : 
			System.out.println("28일까지 있습니다");
			default :
				System.out.println("1~12 사이의 값을 입력해주세요");
		}
		
		//계산기 만들기
		//정수 두개를 키보드를 통해 입력받는다.
		//연산자도 키보드로 입력받아 문자열로 저장한다
		//switch를 이용하여 정수의 연산을 수행하는 코드를 작성해보자
		
		//실행결과
		//정수1 : 10
		//정수2 : 7
		//연산자 : *
		//결과 : 10 * = 70
		
		//정수를 0으로 나누려고 하면 0으로 나눌 수 없습니다 출력하기
		
		
		int x, y;
		String operator;
		
		System.out.println("정수 2개를 입력하세요");
		x = sc.nextInt();
		y = sc.nextInt();
		operator = sc.next();
		
		
		switch(operator) {
		case "+" :
			System.out. println(x + y);
			break;
		case "-" : 
			System.out.println(x - y);
			break;
		case "*" : 
			System.out.println(x * y);
			break;
		case "/" : 
			System.out.println(x / y);
			if(x == 0 || y == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} 
		default:
			System.out.println("연산실패");
		}
		
		
		
	}
}
