package exam;

public class Car implements Movable {
	int x;
	int y;
	
	public Car() {
		x = 0;
		y = 0;
	}
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("자동차가 (" + x + "," + y + ") 위치로 이동했습니다." );
	}
	
	
}
