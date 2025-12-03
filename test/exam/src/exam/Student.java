package exam;

public class Student{
	String name;
	int age;
	String major;
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 쩐공: " + major);
	}

	
	
}
