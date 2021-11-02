package day5;

public class PrintNumEx1숫자출력예제13 {

	public static void main(String[] args) {
		/*
		 * 예제1) 다음과 같이 출력하도록 코드를 작성하세요. 
		 * 1 2 3  i=1  |  시작숫자 : 1
		 * 4 5 6  i=1  |  시작숫자 : 4
		 * 7 8 9  i=1  |  시작숫자 : 7
		 *             |  시작숫자 : 3*1 - 2
		 *             
		 * */
		/* 방법1 : 3의 배수마다 숫자 출력 후 엔터를 침
		 * */
		
		//예제1) for문을 이용 (왼쪽보기)
			int i = 1, j = 3;
			for( i = 1 ; i <= 9 ; i++) {
				System.out.print(i + " ");
				//i가 3의 배수이면 엔터를 출력
				if(i % 3 == 0) {
					System.out.println();
				}
		//예제2)	(오른쪽보기)	
			}
			for(i = 1; i<=3; i++) {
				for(j = 3 * i - 2; j <= 3 * i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
	
	}
