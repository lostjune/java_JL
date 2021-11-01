package day4;

public class ForEx1숫자반복문08 {

	public static void main(String[] args) {
		/* for문 사용시 조심해야 하는 상황 */
		//1부터 5까지 출력하는 예제에서 발생한 실수
		int i;
		System.out.println("1부터 5까지 합? : ");
		/* 원인 : for문 뒤에 ;이 와서 for문의 실행문이 없는 경우*/
		for( i = 1; i <= 5; i++ ); 
		{
		System.out.println(i + " ");
		}
		System.out.println();
		/* 원인 : 조건식을 잘못 설정하여 1번도 실행 안되는 경우 */
		
		for( i = 1 ; i >=5 ; i++ ) {
			System.out.println(i + " ");
		}
	}

}
