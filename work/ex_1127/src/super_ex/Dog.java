package super_ex;

public class Dog extends Animal{
	int age;
	
	public Dog(String name, int age) {
		super(name); // 무조건 super가 먼저 와야함 
					 // super(...) 안에는 부모 생성자의 매개변수와 정확히 동일한 개수·타입을 넣어야 함
		this.age = age;
	}
	
	@Override
	public void info() {
//		super.info();
//		System.out.println(", 나이 : " + age);
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}
