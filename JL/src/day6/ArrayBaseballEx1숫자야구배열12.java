package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBaseballEx1숫자야구배열12 {

	public static void main(String[] args) {
		/*
		 * 예제1) 숫자 야구 게임
		 * 컴퓨터가 랜덤으로 1~9사이의 중복되지 않은 세 수를 선택하고,
		 * 사용자는 컴퓨터가 선택한 세 수를 맞추는 게임
		 * => 사용자가 처음으로 입력한 중복되지 않은 1~9사이의 세 수를 컴퓨터가 만든 수라고 가정하고,
		 * 사용자는 컴퓨터가 선택한 세 수를 맞추는 게임
		 * 
		 * 규칙 * 
		 * S : 숫자가 있고, 숫자의 위치가 맞은 경우 
		 * B : 숫자는 있지만 위치가 안 맞은 경우
		 * 30: 맞는 숫자가 하나도 없는 경우
		 * 3S: 게임 종료
		 * 컴퓨터(com) : 1 9 5 *
		 * 
		 * 1S
		 * 사용자 : 1 2 3
		 * 2S
		 * 사용자 : 1 4 5
		 * 1S1B
		 * 사용자 : 1 5 8
		 * 1B
		 * 사용자 : 5 7 8
		 * 30
		 * 사용자 : 5 7 8
		 * 3S
		 * 사용자 : 1 9 5
		 * 정답입니다. 프로그램 종료.
		 * 
		 * */
		
		//예제1) 사용자가 컴퓨터 숫자 3개를 입력해서 저장
		
		int [] com = new int[3];
		int [][][]com2 = new int[1][1][3];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("컴퓨터 : ");
//		com[0] = scan.nextInt();
//		com[1] = scan.nextInt();
//		com[2] = scan.nextInt();
		for(int i = 0; i<com.length; i++) {
			com[i] = scan.nextInt();
		}
		
		//예제2) 사용자가 세 수를 입력 받음
		int user[] = new int[3];
		int strike = 0, ball = 0;
		
		do {
			System.out.print("사용자 : ");
			for(int i = 0; i<user.length; i++) {
				user[i] = scan.nextInt();
			}
		//예제4)스트라이크 개수를 계산하여 스트라이크 개수를 출력
			strike = 0;
			
			for(int i = 0; i<com.length; i++) {
				if(com[i] == user[i]) {
					strike++;
				}
			}
		
	//예제5) 볼의 개수를 계산하여 볼의 개수를 출력
			ball = 0;
			for(int i =0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					//com[i], user[j]
					//스트라이크인 경우는 생략
					if(i == j) {
						continue;
					}
					if(com[i] == user[j]) {
						ball++;
					}
				}
			}
	//스트라이크만 있는 경우는 xS
	//볼만 있으면 xB
	//스트라이크와 볼이 같이 있는 경우 xSyB
	//스트라이크와 볼이 없는 경우 30이 출력되도록 작성해보세요.
			if(strike != 0) {
				System.out.print(strike + "S");
			}
			if(ball != 0) {
				System.out.print(ball + "B");	
			}
			if(strike == 0 && ball == 0) {
				System.out.print("3O");
			}
			System.out.println();
			
		}while(strike != 3);
		
		System.out.println("정답입니다. 프로그램을 종료합니다.");
		
		scan.close();
	}
}