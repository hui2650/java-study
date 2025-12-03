package map;

import java.util.HashMap;
import java.util.Scanner;

public class HaspMapExample {
	public static void main(String[] args) {
		// HashMap
		// Map 인터페이스를 구현하는 자식 클래스 중 가장 많이 사용하는 클래스
		// key, value를 한 쌍을 요소로 갖는다
		// key와 value의 제네릭타입을 각각 설정해줘야 한다
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
		// map 에 데이터 추가하기
		// put(key, value)
		
		map.put(1,  'A');
		map.put(2,  'B');
		map.put(3,  'C');
		map.put(4,  'D');
		map.put(5,  'E');
		
		System.out.println(map);
		// map에 저장되는 key는 중복될 수 없다 
		// value는 중복 가능
		
		map.put(6,  'A');
		System.out.println(map);
		
		// 같은 이름을 가진 key가 있다면 value를 갱신하게 된다
		map.put(1,  'F');
		System.out.println(map);
		
		// 요소의 삭제
		// remove(key);
		map.remove(3);
		System.out.println(map);
		
		// map의 크기
		System.out.println("map의 크기: " + map.size());
		
		// map의 value 꺼내기
		// get(key)
		char res = map.get(1);
		System.out.println(res);
		
		// getOrDefault(key, defaultValue)
		// get()은 없으면 null읇 반환한다
		// getOrDefault()는 없으면 기본값을 반환하기 때문에 실무에서 자주 쓰인다
		Character v1 = map.getOrDefault(9, '0');
		System.out.println(v1);
		
		// 비어있는지 검증
		// isEmpty()
		if(!map.isEmpty()) {
			System.out.println("map은 비어있지 않습니다");
		}
		
		// map의 특정 key가 들어있는지 검증
		// containsKey(key)
		System.out.println(map.containsKey(1));
		
		// map의 특정 value가 들어있는지 검증
		// containsValue(value)
		System.out.println(map.containsValue('B'));
		
		
		HashMap<String, Integer> users = new HashMap<String, Integer>();
		
		users.put("kim", 1111);
		users.put("lee", 2222);
		users.put("park", 3333);
		
		// 아이디와 비밀번호를 만든다
		// 로그인 기능  만들기
		// 아이디가 없으면 아이디가 존재하지 않습니다
		// 비밀번호가 일치하지 않으면 비밀번호 불일치
		// 아이디와 비밀번호가 일치하면 로그인성공
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력: ");
			String id = sc.next();
			
			if(!users.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다.");
				continue;
			}
			System.out.print("비밀번호를 입력: ");
			int pw = sc.nextInt();
			
			// realPw = user.get(id) 해당 아이디(key)의 value값(비번)
			int realPw = users.get(id);
			
			if(realPw == pw) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("비밀번호 불일치");
			}
			
			
		}
		
		
		
	}
}
