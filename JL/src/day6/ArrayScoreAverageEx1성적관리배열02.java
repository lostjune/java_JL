package day6;

import java.util.Scanner;

public class ArrayScoreAverageEx1성적관리배열02 {

	public static void main(String[] args) {
		/* 예제1)
		 * 배열을 이용하여 5명의 학생의 국어 성적을 입력받아 평균을 구하는 코드를 작성하세요
		 * 단 성적을 배열에 저장해야 하고, 성적은 정수입니다
		 * 
		 * */
		//예제1)Scanner 이용(입력시 항상 대문자 조심)
		//방법1)
		//5개짜리 정수형 배열을 생성
		int[] arr = new int[5];
		//성적표
		Scanner scan = new Scanner(System.in);
		System.out.print("학생1의 성적 : ");
		arr[0] = scan.nextInt();
		System.out.print("학생2의 성적 : ");
		arr[1] = scan.nextInt();
		System.out.print("학생3의 성적 : ");
		arr[2] = scan.nextInt();
		System.out.print("학생4의 성적 : ");
		arr[3] = scan.nextInt();
		System.out.print("학생5의 성적 : ");
		arr[4] = scan.nextInt();
		//배열의 합
		int sum = 0;
		sum += 90;
		sum += 80;
		sum += 70;
		sum += 60;
		sum += 50;
		System.out.println("5개의 배열의 합 : " + sum);
		//합을 이용하여 평균값 출력
		double average = sum / 5.0;
		System.out.println("5명의 평균 : " + average);
		
		//방법2) 반복문 이용
		int arr2[] = new int[5];
		int i;
		
		for(i=0; i<5 ; i++) {
			System.out.print("학생"+(i+1)+"의 국어 성적 : ");
			arr2[i] = scan.nextInt();
		}
		for(i=0 ; i<5 ; i++ ) {
			sum += arr2[i];
		}
		average = sum / 5.0;
		System.out.println("5명의 평균 : " + average);
		
		scan.close();
	}

}
