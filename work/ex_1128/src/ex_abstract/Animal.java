package ex_abstract;

// 추상클래스와 추상메서드

// 추상클래스
// 공통 뼈대만 가진 미완성의 설계도
// abstract 키워드로 선언되고, 하나 이상의 추상 메서드를 포함하고 있는 클래스이다.
// 직접 객체를 만들 수 없고, 반드시 상속을 통해 완성해서 사용하는 클래스

public abstract class Animal {
	
	// 추상메서드
	// 메서드의 구현부가 없고 세미콜론으로 끝난다
	// 자식들이 꼭 만들어야 하는 메서드의 이름과 형태만 정의한 것
	public abstract void sound();

}