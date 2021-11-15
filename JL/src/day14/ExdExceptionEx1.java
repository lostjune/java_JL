package day14;

public class ExdExceptionEx1 {

	public static void main(String[] args) {
		/*
		 * 예외1 : ArismeticException
		 * 1 / 0은 ArismeticException이 발생하는데
		 * 1.0/0은 예외가 발생하지 않음
		 */
		
		int num1 = 1, num2 = 0;
		//int res1 = num1 / num2;
		//System.out.println(num1 + " / " + num2 + " = " + res1);
		double res2 = (double)num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + res2);
		
		 /*
		  * 예외2 : ArrayIndexOutBoundException
		  * */
		int [] arr = new int [3];
		//arr[3] = 0;
		
		/* 
		 * 예외3 : NullPointExction
		 * 참조변수(객체)가 null인 상태로 멤버 변수인
		 */
	}

}
