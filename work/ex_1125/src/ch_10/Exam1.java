package ch_10;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//단일 문자 배열에 단어와 숫자를 섞어 넣는다.
	    char[] cards = {'1','L','O','2','V','3','E'};
	    String myWord = "";

	    // 알파벳만 출력
	    for(int i = 0; i< cards.length; i++) {
	         if((cards[i] >= 'A' && cards[i] <= 'Z')||(cards[i] >= 'a' && cards[i] <= 'z')) {
	        	 myWord += cards[i];
	        	 
	         }
	      }
	    System.out.println(myWord);
	    
	    // 키보드에서 배열의 길이를 입력 받는다
	    // 입력받은 배열의 길이만큼 알파벳을 요소로 넣고
	    // 배열의 길이를 정해주세요 :
	    // 입력 : 5
	    // 출력 : A B C D E
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("배열의 길이를 정해주세요 : ");
	    char[] length = new char[sc.nextInt()];
	    
	    char ch = 'A';
	    for(int i = 0; i< length.length; i++) {
	    	length[i] = ch++;
	    }
	    System.out.println(Arrays.toString(length));
	      
	} // 메인

} // 클래스
