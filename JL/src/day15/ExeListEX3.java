package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeListEX3 {

	public static void main(String[] args) {
		/* 
		 * 예제1)
		 * 오늘의 할일을 5개 입력받아 출력하는 코드를 작성하세요
		 * 단, 리스트(List)를 이용
		 * 방법1. 오늘의 할일을 String으로 관리하는 방법
		 * 방법2. 오늘의 할일을 ToDo로 관리하는 방법
		 * */
		
		//방법1. 오늘의 할일을 String으로 관리하는 방법
		
		ArrayList<String> todoList1 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			System.out.print("오늘의 할일 : ");
			//String tmp = scan.nextLine(); //주석 2줄 활성화 하면 방법1. 
			//todoList1.add(tmp);			//String으로 관리하는 방법으로 활성화
			todoList1.add(scan.nextLine());
		}

		System.out.println(todoList1);
		scan.close();
	}
}









