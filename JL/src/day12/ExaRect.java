package day12;

public class ExaRect extends ExaShape {
	/* Test 클래스는 (ExaTestEx1) 두번째
	 * 클래스형태 : 자식 클래스
	 * extend가 상속, 뒤에 붙는 이름이 부모클래스나 조상클래스
	 * 예제1)
	 * 도형클래스(ExaShape)를 상속받아 사각형 클래스를 만드세요
	 * 사각형 클래스는 도형의 
	 * */
	
	//자식클래스 사각형 클래스 셋팅
	public ExaRect(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}
	//도형 그리기
	@Override
	public void print() {
		System.out.println("----사각형----");
		System.out.println("좌상점 : " + left + ","  + top);
		System.out.println("우하점 : " + right + "," + bottom);
		System.out.println("가로 : " + getWidth());
		System.out.println("세로 : " + getHeight());
	}
	//예제를 위한 코드 
	public void testR() {
		System.out.println("사각형");
	}
}
