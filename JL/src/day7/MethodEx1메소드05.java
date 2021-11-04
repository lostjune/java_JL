package day7;

public class MethodEx1메소드05 {

	public static void main(String[] args) {
		
		int num  = sum(1,2); //3;
		System.out.println(num);
		System.out.println(sum((int)1.0,2));
		int a=1, b=2;
		System.out.println(sum(a,b));

		
	}
	/* 위 코드 작업1
	 *  기능 : 두 정수의 합을 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2 ( O )
	 * int num1, num2//잘못된 매개변수 선언 방법  ( X )
	 * 리턴타입 : 두 정수의 합 => 정수 = int
	 * 메소드명 : sum
	 * 
	 * */

	public static int sum(int num1, int num2) {
		int result = num1 + num2;//이 값이 저장되는 곳은 아래 return result( 이름을 result로 설정해서)
		return result;
	}
	/* 위 코드 작업2
	 *  기능 : 두 정수의 합을 콘솔(CPU)에 출력하는 메소드
	 * 매개변수 : 두정수 => int num3, num4
	 * 리턴타입 : void
	 * 메소드명 : sum2
	 *  
	 * */
	
	public static int sum2(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
}

