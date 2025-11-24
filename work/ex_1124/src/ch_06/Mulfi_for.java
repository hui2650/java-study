package ch_06;

public class Mulfi_for {
	public static void main(String[] args) {
		//중첩 for문 (다중 for문)
		//for(초기식; 조건식; 증감식){
		// 반복하고자 하는 명령
		// for(초기식; 조건식; 증감식){
		//		반복하고자 하는 명령
		// }
		//	반복하고자 하는 명령
		//}
		
		//for문의 성격
		//1. 초기식 변수에 값을 하나 초기화 한다
		//2. 변수의 값을 비교하여 조건이 참인지 검증을 한다
		//3. 조건이 참이면 코드블럭({})안의 명령을 실행한다
		//4. 명령을 모두 실행하면 증감식을 실행한다 (초기식 변수의 값이 변화됨)
		//5. 변수를 다시 조건과 비교하여 참이면 3~5번 거짓이면 반복문을 빠져나간다
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j ++) {
				System.out.printf("%d일 %d교시\n", i , j); //총 9번 실행 (내부에서 3번)*외부에서 3번!
			}
		}
		
		//중첩 for문의 작동 원리
		//1. outer for문의 1회 돌때, inner for문은 모든 방복을 반복한다
		//2. inner for문의 모든 반복이 끝나면, outer for문이 증감식으로 돌아온다
		//3. outer for문의 조건식이 참이면 1-2번 반복, 거짓이면 반복문을 빠져간다
		
		System.out.println("-----------------------------------");
		
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 코드 작성하기
		for(int a = 1; a <= 6; a ++) {
			for(int b = 1; b <= 6; b ++) {
				if(a + b == 6) {
					System.out.printf("%d , %d\n", a, b);
				}
			}
		}
		System.out.println("-----------------------------------");
		
		//구구단을 2단부터 9단까지 전부 다 출력하기
		//outer for문의 담당: 2단,3단...9단
		//inner for문의 담당: 2x1 = 2,... 9x9 = 81;
		
		for(int c = 2; c <=9; c++) {
			System.out.println("-----");
			for(int d = 1; d <=9; d++) {
				System.out.printf("%d x %d\n",c, d);
			}
		}
		
		//for문 -> 배열과 관련이 되게 깊다.!!
		
		
		
		
	}
}
	
