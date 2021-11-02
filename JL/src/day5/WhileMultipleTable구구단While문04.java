package day5;

public class WhileMultipleTable구구단While문04 {

	public static void main(String[] args) {
		/* while문을 이용하여 구구단 7단을 출력하는 코드를 작성하세요.
		 * 반복횟수 : i(1)부터 9까지 1(1회)씩증가
		 * 규칙성  : 7xi = 7*i를 출력
		 * while문은 조건식쓸 때 (초기화 값과 증감식)을 넣어주면 안된다. 출력 실행문에 넣어주는 건 가능. 안넣고 공식만 만들어도 됨.
		 * */
		
		//01. 7단
		int i = 1, num = 7;
		while(i <= 9) {
			System.out.println(num + " x " + i + " = " + (num*i));
			i++;
		}
		//02. 6단
		i = 1;
		num = 6;
		while(i <= 9) {
			System.out.println(num + " x " + i + " = " + (num*i++));
		}
	}

}
