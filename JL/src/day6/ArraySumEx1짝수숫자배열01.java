package day6;

public class ArraySumEx1짝수숫자배열01 {

	public static void main(String[] args) {
		/* 예제1)
		 * 2부터 10사이의 짝수들을 배열에 저장하고, 배열에 저장된 값의 합을 출력하는
		 * 코드를 작성하세요
		 * 
		 * */
		/*
		//예제1) 방법1
		
		//정수형 5개까지 저장
		int [] arr = new int[5];
		//배열에 2부터 10까지 저장
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		//배열에 있는 값을 꺼내서 더함(누적)
		int sum = 0;
		sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4];
		System.out.println("2부터 10까지 합 : " + sum);
		*/
		
		//예제2) 반복문을 이용
		
		/*
		//방법1) 2부터 10까지 곱한것 (My)
		
		//정수형 5개까지 저장
		int [] arr1 = new int[5];
		arr1[0] = 2; 
		//기준값(시작값) 지정 후 for문이용
		int sum1 = 0;
		for(sum1 = 0 ; sum1<=5 ; sum1++) {
			arr1[0] = 2;
			System.out.println(" sum1의 값 : " + sum1*arr1[0]);
		}
		*/
		
		//예제1)
		//방법2) 반복문 for를 이용해 배열 만들때 거꾸로 하는 방법
		// 
		int arr2[] = new int[5];
		int i,sum;
		//아래 for문은 향상되지 않은 for문
		for(i = 0; i < 5 ; i++ ) {
			arr2[i] = 2 * i + 2;	
		}
		//아래 for문은 향상된 for문
		for(i =0, sum=0; i<5; i++) {
			sum += arr2[i];
		}
	    System.out.println("2부터 10까지 합 : " + sum);
	}

}
