package day5;

public class MultipleTableEx1구구단이중반복문08 {

	public static void main(String[] args) {
		/* 2단에서 9단까지 구구단을 출력하는 코드를 작성하세요
		 * 
		 * */
		//01. 2단에서 9단까지 (for과 while을 이용해서)
				int num = 2, j;
						for(num=2 ; num<=9 ; num++) {
							j=1 ;
							while(j<=9) {
								System.out.println(num + " X " + j + " = " + num * j);
								j++;
							}
							num++;
			}
	}

}
