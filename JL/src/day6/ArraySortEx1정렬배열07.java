package day6;

public class ArraySortEx1정렬배열07 {

	public static void main(String[] args) {
		//예제1)
		//다음과 같은 배열이 있을 때 정렬하는 코드를 작성하세요
		int num [] = {1, 10, 9, 3, 6, 2, 3, 4};
		/* 버블정렬 : 옆에 있는 값과 비교하여 정렬하는 방법
		 * 버블정렬 : 효율성이 가장 안좋고 많이 떨어진다(너무 느리고 판단 횟수가 끝났어도 반복적인게 많다)
		 * 정렬)
		 * 1) 1, 10, 9, 3, 6, 2, 3, 4
		 * 2) 1, 9, 3, 6, 2, 3, 4, 10
		 * 3) 1, 3, 6, 2, 3, 4, 9, 10
		 * 4) 1, 3, 2, 3, 4, 6, 9, 10
		 * 5) 1, 2, 3, 3, 4, 6, 9, 10
		 * 5) 사실상 정렬은 위에서 끝났음 근데 콘솔(CPU)는 반복적으로 더 작업한다
		 * 6) 1, 2, 3, 3, 4, 6, 9, 10
		 * 7) 1, 2, 3, 3, 4, 6, 9, 10
		 * 
		 * */
		//예제1)반복문 for문 이용해 정렬
		for(int i = 0 ; i < num.length-1 ; i++ ) {
			for(int j = 0; j < num.length-1 ; i++ ) {
				if(num[j] > num[j+1]) {
					//두 값을 바꿈
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		for(int tmp : num) {
			System.out.print(tmp + " ");
		}
	}

}
