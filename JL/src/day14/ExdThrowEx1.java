package day14;

import java.io.FileNotFoundException;

public class ExdThrowEx1 {

	public static void main(String[] args) {
		
		//Exception은 RuntimeException의 자손 클래스가 아니기 때문에
		//예외를 발생시키면 반드시 예외처리를 해야함
		//throw new Exception("예외 발생")
		//throw new RuntimeException("런타임 예외 발생");
		//
		//try catch와 thorow 뜻//
		//try catch:  내가 직접 예외(빨간줄) 처리하는 작업 
		//thorow : 나 대신 예외 처리요청을 해 
		//         상황별 예외(빨간줄)처리를 자동으로 처리
		//try catch, thorow 사용법
		//완성된 try catch안 thorowException2(); 말고 바깥 거
		//빨간줄 생기면 마우스 가져대고 선택 클릭// 
		//try catch 선택시 
		//그럼 아래 처럼 try catch안으로 
		//thorowException2(); 가 들어가면서 완성됨 
		
		
		thorowException();
		//thorowException2();
		try {
			//thorowException2();
			thorowException3(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void thorowException() {
		throw new RuntimeException();
	}
	public static void thorowException2() throws Exception {
		throw new Exception();
	}
	public static void thorowException3(int num) 
			throws FileNotFoundException, Exception{
		if(num == 0) {
			throw new Exception("num가 0");
		}
		if(num < 0) {
			throw new FileNotFoundException("num는 음수");
		}
		if(num > 0) {
			throw new ArithmeticException("num는 양수");
		}
	}
}
