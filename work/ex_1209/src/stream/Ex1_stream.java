package stream;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1_stream {
	public static void main(String[] args) {
		
		List<String> names = List.of("영희", "철수", "민수","짱구","수진");
		List<Integer> nums = List.of(1,5,3,4,2,7,6);
		
		Stream<String>  s_names = names.stream();
		
		s_names
			.map(x -> x + "님")
			.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		// distinct : 줃복 제거	
		nums.stream()
			.distinct()
			.sorted()
			.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		// limit / skip - 일부만 잘라 쓰는 중간 연산'
		nums.stream()
			.limit(3) // 앞에서부터 3개만
			.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		nums.stream()
		.skip(3) // 앞의 3개를 자르고 나머지                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  출력
		.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		
		// 스트림으로 가공한 결과를 List, Set 같은 컬렉션으로 다시 만들고싶으면
		// Collection(Collectors...)를 사용한다
		
		List<Integer> evenList = nums.stream()
									.filter(x -> x % 2 == 0)
									.distinct()
									.sorted()
									.collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println("--------------------------------");
		
		// Collectors에 들어있는 메서드
		// toList() : 리스트로 반환
		// toSet() : set으로 반환
		// joining(", ") : 문자열들을 하나로 합치기
		// groupingBy(...) : 특정 기준으로 그룹 나누기
		
		List<String> itmes = List.of("A", "B", "A", "C");
		
		Set<String> set = itmes.stream()
							.collect(Collectors.toSet());
		
		System.out.println(set);
		System.out.println("--------------------------------");
		
		List<String> words = List.of("Java", "Spirng", "React");
		
		String joined = words.stream()
						.collect(Collectors.joining(" "));
						
		System.out.println(joined);
		System.out.println("--------------------------------");
		
		List<String> names2 = List.of("Kim", "Lee", "Park", "Choi", "Jin", "Ham", "Ha");
		
		Map<Integer, List<String>> grouped = 
				names2.stream()
					.collect(Collectors.groupingBy(name -> name.length())); // 문자열 길이로 그룹 나눔
		
		System.out.println(grouped);
		System.out.println("--------------------------------");
		
		
		// count - 개수 - 세기
		long count = nums.stream()
				.filter(x -> x % 2 == 0)
				.count();
		
		System.out.println(count);
		System.out.println("--------------------------------");
		
		// 조건 만족 여부 검사
		List<Integer> nums2 = List.of(1,2,3,4,5);
		// 결과를 boolean으로 반환
		// anyMatch - 하나라도 만족하면 true를 반환
		boolean hasEven = nums2.stream().anyMatch(x -> x % 2 == 0);		
		
		System.out.println(hasEven);
		System.out.println("--------------------------------");
		
		// anyMatch - 모든 조건을 만족해야 true 반환
		boolean allPositive = nums2.stream().allMatch(x -> x > 0);		
		
		System.out.println(allPositive);
		System.out.println("--------------------------------");
		
		// noneMatch - 요소들이 모두 조건을 만족하지 않으면 참
		boolean noneNegative = nums2.stream().noneMatch(x -> x < 0);
		
		System.out.println(noneNegative);
		System.out.println("--------------------------------");
		
		
		// findFirst
		// 하나만 찾기
		Optional<String> result = names.stream()
									.filter(s -> s.startsWith("영")) // 영 으로 시작하는
									.findFirst();
		
		System.out.println(result);
		System.out.println("--------------------------------");
		
		// findAny
		// 스트림 요소에서 아무거나 반환 (무엇이 나올 지는 보장 불가능)
		
		Optional<String> anyName = names.stream()
									.filter(x -> x.length() == 2)
									.findAny();
		
		System.out.println(anyName);
		System.out.println("--------------------------------");
		
		
		
	}
	
	
}
