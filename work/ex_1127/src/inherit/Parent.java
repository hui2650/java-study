package inherit;

public class Parent {
	int p = 20;
	
	//부모클래스의 생성자가 매개변수를 가지면 자식 클래스에서 생략할 수 없다
	public Parent(int p) {
		this.p = p;
	}
	
	public void parentMethod() {
		System.out.println("부모 메서드");
	}
	
}

