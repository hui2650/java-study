package ch_09;

import java.util.Random;

public class ArrayExample2 {
	public static void main(String[] args) {
		//길이가 3인 비어있는 정수형 배열을 생성
		int[] arr = new int[3];
		
		System.out.println(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[%d] : %d\n" + arr[i]); // 0 출력
		}
		
		String[] sArr = new String[3];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[%d] : %s\n" + sArr[i]); // NULL값 출력
		}
		
		System.out.println("------------------------------------------------------");
		
		//배열의 길이
		//배열을 생성했을 때 대괄호 안에 배열의 길이를 작성했다.
		//배열은 내부적으로 length라는 변수를 지니는데, 해당 변수는 배열의 길이값을 가지고 있음
		//배열의 길이를 알고싶을 때는 배열명.length를 하면 된다.
		
		//길이 10의 정수형배열을 만든다.
		//변수 이름은 numbers
		
		//배열의 10개의 난수를 집어넣는다. (1~30)
		//배열 안에서 모든 짝수의 합 구하기
		
		
		int[] numbers = new int[10];
		int evenSum = 0;
		
		for(int i = 0; i < numbers.length; i++ ) {
			numbers[i] = new Random().nextInt(30)+1;
			System.out.print(numbers[i] + " "); //10개의 난수 확인!
			
			if(numbers[i] % 2 == 0) {
				evenSum += numbers[i]; //짝수만 evenSum에 누적
			}	
		}
		System.out.println("\nnum 배열에서 모든 짝수의 총 합은 : " + evenSum + " 입니다.");
		
		
		//정렬
		//배열의 합이 순서 없이 저장되는 경우, 배열의 값을 오름차순으로 정렬해주세요
		
		int[] arr2 = { 1, 6, 2, 10, 5, 8, 4, 3, 9, 7 };
		
		
		
	}
}
