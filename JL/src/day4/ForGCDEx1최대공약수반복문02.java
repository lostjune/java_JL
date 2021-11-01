package day4;

import java.util.Scanner;

public class ForGCDEx1최대공약수반복문02 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 출력(구하는)하는 코드를 for문을 이용하여 작성하세요.
		 * 약수 : 나누어서 떨어지는 수.
		 * 12의 약수 : 1 2 3 4 6 12
		 * 8의 약수 : 1 2 4 8
		 * 공약수 : 두 정수의 약수 중 공통으로 있는 약수
		 * 8과 12의 공약수 : 1 2 4
		 * 최대 공약수 : 두 정수의 공약수 중 가장 큰수
		 * 8 과12의 최대공약수 : 4
		 * 
		 * 반복횟수 : i는 1부터 num1까지 1씩 증가
		 * 규칙성 :  i가 12(num1)의 약수이고, i가 8(num2)의 약수이면 i를 출력
		 *      =>num1을 i로 나누었을때 나머지 0과 같고.
		 *        num2을 i로 나누었을때 나머지 0과 같으면
		 *        i를 출력
		 *        
		 * 규칙성 :  i가 12(num1)의 약수이고, i가 8(num2)의 약수이면 gcd변수에 i에 저장
		 *      =>num1을 i로 나누었을때 나머지 0과 같고.
		 *        num2을 i로 나누었을때 나머지 0과 같으면
		 *        gcd 변수에 i를 저장
		 * 반복문 종료 후 : gcd를 출력             
		 * */
		
		int num1 = 12;
		int num2 = 8;
		int i, gcd = 0;
		
		for(i = 1 ; i <= num1  ; i++ ) {
			if(num1 % i == 0 && num2 % i == 0 ) {
			gcd = i;
			}
		    
		}
		System.out.println();
	}

}
