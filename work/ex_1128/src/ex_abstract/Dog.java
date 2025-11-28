package ex_abstract;

//상속받는 자식 클래스는 추상 메서드를 반드시 구현해야 합니다
public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
