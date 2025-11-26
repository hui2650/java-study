package ch_16;

public class StudentMain {
	public static void main(String[] args) {
		
		Student std = new Student("홍길동", 95, 85, 90);
		
//		int total = std.getTotal();
//		System.out.println("총 점수는 " + total);
//		
//		double avg = std.getAverage();
//		System.out.println("평균 점수는 " + avg);
//		
//		char grade = std.getGrade();
//		System.out.println(std.name + "의 " + "등급은 " + grade);
		
		std.printInfo();
	}
}
