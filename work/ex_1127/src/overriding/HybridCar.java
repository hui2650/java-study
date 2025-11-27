package overriding;

public class HybridCar extends Car {
//	HybridCar클래스
//	Car클래스를 상속
//	필드
//	int eletricGague;
	
	int eletricGague;
	
//	생성자를 통해 필드를 초기화 한다.
	
	public HybridCar(int gasolineGague, int eletricGague) {
		super(gasolineGague);
		this.eletricGague = eletricGague;
	}
	
//  메서드는 오버라이딩 하여 잔여 가솔린량과 잔여 전기량을 출력
	
	@Override
	public void showCurrentGague() {
		super.showCurrentGague();
		System.out.println("잔여 전기량 : " + eletricGague);
	}
}
