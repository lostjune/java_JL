package day2;

public class AssignmentEx1할당연산자02 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		num1 = num2; //num2에 있는 20을 num1에 저장(덮어씁), num1은 20이 됨
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		num1 = 10;
		num2 = 20;
		
		num2 = num1 ; //num1에 있는 10을 num2에 저장(덮어씁), num2는 10이된
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		num1 = num1 + num2; //num1에 있는 10과 num2에 있는 10을 더해서 num1에 저장
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		//num1 + num2 = num1; //에러 발생, 대입 연산자 왼쪽에는 변수 1개만 와야 한다.(상수
		//num1 + 1 = num1; //에러 발생
	}

}
