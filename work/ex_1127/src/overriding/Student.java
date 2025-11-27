package overriding;

public class Student extends Person {
	
	@Override
	public void introduce() {
//		super.introduce();
		System.out.println("학생입니다.");
	}
}
