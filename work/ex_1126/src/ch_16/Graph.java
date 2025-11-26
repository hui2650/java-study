package ch_16;

import java.util.Random;

public class Graph {
//	Graph클래스를 만들고 main()메서드를 갖는다.
//	0~9사이의 난수를 100개 저장하는 배열을 만들고,
//	해당 배열이 가지고 있는 0 ~9사이의 난수가 몇개씩 있는지 판별하고
//	그래프화 한다.
//	발생한 난수의 그래프화 작업은 PrintGraph클래스에서 print메서드를
//	만들어서 작업한다.
//
//	결과:
//	0507...... //난수 100개
//	0의 갯수 : ############ 12
//	1의 갯수 : ######### 9
//	2의 갯수 : ########### 11
//	3의 갯수 : ######## 8
//	4의 갯수 : ############## 14
//	5의 갯수 : ####### 7
//	6의 갯수 : ######### 9
//	7의 갯수 : ############# 13
//	8의 갯수 : ####### 7
//	9의 갯수 : ########## 10
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10);
//			System.out.print(arr[i]); 배열 잘 나왔나 확인해봄
		}
		
		// index가 0~9인 배열 새로 생성
		int[] count = new int[10];
		
		//배열 arr 안에서
		//값 하나를 꺼내서 num에 넣고,
		//숫자 num에 해당하는 칸을 1 증가
		for( int num : arr ) {
			count[num] ++;
			// 실제 count의 배열은 
			//count = [10, 9, 10, 12, 10, 9, 8, 10, 11, 11] 이런식으로 생겼을것 (난수라 예를 들면)
		}
		
		PrintGraph pg = new PrintGraph();
		pg.print(count);
		
	}
}
