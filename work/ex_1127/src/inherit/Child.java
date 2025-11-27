package inherit;

public class Child extends Parent {
	int c = 20;
	
	public Child(int p) {
		super(p); //부모클래스의 생성자를 의미 (생략가능)
	}
	
	public void childMethod() {
		System.out.println("자식 메서드");
	}
	
}
