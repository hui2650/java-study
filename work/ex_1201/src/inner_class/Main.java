package inner_class;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		// 내부 클래스의 객체 만들기
		Outer.Inner inner = outer.new Inner();
		inner.print();
		
		// private 접근제한자라서 호출 불가능
		// User user = new User();
		
		// 객체를 생성하지 않고도 정적 클래스 호출 가능
		User user = new User.Builder()
				.username("홍길동")
				.email("gildong@naer.com")
				.age(20)
				.build();
		
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("티비를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("티비를 끕니다");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		
		Calculator cal = new Calculator() {
			@Override
			public int calc(int x) {
				return x * x;
			}
		};
		
		System.out.println(cal.calc(5));
		
		Button button = new Button();
		
		button.setOnClickListener(new Button.OnClickListener() {
			
		    @Override
		    public void onClick() {
		        System.out.println("버튼 클릭!");
		    }
		});
		
		
	}	
}
