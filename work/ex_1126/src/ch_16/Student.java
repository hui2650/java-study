package ch_16;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	//생성자를 통해 필드를 초기화한다.
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//	StudentMain클래스에서
	//	"홍길동",95,85,90 데이터를 갖는 객체를 생성하고
	//	이름,총점,평균,등급을 출력하세요
	
	//	메서드
	//	int getTotal() : 총점을 반환한다.
	//	double getAverage() : 평균을 소수 둘째 자리까지 반환한다.
	//	char getGrade() : 평균에 따라 성적 등급을 반환한다.

	
public int getTotal() {
	int total = this.kor + this.eng + this.math;
	return total;
}

public double getAverage() {
	double avg =  getTotal() / 3;
	return avg;
}
	
public char getGrade() {
	
	double avg = getAverage();
	
	if(avg >= 90) {
		return 'A';
	}else if(avg >= 80) {
		return 'B';
	}else if(avg >= 70) {
		return 'D';
	}else if(avg >= 60) {
		return 'E';
	}else {
		return 'F';
	}
}

//이름,총점,평균,등급을 출력하는 메서드
public void printInfo() {
    System.out.println("이름: " + name);
    System.out.println("총점: " + getTotal());
    System.out.println("평균: " + getAverage());
    System.out.println("등급: " + getGrade());
}
	
	
	
	
	
	
	
	
	                 
}

