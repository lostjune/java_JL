package day5;

public class StarEx2중요반복문예제10 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 반복문을 이용하여 코드를 작성하세요
		 * *      i=1 *=1 엔터
		 * **     i=1 *=2 엔터
		 * ***    i=1 *=3 엔터
		 * ****   i=1 *=4 엔터
		 * *****  i=1 *=5 엔터
		 *            *=  
		 * i = 1 j = *
		 * 반복횟수 : i는 1부터 5까지 1씩증가
		 * 규칙성  : *을 i개 출력하고 엔터를 출력
		 *         반복횟수 : j를 
		 * */
		
		//01. for문 이용 (*을 4개 출력)
		int i , j;
		/*
		for(i=1 ; i<=4 ; i++) {
				System.out.println(" * ");
			  }
	    */
		
	    //02. while문 이용
		
		i=1;
		while(i<=5) {
			j=1;
			while(j>=i) {
				System.out.println(" * ");
				i++;
		
			}
		
	     }	
	}
}
