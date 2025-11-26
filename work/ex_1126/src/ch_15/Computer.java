package ch_15;

public class Computer {
	//가변 길이 매개변수
	
	public int sum(int ...values) {
		int sum = 0;
		//values는 배열 타입의 변수처럼 사용
		for(int i : values) {
			sum += i;
		}
		return sum;
	}
}
