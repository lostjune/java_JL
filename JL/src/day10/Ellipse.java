package day10;

public class Ellipse {
	private int left;	//왼쪽위점의 x좌표
	private int top;	//왼쪽위점의 y좌표
	private int right;	//오른쪽아래점의 x좌표
	private int bottom; //오른쪽아래점의 y좌표
	
	public Ellipse(int left, int top, int right, int bottom) {
		
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	
	//타원 정보 출력
	public void print() {
		System.out.println("----타원----");
		System.out.println("좌상점 : " + left + "," + top);
		System.out.println("우하점 : " + right + "," + bottom);
		System.out.println("가로 : " + (right - left));
		System.out.println("세로 : " + (bottom - top));
	}
	
	public void move(int x, int y) {
		int width = right - left;
		int height = bottom - top;
		left = x;            top = y;
		right = x + width;   bottom = y+height;
	}
	public void resize(int width, int height) {
		right = left + width;     bottom = top + height;
	}
}
