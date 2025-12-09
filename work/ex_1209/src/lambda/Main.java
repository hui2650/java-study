package lambda;

import java.util.function.*;

class User{
	String name;
	public User() {}
	public User(String name) {this.name = name;}
}

public class Main {
	public static void main(String[] args) {
		
		MyCalculator c1 = (num1, num2) -> { return num1 + num2; };
		
		System.out.println("(람다식) 두 수의 합: " + c1.plus(10,7));
		
		MyCalculator c3 = (num1, num2) -> num1 + num2;
		
		System.out.println("(람다식) 두 수의 합: " + c3.plus(10,7));
		
		// 람다식은 매개변수로 전달하거나, 반환값으로 사용할 수 있다
		
		// 람다식은 매개변수로 전달하거나, 반환값으로 사용할 수 있다
		
		// 메서드의 매개변수로 람다식 전달하기
		// result(c3); 람다식을 포함하고 있는 변수를 전달
		
		result((num1, num2) -> num1+num2); // 람다식을 인자로 전달
		
		
		 IntCalculator acc = (x, y) -> x + y; // 덧셈 람다식
		 System.out.println(acc.calc(10, 5)); 
		 
		 IntCalculator sub = (x, y) -> x - y; // 덧셈 람다식
		 System.out.println(acc.calc(10, 5)); 
		 
		 IntCalculator mul = (x, y) -> x * y; // 덧셈 람다식
		 System.out.println(acc.calc(10, 5)); 
		 
		 // 매개변수 없고 반환값 있을 때
		 Supplier<Double> randomValue = () -> Math.random();
		 System.out.println("랜덤값 : " + randomValue.get());
		 
		 //매개변수 있고 반환값 없을 때
		 Consumer<String> printer = msg -> System.out.println("메세지 : " + msg);
		 
		 //매개변수 있고 반환값 있을 때. 변환하는 역할을 쓸 때 좋다
		 Function<String, Integer> lengthFunc = s -> s.length();
		 System.out.println("문자열의 길이 : " + lengthFunc.apply("banana"));
		 
		 //매개변수가 있고 boolean 타입으로 반환
		 Predicate<Integer> isEven = n -> n%2 == 0;
		 System.out.println(isEven.test(10));
		 System.out.println(isEven.test(11));
		 
		 
		 Consumer<String> printer1 = s -> System.out.println(s);
		 Consumer<String> printer2 = System.out::println;
		 
		 printer1.accept("hello");
		 printer2.accept("hello");
		
		 // 정적메서드에서의 참조
		 // 클래스명::정적메서드명
		 Function<String, Integer> parse1 = s -> Integer.parseInt(s);
		 Function<String, Integer> parse2 = Integer::parseInt;
		 
		 System.out.println(parse1.apply("100"));
		 System.out.println(parse2.apply("100"));
		 
		 // 특정객체의 메서드 참조
		 // 참조변수::메서드
		 String prefix = "[Log] ";
		 Consumer<String> logger1 = msg -> System.out.println(prefix + msg);
		 Consumer<String> logger2 = System.out::println;
		 logger1.accept("하이");
		 logger1.accept(prefix + "태희");
		 
		 // 임의의 객체 메서드를 참조
		 // 클래스명::메서드명
		 Function<String, String> toUpper1 = s -> s.toUpperCase();
		 Function<String, String> toUpper2 = String::toUpperCase;
		 System.out.println(toUpper1.apply("My name is Taehui"));
		 System.out.println(toUpper2.apply("My name is Taehui"));
		 
		 // 생성자 참조
		 // 클래스명::new
		 Supplier<User> userSupplier1 = () -> new User();
		 Supplier<User> userSupplier2 = User::new;
		 
		 User u1 = userSupplier2.get();
		 
		 // 매개변수를 받는 생성자 참조
		 Function<String, User> userCreater1 = name -> new User(name);
		 Function<String, User> userCreater2 = User::new;
		 
		 User u2 = userCreater2.apply("홍길동");
		 System.out.println(u2.name);
		 
		 // 람다가 이미 있는 메서드를 그대로 호출하는 역할만 할 때 ::로 줄이는 것이 좋다
		 
		 
}
	// 람다식은 매개변수로 전달하거나, 반환값으로 사용할 수 있따
	public static int result(MyCalculator lambda) {
		return lambda.plus(1,2);
	}
	
	
	
}
                                                                                                               