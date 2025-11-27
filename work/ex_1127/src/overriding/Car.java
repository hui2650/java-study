package overriding;

public class Car {
//	Car클래스
//	필드
//	int gasolineGague;
	
	int gasolineGague;
//
//	생성자를 통해 필드를 초기화 한다.
	
	public Car(int gasolineGague) {
		this.gasolineGague = gasolineGague;
	}
//
//	메서드
//	showCurrentGague() : 잔여 가솔린량을 출력
	
	public void showCurrentGague(){
		System.out.println("잔여 가솔린량 : " + gasolineGague );
	}
//
//	Main에서 HybridWater객체를 생성하여 다음과 같은 결과 출력하기
//	잔여 가스량 : 15
//	잔여 전기량 :30
//	잔여 물의양 : 25
	
	

}
