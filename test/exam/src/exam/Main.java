package exam;

public class Main {
	public static void main(String[] args) {
		System.out.println("1번 문제---------------------------------------");
		// 1번 문제
		Student s1 = new Student("홍길동", 20, "컴퓨터공학");
		s1.printInfo();
		
		System.out.println("2번 문제---------------------------------------");
		// 2번 문제
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5, 5));
		System.out.println(cal.subtract(5, 5));
		System.out.println(cal.multiply(5, 5));
		System.out.println(cal.divide(5, 5));
		// b가 0일때 0을 반환하도록
		System.out.println(cal.divide(5, 0));
		
		
		System.out.println("3번 문제---------------------------------------");
		// 3번 문제
		Point point1 = new Point();
		Point point2 = new Point(2,4);
		
		point1.printPoint();
		point2.printPoint();
		
		System.out.println("4번 문제---------------------------------------");
		// 4번 문제
		Printer printer = new Printer();
		printer.print("문자열을 출력했습니다");
		printer.print(10);
		printer.print(3.14);
		
		
		System.out.println("6번 문제---------------------------------------");
		// 6번 문제
		 Animal[] animals = new Animal[3];
		 animals[0] = new Animal();
		 animals[1] = new Dog();
		 animals[2] = new Cat();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}
		
		System.out.println("7번 문제---------------------------------------");
		// 7번 문제
		Shape[] shapes = new Shape[2];
		shapes[0] = new Rectangle(4,5);
		shapes[1] = new Circle(3);
		
		// 각 도형의 넓이를 출력
		System.out.println(shapes[0].area());
		System.out.println(shapes[1].area());
		
		System.out.println("8번 문제---------------------------------------");
		// 8번 문제
		Movable car = new Car();
		car.move(10, 20);
		
		System.out.println("9번 문제---------------------------------------");
		// 9번 문제
		Printable[] printables = new Printable[2];
		
		printables[0] = new ConsolePrinter();
		printables[1] = new FilePrinter();
		
		for(int i = 0; i < printables.length; i++ ) {
			printables[i].print("hello");
		}
		
		System.out.println("10번 문제---------------------------------------");
		// 10번 문제
		SavingsAccount sa = new SavingsAccount("태희", 100000);
		sa.withdraw(30000);
		sa.withdraw(80000);
		
		
		
	}
}
