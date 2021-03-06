package day18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//게시글 Main 클래스
public class ExfBoardEx2 {

	public static void main(String[] args) {
		/* 게시글을 관리하는 프로그램을 만드세요.
		 * (10일차 예제 ClassBoardEx1,2두개 세트임 참고)
		 * 
		 * 배열x, 리스트O
		 * 기능
		 * 1. 게시글 등록
		 * 2. 게시글 확인(전체)
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 프로그램 종료
		 * 
		 * */	
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//게시글 리스트 생성
		List<ExfBoard> list = new ArrayList<ExfBoard>();
		String [] strMenu = {
				"1. 게시글 등록",
				"2. 게시글 확인",
				"3. 게시글 수정",
				"4. 게시글 삭제",
				"5. 게시글 종료"	
		};
		
		//프로그램 시작
		while(true) {
		//while은 무한루프 그리고 괄호 안 true(참)와 false(거짓)는 판별유무//	
			//메뉴 출력
			printMenu(strMenu);
			try {
					//메뉴 입력
					int ch = scan.nextInt(); //char 대신 int를 사용해도 됨
					bar();							 //단 int를 사용할 경우 
													//뒤에 있는 charAt는 그대로 유지
					
					//메뉴에 따른 기능 실행
					if(ch == 1) {			register(list, scan);	}
					else if(ch == 2) {		display(list);			}
					else if(ch == 3) {		modify(list, scan);		}
					else if(ch == 4) {		delete(list, scan);		}
					else if(ch == 5) {
							System.out.println("프로그램을 종료합니다.");
							bar();
							break;
						}else {
							System.out.println("잘못된 메뉴입니다.!!!");
							bar();
						}
					}catch(InputMismatchException e) {
						System.out.println("예외 발생!! 잘못 입력했습니다.");
						bar();
						scan.nextLine();
					}catch(Exception e) {
						e.printStackTrace();
					}
			}
			//프로그램 종료
		}

		public static void printMenu(String [] strMenu) {
			System.out.println("===========메뉴==========");
			for(String tmp : strMenu) {
				System.out.println(tmp);
			}
			bar();
			System.out.print("메뉴 선택 : ");
		}
		public static void bar() {
			System.out.println("========================");
		}
		public static void register(List<ExfBoard> list, Scanner scan) {
			System.out.println("===게시글 등록===");
			//게시글 정보 입력 : 제목, 내용, 작성자
			scan.nextLine();
			System.out.print("제목 : ");
			String title = scan.nextLine();
			System.out.print("내용 : ");
			String contents = scan.nextLine();
			System.out.print("작성자 : ");
			String writer = scan.nextLine();
			
			//입력한 정보를 이용하여 게시글 하나 생성
			ExfBoard board = new ExfBoard(title, contents, writer);
			
			//생성된 게시글을 리스트에 추가
			list.add(board);
			System.out.println("게시글이 등록되었습니다.");
			bar();
		}
		public static void display(List<ExfBoard> list) {
			for(ExfBoard tmp : list ) {
				bar();
				System.out.println(tmp);
				bar();
			}
		}
		public static void modify(List<ExfBoard>list, Scanner scan) {
			//수정할 게시글 정보를 입력
			System.out.println("게시글을 수정합니다.");
			System.out.print("번호 : ");
			int num = scan.nextInt();
			scan.nextLine();
			System.out.print("제목 : ");
			String title = scan.nextLine();
			System.out.print("내용 : ");
			String contents = scan.nextLine();
			
			//리스트에서 수정할 게시글 정보를 가져옴
			ExfBoard tmp = new ExfBoard();
			tmp.setNum(num);
			int index = list.indexOf(tmp);
			
			//수정할 게시글이 있으면 수정 후 안내문구 출력
			if(index >=0 ) {
				list.get(index).modify(title, contents);
				System.out.println("게시글 수정이 완료되었습니다.");
				bar();
			}
			//없으면 없다고 안내문구 출력
			else {
				 System.out.println("없는 게시글입니다.");
				 bar();
			}
		}
		public static void delete(List<ExfBoard>list, Scanner scan) {
			//게시글 번호를입력
			System.out.println("게시글을 삭제합니다.");
			System.out.print("번호 : ");
			int num = scan.nextInt();
			
			//리스트에 해당 게시글이 있는지 확인
			ExfBoard tmp = new ExfBoard();
			tmp.setNum(num);
			int index = list.indexOf(tmp);
			
			//리스트에 게시글이 있으면 삭제 후 삭제되었습니다라고 안내문구
			if(index >= 0) {
				list.remove(index);
				System.out.println("게시글이 삭제되었습니다.");
				bar();
			}
			//리스트에 게시글이 없으면 해당 게시글이 없습니다라고 안내문구
			else {
				System.out.println("없는 게시글 입니다.");
				bar();
			}
		}
	}





