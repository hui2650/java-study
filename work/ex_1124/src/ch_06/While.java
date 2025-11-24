package ch_06;

import java.util.Scanner;
import java.util.Random;

public class While {
	public static void main(String[] args) {
		//while(조건식)
		//	조건식이 참일 때 반복할 명령
		// }
		
		//※주의 사항
		//while문에는 초기식과 증감식이 따로 존재하지 않기 대문에 직접 작성을 해줘야 한다.
		
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i ++;
		}
		System.out.println("-----------------------");
		
		//내가 정확히 몇번을 반복해야 할 지 모를때
		Scanner sc = new Scanner(System.in);
		
		//랜덤숫자
		int random = new Random().nextInt(50)+1;
		
		int answer = 0;
		
		System.out.println("숫자 입력");
		while( answer != random ) {
			System.out.print("정답 : ");
			answer = sc.nextInt();
			
			// 대답이 랜덤으로 뽑은 수보다 크거나 작을때 힌트 주기
			if(answer > random) {
				System.out.println("down");
			}
			if(answer < random) {
				System.out.println("up");
			}
		}
		System.out.println("정답입니다");
		
	}
}
