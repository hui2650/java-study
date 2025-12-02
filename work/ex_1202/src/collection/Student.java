package collection;

public class Student {
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
	    return "이름: " + name + ", 점수: " + score;
	}
	
	
}
