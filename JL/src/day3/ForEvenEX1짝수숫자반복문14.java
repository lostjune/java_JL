package day3;

public class ForEvenEX1짝수숫자반복문14 {

	public static void main(String[] args) {
		/* 1부터 10까지 짝수들만 출력하는 코드를 for문을 이용하여 작성하세요.
		 * 출력 예시)
		 * 2
		 * 4
		 * 6
		 * 8
		 * 10
		 * 방법1
		 * 반복횟수 : num은  1부터 10까지 1씩증가
		 * 규칙성  : num가 짝수이면 num을 출력
		 * */
		int num;
		for(num = 1 ; num <=10  ; num++ ) {
			if(num % 2 == 0)
		    System.out.println(num + " ");
		}
	    System.out.println();
		/* 방법2
		 * 반복횟수 : num은 2부터 10까지 2씩 증가
		 * 규칙성  : num을 출력
		 * */
	    System.out.println("---방법2---");
		for(num = 2 ; num <= 10; num = num + 2) {
			System.out.println(num + " ");
		}
		/* 방법3
		 * 반복횟수 : num은 2부터 10까지 2씩 증가
		 * 규칙성  : 2*num 출력
		 * */
		System.out.println("---방법3---");
		for(num = 1 ; num <=5  ; num++) {
		   System.out.println(num * 2 + " ");
		}
	}

}
