package day6;

public class ArrayMultiDimensionEx1다차원배10 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열이란 배열을 이중 또는 동시에 여러개를 말하는 것을 의미 * 
		 * 
		 * 예제1)
		 * 한 학년의 성적을 관리하기 위한 이차원 배열을 선언 및 생성하세요
		 * 한 학년은 10반까지 있고, 한 반에 최대 30명까지 배치
		 * 성적은 정수 *
		 * */
		
		//예제1)
		//방법1)
		int [][] score = new int[10][30];
		//1반 30번의 성적에 80을 입력
		score[0][29] = 80;
		// 고등학교 모든 학년 학생의 성적을 관리하기 위한 배열 선언
		int [][][] highScore = new int[3][10][30];
		System.out.print("모든학년 성적 : " + highScore);
		
	}

}
