package day7;

import java.util.Random; //import 하는 방법은 옆과 같이 입력한 후 마지막 부분에 코드(예)Random)입력

public class RandomEx1랜덤배열01 {

	public static void main(String[] args) {
		/*
		 * 랜덤으로 원하는 범위의 정수를 만드는 예제
		 * Math.random() : 0이상 1미만의 랜덤한 실수를 생성
		 * 0 <= Math.random() < 1
		 * 0 <= Math.random()*(max-min+1) < max-min+1
		 * min <= Math.random()*(max-min+1)+min < max+1
		 * 
		 * 
		 * */
		
		//예제1)
		//방법1)
		int min = 5, max = 10;
		for(int i = 0; i<5 ; i++) {
			int random = (int)(Math.random()*(max-min+1)+min);
			System.out.print(random + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		/* Random 클래스에서 제공하는 nextInt(정수) : 0이상 정수미만의 랜덤한 정수를 생성
		 * 0 <= nextInt(max-min+1) < max-min+1
		 * min <= nextInt(max-min+1) + min < max + 1
		 * */
		
		Random r = new Random();
		for(int i = 0; i<5; i++) {
			int random = r.nextInt(max-min+1)+min;
			 System.out.println(random + " ");
		}
	}

}
