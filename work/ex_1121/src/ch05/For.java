package ch05;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {

		// 1부터 10까지 출력하는 for문 작성하기
		// 가로로 출력 1 2 3 4 5 6 7 8 9 10

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// 10부터 1까지 출력하기
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}

		// 3의 배수만 출력하기
		for (int i = 10; i >= 1; i--) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}

		// 1부터 10까지의 총합 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 키보드에서 숫자하나를 입력받고 구구단 출력하기
		Scanner sc = new Scanner(System.in);

		int a;
		a = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			int result = a * i;
			System.out.print(a + "x" + i + "=" + result + " ");
		}

		// 키보드에서 숫자 두개를 입력받아서
		// x부터 y까지의 총 합 구하기
		// x가 y보다 크면 값을 서로 교환해서 총합 구하기

		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();

		int sum2 = 0;

		if (x > y) {
			int largeX = x;
			x = y;
			y = largeX;
		}

		for (int i = x; i <= y; i++) {
			sum2 += i;
		}

		System.out.println(sum2);

		// 1~20. 까지의 정수 중 2의 배수가 아니면서
		// 3의 배수가 아닌 수의 총합을 구하기

		int sum3 = 0;

		for (int i = 1; i <= 20; i++) {
			if( i % 2 != 0 && i % 3 != 0 )
				sum3 += i;
		}
		System.out.println(sum3); 
		
		// int 타입의 num 변수에 12345를 대입한다.
		// 각 자리수의 합을 구한 결과를 출력하는 코드 작성하기
		
		int num = 12345;
		
		int sum4 = 0;
		
		while( num > 0 ) {
			sum4 += num % 10;
			num /= 10;
		}
		System.out.println(sum4); 
		
		// 1 + (1+2), (1+2+3) + (1+2+3+4) + ...
		// 를 계산하기
		
		int total = 0;
		int sum5 = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum5 += i;
			total += sum5;
			}
	
		System.out.println(total);

	}
}
