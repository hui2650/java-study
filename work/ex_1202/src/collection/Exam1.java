package collection;

import java.util.ArrayList;

public class Exam1 {
	public static void main(String[] args) {
		
		// 1~30 사이의 난수 10개를 만들어서 그중 짝수만 출력하기
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=10; i++) {
			// 처음부터 짝수만 넣기
//			if(i % 2 == 0) {
//				list.add(i);
//			}
			int temp = (int)(Math.random()*30)+1;
			list.add(temp);
			
		}
		
		System.out.println("짝수 : ");
		//그중에 짝수만 출력하기
		for(int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			if(value % 2 == 0) {
				System.out.println(value + " ");
			}
		}
	}
}
