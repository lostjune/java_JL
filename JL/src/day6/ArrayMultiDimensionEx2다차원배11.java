package day6;

public class ArrayMultiDimensionEx2다차원배11 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열이란 배열을 이중 또는 동시에 여러개를 말하는 것을 의미 * 
		 * 
		 * 예제1)
		 * 구구단 2단에서 9단 전체를 배열에 저장하여 출력하는 코드를 작성하세요
		 * 
		 * 0번지를 사용 안하기 위해. 사용안하는 이유=> 편하게 보기위해 *
		 * */
		
		//예제1)
		//방법1)
		int [][] multipleTable = new int[10][10];
		for(int i = 2; i<= 9; i++) {
			for(int j = 1; j<=9; j++) {
				multipleTable[i][j] = i*j;
				System.out.println(i + " X " + j + " = " + multipleTable[i][j]);
			}
		}
	}

}