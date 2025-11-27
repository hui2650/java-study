package overriding;

public class HybridWaterCar extends HybridCar {
//	HybridWaterCar클래스
//	HybridCar클래스를 상속
//	필드
//	int waterGague;
	
	int waterGague;
//
//	생성자를 통해 필드를 초기화 한다.
	
	public HybridWaterCar(int gasolineGague, int eletricGague, int waterGague) {
		super(gasolineGague, eletricGague);
		this.waterGague = waterGague;
	}
//
//	메서드는 오버라이딩 하여 잔여 가솔린,전기,물의양을 출력한다.
	
	@Override
	public void showCurrentGague() {
		super.showCurrentGague();
		System.out.println("잔여 물의양 : " + waterGague);
	}
	
	
}
