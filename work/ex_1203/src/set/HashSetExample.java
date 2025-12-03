package set;

import java.util.HashSet;
import java.util.Random;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("a");
		hs.add("f");
		hs.add("c");
		hs.add("b");
		
		System.out.println(hs);
		
		//HashSet에 데이터가 저장되는 방법
		// 동일한 값을 허용하지 않는다
		// 동일한 객체란, 꼭 같은 타입의 객체를 의미하는 것은 아니다.
		// HashSet은 데이터를 객체의 hashCode()값을 호출하여 비교하고
		// 같으면 equals() 메서드를 호출하여 다시 비교해 두 객체가 같음을 증명한다

		// 중복된 데이터는 추가되지 않는다 / 문법적으로 에러가 나는건 아님
		hs.add("a");
		
		hs.remove("b");
		
		System.out.println(hs);
		
		hs.removeAll(hs);
//		hs.clear();
		System.out.println(hs);
		
		// 1~45 사이의 난수 6개를 뽑아서 넣기
		HashSet<Integer> lotto = new HashSet<Integer>();
		Random r = new Random();
		
		// lotto가 6이 될 때까지
		while(lotto.size() < 6) {
		    lotto.add(r.nextInt(45) + 1);
		}
		
		
		System.out.println(lotto);
		
	}
}
