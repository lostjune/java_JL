package day3;

public class MutipleTableEX1구구단13 {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 작성하세요.
		 * 7 x 1 = 7   i = 1, 7 x 1 = 7
		 * 7 x 2 = 14  i = 2, 7 x 2 = 7 * 2
		 * ...
		 * 7 x 9 = 63  i = 1, 7 x 1 = 7 * 9
		 *                    7 x i = 7 * 1
		 */
		int i;
		int num = 5;		
		for(i = 1 ; i <= 9 ; i++) {
		System.out.println(num + " x " + i + "=" + num * i);
		}
	}

}
