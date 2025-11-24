package ch_08;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//문자의 개수 세기
		//키보드에서 한글, 영문을 무작위로 입력받는다.
		//입력받은 문자열에서 소문자 a의 개수를 구하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한글과 영문을 무작위로 입력하시요");
		String str = sc.next();
		
		System.out.println( str.length() );
		
		int count = 0;
		
		for(int i =0; i < str.length(); i++){
			if(str.charAt(i) == 'a') {
				count ++;
			}
		}
		 System.out.println("a의 개수: " + count);
		 
		 
		 //문자열을 입력받아서 한글자씩 뒤집어서 출력해주세요
		 //hello -> olleh
		 
		 System.out.println("뒤집을 문장를 입력해주세요");
		 String str2 = sc.next();
		 
		 String result = "";
		 
		 for(int i = str2.length() -1; i >= 0; i--) {
			 result += str2.charAt(i);
		 }
		 
		 System.out.println(result);
		 
		 
		 //키보드에서 이메일을 입력받고 아이디 부분만 추출하기
		 
		 System.out.println("이메일을 입력하세요");
		 
		 String str3 = sc.next();
		 
		 int location = str3.indexOf("@");
		 String id = str3.substring(0, location);
		 
		 
		 System.out.println(id);
		  
		 
		 
		 

	}
}
