package day12;

public class ExaShape {
	//Test 클래스는 (ExaTestEx1) 첫번째
	//클래스형태 : 부모클래스
	//도형 클래스 : 그림판에서 그려지는 모든 도형을 대표할 수 있는 클래스
	//day10에 rect1, rect2, Ellipse 클래스를 참고
	/* 도형은 사각형안에 그릴 수 있고, 그 사각형은 왼쪽 위의 점과
	 * 오른쪽 아래 점으로 표현할 수 있다
	 * 도형은 위치를 이동시킬 수 있다.(크기는 변하지 않음)
	 * 도형은 크기를 변화시킬 수 있다(방향은 마음대로)
	 * 도형은 방향에 상관없이 그릴수 있다.
	 * */
	
	//왼쪽 위의점, 오른쪽 아래점
	protected int  left, top;       //왼쪽 위의점
	protected int  right, bottom;   //오른쪽 아래 점
	//도형은 위치를 이동시킬 수 있다.(왼쪽 위의 점)
	public ExaShape(int x1,int y1, int x2, int y2) {
		left = x1 < x2 ? x1 : x2;
		right = x1 < x2 ? x1 : x2;
		top = y1 < y2 ? y1 : y2;
		bottom = y1 < y2 ? y1 : y2;
		/*
		 if(x1 < x2){
	  		 left = x1;
	 		 right = x2;
		 }else {
			 left = x2;
			 right = x1;
		 }
		 if(y1 < y2) {
			 top = y1;
			 bottom = y2;
		 }else {
			 top = y2;
			 bottom = y1;
		 }
		 */
	}
	//도형의 너비를 계산하는기능
	public int getWidth() {
		return right - left;
	}
	//도형의 높이를 계산하는 기능
	public int getHeight() {
		return bottom - top;
	}
	//도형은 위치를 이동시킬 수 있다(왼쪽 위의 점)
	public void move(int left, int top) {
		this.right = left + getWidth();
		this.bottom = top + getHeight();
		this.left = left; 
		this.top = top;
		
	}
	//도형의 크기를 바꿀 수 있다(방향은 자유)
	/* direction : 1이면 우하, 2이면 좌하, 3이면 좌상, 4이면 우상방향 
	 * */
	public void rerize(int width, int height, int direction) {
		switch(direction){ 
		case 1: 
			right = left + width;
			bottom = top + height;
			break;
		case 2:
			left = right - width;
			bottom = top + height;
			break;
		case 3:
			left = right - width;
			top = bottom - height;
			break;
		case 4:
			right = left - width;
			top = bottom - height;
			break;
		}
	}
	//도형을 그리기
	public void print() {
		System.out.print("----도형----");
		System.out.println("좌상점 : " + left + ","  + top);
		System.out.println("우하점 : " + right + ","  + bottom);
	}
}











