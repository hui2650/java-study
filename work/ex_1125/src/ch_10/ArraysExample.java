package ch_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {
   public static void main(String[] args) {
      //Arrays클래스
      //배열의 복사, 정렬, 검색 등
      //배열을 다루기 위한 다양한 메서드를 가지고 있다.
      
      //Scanner,Random 클래스에 있는 기능을 가져다 쓸 때
      
      //Arrays는 객체의 생성 없이 호출해서 쓸 수 있다.
      //static -> 객체의 생성없이 호출하는것이 가능하다
      //클래스에 붙어있는 변수를 만들거나, 메서드를 만들 때 붙이는 키워드
      //메모리에 무조건 한번만 올라간다.

      //toString()
      //배열의 출력
      
      int[] arr = {10,7,2,5,9,1,3,6,4,8};
      
      for(int i = 0; i< arr.length; i++) {
         System.out.print(arr[i]+" ");
      }
      System.out.println();
      
      for(int i : arr) {
         System.out.print(i+" ");
      }
      System.out.println();
      
      System.out.println(Arrays.toString(arr));
      
      //sort()
      //배열의 정렬
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      
      //내림차순
      //Comparator.reverseOrder()
      //기본타입의 배열로는 불가능하다.
      //기본자료형의 클래스타입이 필요하다. -> Wrapper 클래스
      Integer[] ar = {1,6,3,2,10,7,5,9,4,8};
      
      Arrays.sort(ar,Comparator.reverseOrder());
      System.out.println(Arrays.toString(ar));
      
      //배열의 복사
      //자바에서 배열은 한 번 생성하면 길이 변경할 수 없다.
      //더 많은 데이터를 저장해야 하거나 기존의 배열과 같은 배열을 만드려면
      //배열을 복사해야한다.
      
      //얕은 복사(Shallow copy)
      int[] arr01 = {1,2,3};
      
      int[] arr02 = arr01;

      System.out.println("arr02 배열 : " + Arrays.toString(arr02));
      
      arr01[1] = 20;
      
      System.out.println("arr02 배열 : " + Arrays.toString(arr02));
      
      //깊은복사
      //반복문을 이용해서 새로운배열에 값을 직접 넣거나
      //Arrays클래스 또는 System 클래스가 가진 기능을 이용한다.
      
      int[] cards = {1,6,4,5,3,2};
      int[] newCards = new int[cards.length];
      
      System.out.println(Arrays.toString(cards));
      
      
      
      //1. 반복문을 이용한 깊은 복사
      for(int i = 0; i < cards.length; i++) {
         newCards[i] = cards[i];
      }
      
      System.out.println(Arrays.toString(newCards));
      
      //Arrays클래스를 이용한 깊은복사
      int[] newCards2 = Arrays.copyOf(cards, cards.length);
      
      System.out.println(Arrays.toString(newCards2));
      
      cards[1] = 100;
      System.out.println(Arrays.toString(cards));
      System.out.println(Arrays.toString(newCards));
      System.out.println(Arrays.toString(newCards2));
      
      
      //변수 money에 10~5000 사이의 난수를 발생시켜 넣는다.
      //단 1의 자리는 반드시 0이 되도록 한다
      // ex) 3450, 2100, 60
      
      //발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지 출력
      
      //가능한 적은 수의 동전을 사용한다
      
      
      int [] coins = {500, 100, 50, 10};
      
      int money = (new Random().nextInt(500)+1)*10;
    
      
      System.out.println("금액: " + money);

      // 기존 방식
//      for(int i = 0; i < coins.length; i++) {
//    	  int res = money / coins[i];
//    	  System.out.println(coins[i] + "원" + " : " + res + "개");
//    	  money %= coins[i];
//      }
      
      //향상된 for문 방식
      for(int coin : coins){
          int cnt = money / coin;
          money %= coin;

          System.out.println(coin + "원 : " + cnt + "개");
      }
      System.out.println("-----------------------------------------");
      
      
      
      //2차원 배열의 모든 요소의 합 구하기
      int[][] arr03 = {
    		  {1,2,3},
    		  {4,5,6,7},
    		  {9},
    		  {10,11,12,13},
    		  {14,15},
    		  {16,17,18,19,20}
      };
      
      int sum = 0;
      
      //기존 	방식
//      for(int i = 0; i < arr03.length; i++) {
//    	  for(int j = 0; j < arr03[i].length; j++) {
//    		  sum += arr03[i][j];
//    	  }
//      }
      
      //향상된 for문 방식
      for(int[] row : arr03) {
    	    for(int n : row) {
    	        sum += n;
    	    }
    	}
   
      System.out.println("2차원 배열의 총합은 : " + sum);
      
      // 1~45 사이의 난수를 발생시켜 로또번호 6개를 배열에 저장하는 프로그램 만들기
      // 겹치는 것은 들어가면 안됌
      
      int[] lottos = new int[6];
      
      for(int i = 0; i < lottos.length; i++) {
    	  
    	  lottos[i]= new Random().nextInt(45)+1;
    	  
    	  
    	    boolean isDup = false;
    	    for(int j = 0; j < i; j++) {   // 이미 채운 부분만 검사
    	        if(lottos[j] == lottos[i]) {
    	        	isDup = true;
    	            break;
    	        }
    	    }
    	    if(isDup) {
    	        i--;   // 이번 칸 다시 채워야 하므로 i를 되돌리기
    	        continue;
    	    }

    	    lottos[i] = lottos[i];    	  
    	  
    	    System.out.println(lottos[i]);
    	    
      }
      
      
      
      
      
      
   }   
}
