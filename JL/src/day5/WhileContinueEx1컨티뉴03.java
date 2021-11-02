package day5;

public class WhileContinueEx1컨티뉴03 {

	public static void main(String[] args) {
		/* 1~10사이의 홀수를 While문을 이용하여 출력하는 예제
		 * */
		
		//방법1
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				continue;
		}
		System.out.print(i + " ");
		i++;
		}
		System.out.println();
		//방법2
		i = 0;
		while( i <= 10) {
			i++;
			if(i % 2 == 0) {
			continue;
		}
		System.out.println(i + " ");
		}
	}

}
