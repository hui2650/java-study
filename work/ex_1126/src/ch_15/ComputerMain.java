package ch_15;

public class ComputerMain {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		//매개값들이 배열로 자동 변환
		int result1 = com.sum(1,2,3);
		int result2 = com.sum(1,2,3,4,5);
		
		System.out.println(result1);
		System.out.println(result2);
		
		//배열을 생성해서 매개값으로 직접 넣기
		int [] values = {1,2,3,4,5,6};
				
		int result3 = com.sum(values);
		
		System.out.println(result3);
		
	}
}
