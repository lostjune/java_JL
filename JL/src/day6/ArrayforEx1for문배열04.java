package day6;

public class ArrayforEx1for문배열04 {

	public static void main(String[] args) {
		/*
		 * 중요 아래 자료는 공부하면 좋고 코드 줄여쓸때 용도가 있어 좋음
		 * */
		int arr2[] = new int[5];
		int i, sum;
		//아래 for문은 향상되지 않은 for문
		for(i = 0; i < 5 ; i++ ) {
			arr2[i] = 2 * i + 2;	
		}
		sum =0;
		//아래 for문은 향상된 for문
		//tmp는 아래 반복문 에서만 사용가능
		for(int tmp : arr2) {
			sum += tmp;
		}
	    System.out.println("2부터 10까지 합 : " + sum);
	    
	}

}
