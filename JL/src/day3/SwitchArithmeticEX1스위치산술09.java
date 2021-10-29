package day3;

public class SwitchArithmeticEX1스위치산술09 {

	public static void main(String[] args) {
		/* 월의 마지막 일을 출력하는 코드를 switch로 작성하세요
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * */
		int month = 4;
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : 
			System.out.println(month + "월은 31일까지");
			break;
		case 2 : 
			System.out.println(month + "월은 28일까지");
			break;
		case 4, 6, 9, 11 : 
			break;
		default:
			System.out.println(month + "월은 없는 달입니다.");
		}
	}

}
