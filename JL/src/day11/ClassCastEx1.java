package day11;

public class ClassCastEx1 {

	public static void main(String[] args) {
		/* 일반적으로 =을 기준으로 왼쪽과 오른쪽은 같은 타입이어야 한다
		 * 같은 타입 : 같은 자료형 또는 같은 클래스
		 * 
		 * */
		
		int num = 2;
		P2 p1 = new P2();
		P2 p2 = p1;
		/*
		 * 상황에 따라서는 =을 기준으로 타입이 같지 않아도 
		 * 자동으로 변환이 되어 사용할 수 있다
		 * 
		 * */
		//num2는 double(실수), num는 int(정수)라 서로 다른 자료형이지만
		//int(정수)는 double(실수)로 자동형변환이 가능해서 
		//double(실수)로 변환하여 저장
		double num2 = num;
		//num와 num2가 다른 자료형이고, num2의 자료형인 double(실수)이 int(정수)로
		//자동형변환이 불가능하여 명시적 형변환을 통해 int(정수)로 일시적으로 변환
		num = (int)num2;
		//클래스와 일치하는 객체를 생성하여 저장
		C2 c = new C2();
		P2 p = new P2();
		//자식클래스를 부모 클래스의 객체를 자동 변환할 수 있다
		P2 parent1 = new C2();
		parent1.print();
		
		//C2를 이용하여 객체를 만들었지만 P2에는 
		//hello 메소드가 없기 때문에 호출할 수 없다
		
		//parent.hello();
		C2 child1 = new C2();
		P2 parent2 =  child1;
		parent2.print();
		
		//부모클래스의
		//
		/*
		C2 child3 = (C2)new P2(); //그냥 new P2()를 해주면 에러가 남 그래서 명시적 형변환(C2)를 붙여줘 입력 정상 작동
		P2 parent3 = new P2();
		C2 child4 = (C2)parent3; //그냥 new paren3()를 해주면 에러가 남 그래서 명시적 형변환(C2)를 붙여줘 입력 정상 작동
		child3.print();
		*/
		//조건부로 가능한 경우 : 자식 클래스로 객체를 만들어서 부모 클래스로
		//					형변환한 부모 객체인 경우 명시적으로 가능
		P2 parent5 = new C2();
		//부모 객체가 자식 객체만큼 만들어져 있어
		C2 child5 = (C2)parent5;
		child5.hello();
		
	}

}

class P2{
	void print() {
		System.out.println("부모입니다.");
	}
}
class C2 extends P2{
	void hello() {
		System.out.println("안녕하세요.");
	}
}










