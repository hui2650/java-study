package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Student 객체를 list에 저장할 수 있다
		ArrayList<Student> list = new ArrayList<>();
		
		// 익명객체
		list.add(new Student("홍길동", 90));
		list.add(new Student("고길동", 72));
		list.add(new Student("김철수", 85));
		
		for(Student s : list) {
			System.out.println(s.name + " " + s.score);
		}
		
		// 유저의 정보를 키보드에서 입력받아 ArrayList에 추가를 한다 (id, pwd)
		// 아이디가 생성될 때 list에 이미 아이디가 저장되어 있다면
		// 아이디가 중복됩니다 충력되고 다시 입력받기
		
		ArrayList<UserInfo> users = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		// 생성자 필드 초기화 필수
//		for(int i = 0; i < 3; i++) {
//			
//			System.out.print("아이디 입력: ");
//			String id = sc.next();
//			System.out.print("비밀번호 입력: ");
//			int pwd = sc.nextInt();
//			
//			boolean isDuplicate = false;
//			
//			for (UserInfo u : users) {
//			    if (u.getId().equals(id)) {
//			    	isDuplicate = true;
//			    	break;
//			    } 
//			}
//			
//			if (isDuplicate) {
//			    System.out.println("아이디가 중복됩니다!");
//			} else {
//			    users.add(new UserInfo(id, pwd));
//			    System.out.println("가입 완료!");
//			    // 최근 추가된 사용자 목록 출력
//			    System.out.println(users.get( users.size() - 1));
//			    // users.get(i) = 위험!! (i로 접근 X)
//			}			
//		}
		
		 outer:while(true) {
	         //아이디 입력
	         System.out.print("아이디 생성 : ");
	         UserInfo ui = new UserInfo();
	         ui.setId(sc.next());
	         
	         //검증
	         for(int i = 0; i < users.size(); i++) {
	            if(ui.getId().equals(users.get(i).getId())) {
	               System.out.println("아이디가 중복됩니다.");
	               continue outer;
	            }
	         }
	         //비밀번호 입력
	         System.out.print("패스워드 입력 : ");
	         ui.setPwd(sc.nextInt());
	         
	         //리스트에 추가
	         users.add(ui);
	         
	         for(int i = 0; i< users.size(); i++) {
	            System.out.println(users.get(i).getId());
	            System.out.println(users.get(i).getPwd());
	            System.out.println("---------------------");
	         }
	         
	         if(users.size()==3) {
	            break;
	         }
		 }
		
		// 정수형타입의 ArrayList arr
		ArrayList<Integer> arr = new ArrayList<>();
		
		int sum = 0;
		double avg = 0;
		
		// 10, 20, 30, 40, 50 인 배열 만들어서 합계와 평균 구하기
		for(int i = 0; i < 5; i ++) {
			arr.add((i+1)*10);
			
			sum += arr.get(i);
		}
		
		avg = (double)sum / arr.size();
		
		System.out.println(arr);
		System.out.println(sum);
		System.out.println(avg);
		
		// 문자열타입의 ArrayList words
		ArrayList<String> words = new ArrayList<>();
		
		// 데이터 추가
		words.add("자바");
		words.add("파이썬");
		words.add("C");
		words.add("JavaScript");
		words.add("Go");
		words.add("Oracle");
		
		// 문자열타입의 ArrayList longWords
		ArrayList<String> longWords = new ArrayList<>();
		
		// 3글자 이상의 문자열들만 longWords에 저장
		for (String word : words) {
			if(word.length() >= 3) {
				longWords.add(word);
			}
		}
		
		System.out.println(longWords); 
		
		
	}
}
