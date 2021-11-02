package day5;

import java.util.Scanner;

public class DowhileBreakEx01브레이크문06 {

	public static void main(String[] args) {
		/* 0을 입력할 때까지 정수를 계속 입력받는 코드를 작성하세요 
		 * */
		Scanner scan = new Scanner(System.in);
		//01. for 문 이용시
		int num = 0;
		//for 문으로 작성한 경우 num의 초기값에 따라 실행이 안될 수 있다
		for( ;num != 0 ; ) {
			System.out.println(" 정수를 입력하세요 ");
			num = scan.nextInt();
		}
		//02.do while 문 이용시
		System.out.println("do while문");
		num = 0;
		do {
			System.out.println(num + "  ");
			num++;
		}while(num <= 0);
	}

}
