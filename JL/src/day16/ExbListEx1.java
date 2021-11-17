package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExbListEx1 {

	public static void main(String[] args) {
		/* 
		 * 예제1)
		 * 그린고등학생의 국어, 영어, 수학 성적을 관리하려한다.
		 * 관리하기 위한 리스트를 만들어 보세요.
		 * 
		/* 방법1)
		 * 국어, 영어, 수학 성적을 각각 리스트로 만들어서 하는 관리방법
		 * 번지가 같으면 같은 학생의 성적이라는 가정이필요
		 * 가능은하지만 비효율적이고 좋은방법은 아니다 
		 * */
		
		//예제1) 방법1
		ArrayList<Integer> korlist = new ArrayList<Integer>();
		ArrayList<Integer> englist = new ArrayList<Integer>();
		ArrayList<Integer> mathlist = new ArrayList<Integer>();
		
		//방법3
		/* 국어 영어 수학 성적을 다룰 수 있는 
		 * 클래스를 만들어서 활용하는 방법.
		 * 어떤 클래스를 만들 것인가?
		 * */
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		Scanner scan = new Scanner(System.in);
		
		/* 학생 정보를 입력받고, 계속할건지를 물어봐서 
		 * y라고 대답하면 계속하고 아니면 종료
		 * */
		
		char next = 'y';
		while(next == 'y' || next == 'y') {
			//방법1 : 첫번째 inputStudent 메소드 이용
			//ExbStudent std = inputStudent(scan);
			//stdList.add(std);
			//방법2 : 두번째 inputStudent 메소드 이용
			inputStudent(scan, stdList);
			
			System.out.print("학생 정보를 더 입력하겠습니까? ");
			next = scan.next().charAt(0);
		}
		
		/* 입력받은 학생 정보를 출력 : iterator를 이용 */
		printStudentList(stdList);
		
		scan.close();
	}
	
	/* 기능 : Scanner를 이용하여 학생 정보와 성적을 입력 받아 입력받은 학생 정보를 알려주는
	 *       메소드
	 * 매개변수 : Scanner => Scanner scan
	 * 리턴타입 : 입력받은 학생 정보 => ExbStudent
	 * 메소드명 : inputStudent
	 * */
	public static ExbStudent inputStudent(Scanner scan) {
		System.out.println("학생 정보를 입력하세요.");
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
	
		/* 아래 nextLine()을 이용하는 경우 앞에서 Scanner를 통해 
		 * 입력받은 값 중 엔터가 사라지지 않은 상황이면 실제 사용하려는
		 * nextLine()앞에 nextLine()을 한 번 더 입력해야한다.
		 * 
		 * */
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("성적을 입력하세요.");
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		ExbStudent std 
			= new ExbStudent(grade, classNum, num, name, kor, eng, math);
		return std;
	}
	
	
	//방법4
	//위의 코드를 이용하여 학생 정보를 입력하는 메소드와
	//학생 정보들을 출력하는 메소드를 만들어 보세요
	
	/* 기능 : Scanner를 이용하여 학생 정보와 성적을 입력 받아 입력받은 학생 정보를 
	 * 		 주어진 리스트에 넣어주는 메소드
	 * 매개변수 : Scanner, 주어진 리스트 => Scanner scan, ArrayList<ExbStudent> stdList
	 * 리턴타입 : 없음 => void
	 * 메소드명 : inputStudent
	 * */
	public static void inputStudent(Scanner scan, ArrayList<ExbStudent> stdList) {
		ExbStudent std = inputStudent(scan);
		stdList.add(std);
	}
	/* 기능 : 학생 리스트가 주어지면 주어진 학생 정보들을 출력하는 메소드 
	 * 매개변수 : 학생 리스트 => ArrayList<ExbStudent> stdList
	 * 리턴타입 : 없음 => void
	 * 메소드명 : printStudentList
	 * */
	public static void printStudentList(ArrayList<ExbStudent> stdList) {
		Iterator<ExbStudent> it = stdList.iterator();
		while(it.hasNext()) {
			//리스트에서 하나씩 꺼내서 tmp에 저장
			ExbStudent tmp = it.next();
			System.out.println(tmp);
		}
	}
}


























