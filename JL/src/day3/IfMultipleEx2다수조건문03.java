package day3;

import java.util.Scanner;

public class IfMultipleEx2다수조건문03 {

	public static void main(String[] args) {
		/* 정수를 입력 받고,
		 * 정수가 2의 배수이면 2의 배수라고 출력,
		 * 정수가 3의 배수이면 3의 배수라고 출력,
		 * 정수가 6의 배수이면 6의 배수라고 출력,
		 * 정수가 2, 3, 6의 배수가 아니면 2, 3, 6의 배수가 아닙니다라고 출력하는
		 * 코드를 작성
		 * 단, 6, 12, ... 6의 배수라고 출력
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수입력 : ");
		int num = scan.nextInt();
		
		
		if (num % 2 == 0 && num % 3 !=0) {
			System.out.println(num + "는 2의 배수입니다");
	    }
	    else if(num % 3 == 0) {
		    System.out.println(num + "는 3의 배수입니다");
        }
        else if(num % 6 == 0) {
			System.out.println(num + "는 6의 배수입니다");
		}
        else {
        	System.out.println(num + "는 2, 3, 6의 배수가 아닙니다.");
        }
        scan.close();
	}
}
