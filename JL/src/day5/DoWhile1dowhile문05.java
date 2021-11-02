package day5;

public class DoWhile1dowhile문05 {

	public static void main(String[] args) {
		/* do while 문을 이용한 Hello 5번 출력 예제
		 * 
		 * <do while 작성 방법>
		 * do while 문 작성시 기준값 int i(시작값)입력후 (int(기준 또는 시작값)은 즁복되므로 다중작업시 맨 윗단 한번만) 
		 * do는 앞에 써주고 실행문 바로 뒤에 세미콜론옆에 while을 써주고(조건식을 써야만 실행가능) 
		 * */
		
		int i = 1;
		do {
			System.out.println("Hello");
			i++;
		}while(i<=5);
		
		/* 정수의 초기값이 10시작해서 5보다 작거나 같은 정수를 출력하는 예제*/
		
		//01. for를 이용 시
		System.out.println("for문을 이용");
		for(i = 10; i<=5 ; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		//02. do while문을 이용 시
		System.out.println("do while 문을 이용");
		i = 10;
		do {
			System.out.println(i + " ");
			i--;
		}while(i>=5);
	}

}
