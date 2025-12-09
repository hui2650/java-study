package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	   private String name;
	   private int score;
	   
	   public Student(String name, int score) {
	      this.name = name;
	      this.score = score;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public int getScore() {
	      return score;
	   }
	   
	   @Override
	   public String toString() {
	      return name + "("+score+")";
	   }
	}


public class Exam {
	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
		
		// 3의 배수의 합을 구하시오
		
		int sum = nums.stream()
				.filter(x -> x  % 3 == 0)
				.reduce(0, (acc, n) -> acc + n);
		
		System.out.println(sum);
		System.out.println("-----------------------------");
		
		List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot");
		
		// "A"로 시작하는 문자열만 포함한, 소문자로 바꾼 List를 만드세요
		
		List<String> startA = words.stream()
								.filter(x -> x.startsWith("A"))
								.map(x -> x.toLowerCase())
								.collect(Collectors.toList());
		
		System.out.println(startA);
		System.out.println("-----------------------------");
		
	    //점수가 80점 이상인 학생만 필터링하고
	    //점수를 기준으로 내림차순으로 정렬한뒤
	    //List<Student>로 다시 모으는 코드 작성하기
		
		List<Student> students = List.of(
	               new Student("Kim",82),
	               new Student("Lee",95),
	               new Student("Park",60),
	               new Student("Choi",77),
	               new Student("Jung",90)
	            );
	            

		List<Student> newStudents = students.stream()
			.filter(x -> x.getScore() >= 80)
			.sorted((a, b) -> b.getScore() - a.getScore())
			.collect(Collectors.toList());
		
		System.out.println("점수가 80점 이상인 학생들을 점수기준으로 내림차순 정렬 : " + newStudents);
		System.out.println("-----------------------------");
		
		// 성이 3글자인 학생만 필터링해서 리스트로 만들기		
		List<Student> lastName = students.stream()
							.filter(x -> x.getName().length() == 3 )
							.collect(Collectors.toList());
		
		System.out.println("성이 3글자인 학생들 : " + lastName);
		System.out.println("-----------------------------");
		
		// 점수가 80점 이상인 학생 수
		List<Student> scoreB = students.stream()
				.filter(x -> x.getScore() > 80 )
				.collect(Collectors.toList());
		
		System.out.println("점수가 80점 이상인 학생들 : " + lastName);
		System.out.println("-----------------------------");
		
		// 80점 이상인 학생들의 평균
		double average = students.stream()
				.filter(x -> x.getScore() >= 80 )
		        .mapToInt(Student::getScore)
		        .average() // average는 double을 반환하기 때문에 반환타입이 int면 에러
		        .orElse(0);
		
		System.out.println("80점 이상인 학생들의 평균 : " + average);
		System.out.println("-----------------------------");
		
		//점수 구간별 그룹핑
		// 90점이상 A
		// 80점이상 B
		// 70점이상 C
		
		Map<String, List<Student>> grouped = students.stream()
				.collect(Collectors.groupingBy(s -> {
					int score = s.getScore();
					if(score>=90) {
						return "A";
					}else if (score >= 80) {
		                return "B";
		            } else if (score >= 70) {
		                return "C";
		            }else {
		            	return "D";
		            }
				}));
		
		System.out.println("점수별로 구간별 그룹핑 : " + grouped);
		
		
		
		
		
		
		
		
	}
}
