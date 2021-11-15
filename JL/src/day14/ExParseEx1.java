package day14;

public class ExParseEx1 {

	public static void main(String[] args) {
		/*
		 *  정수를 문자열로 만드세요
		 */
		int num = 10;
		String str = "" + num;
		System.out.println("정수 num : " + num);
		System.out.println("문자열 str : " + str);
		
		/*
		 *  문자열을 정수로 만드는 예제
		 */
		str = "1234";
		num = Integer.parseInt(str);
		System.out.println("정수 num : " + num);
		System.out.println("문자열 str : " + str);
		
		//문자열을 정수로 바꿀때 바꿀수 없는 문자열이 있을때
		//NumberFormatException 예외 발생
		//num = Integer.parseInt("123.45");
		num = Integer.parseInt("123a");
		System.out.println("예외 발생");
	}

}
