package ch_07;

import java.util.Random;
import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		//break
		//반복문을 의도적으로 종료할 때 사용하는 키워드
		
		
		while(true) {
			int rand = new Random().nextInt(10)+1;
			System.out.println(rand);
			if(rand == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		System.out.println("--------------------");
		
		//난수 생성해서 맞추는 up, down 퀴즈 프로그램
		//기회를 10번만 주기
		
		//1. 1~50 사이의 난수 생성하기
		
		//2. for문을 이용해서 up, down 퀴즈 프로그램 만들기
		// 정답이 난수보다 크면 down 출력
		// 정답이 난수보다 크면 up 출력
		// 정답을 맞추면 반복문 종료
		// 기회는 10번 (10번 이내에 맞추면 더이상 반복을 수행하지 않고 종료)
		
		Scanner sc = new Scanner(System.in);
		int num = new Random().nextInt(50)+1;
		int answer;
		
		//정답을 맞췄는지 여부를 가진 변수
		boolean isMatched = false;
		
		for(int i = 1; i <=10; i ++) {
			System.out.println("숫자를 맞추시요");
			answer = sc.nextInt();
			//정답을 맞췃을떄
			if(answer == num) {
				isMatched = true;
				System.out.println((i)+"번째에 맞췄습니다!");
				break;
			}
			if( i == 10 ) {
				System.out.println("기회가 소진되었습니다.");
				break;
			}
			if(answer < num) {
				System.out.println("up");
			}
			if(answer > num) {
				System.out.println("down");
			}
		}
		
		//중첩 반복문에서 break;
		//break문은 가까운 반복문을 종료하고 outer반복문은 종료시키지 않는다!
		//중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 outer 반복문에 라벨을 붙이고 break 쪽에도 라벨을 단다.
		
		Outter:for(char upper = 'a'; upper <= 'Z'; upper ++) {
			for(char lower = 'a'; lower <= 'z'; lower ++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g' ) {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
		
		
		
		
	}
}
