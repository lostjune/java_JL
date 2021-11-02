package day5;

public class StarEx3중요반복문예제11 {

	public static void main(String[] args) {
		/*       * i=1 *=1 엔터
		 *      ** i=2 *=1 엔터
		 *     *** i=3 *=1 엔터
		 *    **** i=4 *=1 엔터
		 *   ***** i=5 *=1 엔터
		 *  위와 같이 출력되도록 코드를 작성하세요
		 *  반복횟수 : i는 1부터 5까지 1씩 증가
		 *  실행문 : 공백을 ??개 출력하고, *을 i개 출력하고, 엔터를 출력
		 *         반복횟수 : j는 1부터 5-i까지 1씩 증가 " " 을 출력
		 *         실행문 : 공백을 출력
		 *         반복횟수 : j는 1부터 i까지 1씩 증가
		 *         실행문 : *을 출력
		 *         엔터를 출력
		 *  주의) 공백출력시 println(이전 모든 실행문들)말고 print(이전 모든 실행문들은)라고 입력해야 적용되면서 실행됨.항상 마지막 실행문은 println으로 입력.
		 * */
		
		//01. for문 이용
			int num = 5, i, j;
				for(i = 0 ; i <= 5; i++) {
					for(j = 0 ; j <= num-i ; j++ ) {
						System.out.print(" ");
					}
					for(j = 0 ; j <= i-1 ; j++ ) {
						System.out.print("*");
					}
					System.out.println();
				}
		   
	}

}
