package instanceOf;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("고길동");
		Student s = new Student("김길동", 19);
		// instanceOf
		// 객체가 어떤 타입인지 확인할 때 사용
		// 맞으면 true, 아니면 false를 반환한다
		
		
		if(p1 instanceof Student) {
			System.out.println("p1은 student 타입입니다");
		}else {
			System.out.println("p1은 student 타입이 아닙니다.");
		}
		
	}
}
