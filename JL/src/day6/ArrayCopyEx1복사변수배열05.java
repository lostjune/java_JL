package day6;

public class ArrayCopyEx1복사변수배열05 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * */
		//예제1)
		int num = 10;
		//정수형 변수 num2를 선언하고, num2에 num1에 값을 저장하세요
		//일반 변수는 =(대입연산자)를 이용하여 값을 복사한 후에 원본 값이 바뀌면 복사본 값이 안 바뀜
		//원본 : num1, 복사본 : num2
		int num2 = num;
		System.out.println("num1 : " + num + ", num2 : " + num2);
		num = 20;
		System.out.println("num1 : " + num + ", num2 : " + num2);
		/* 참조 변수는 =을 이용하여 복사를 하면, 값이 복사되는게 아니라 주소를 공유한다
		 * 값이 바뀌면 같이 바뀜*/
		int arr1[] = {1, 2, 3};
		/*위 배열 코드랑 같음 이렇게도 가능(근데 번거롭다 그래서 위 배열 코드방법을 쓰는 것)
		int arr1[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		*/
		int arr2[] = arr1;
		arr1[0] = 10;
		System.out.println("arr1 : ");
		for(int tmp : arr1) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.print("arr2 : ");
		for(int tmp : arr2) {
		}
		System.out.println();
	}

}
