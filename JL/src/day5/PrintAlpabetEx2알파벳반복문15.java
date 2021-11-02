package day5;

public class PrintAlpabetEx2알파벳반복문15 {

	public static void main(String[] args) {
		/*
		 * a
		 * ab
		 * abc
		 * abcd
		 * ...
		 * abcd...xyz
		 * 예제1) 가 출력되도록 코드를 작성하세요
		 * 방법1)
		 * 반복횟수 : ch는 a부터 z까지 1씩 증가
		 * 규칙성  : a부터 ch까지 출력
		 *         반복횟수 : ch2는 a부터 ch까지 1씩 증가
		 *         규칙성  : ch2를 출력
		 *         엔터 출력 
		 * */
				char ch, ch2;
				for(ch = 'a' ; ch <= 'z' ; ch++ ){
					for(ch2 = 'a' ; ch2 <= ch ; ch2++) {
				      System.out.print(ch2); }
				      System.out.println(); }
				}
}