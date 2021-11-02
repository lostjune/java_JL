package day5;

public class StarEx4중요반복문예제12 {

	public static void main(String[] args) {
		/*   
		 * 	다음과 같이 출력되도록 코드를 작성하세요.
		 * 
		 *  2n(n=1,2,3, ....) 
		 *  2n-1(n=1,2,3, ....)
		 *   
		 *  예제1)
		 *     *       i=1 공백4     *=1
		 *    ***      i=2 공백3     *=3
		 *   *****     i=3 공백2     *=5
		 *  *******    i=4 공백1     *=7
		 * *********   i=5 공백0     *=9
		 *                공백=5-i  *=??
		 *    
		 *  예제2)   
		 *      *      i=1 공백4     *=1  *=0
		 *    ** *     i=2 공백3     *=2  *=1
		 *   *** **    i=3 공백2     *=3  *=2
		 *  **** ***   i=4 공백1     *=4  *=3
		 * ***** ****  i=5 공백0     *=5  *=4
		 *                 공백5-i   *=1  *=??
		 * 
		 * */
		
		//01. for문 이용(예제1) (StarEx3의 예제 참고)
		int num = 5 , i, j;
		for(i= 1 ; i<=num ; i++) {
			for(j = 1 ; j <= num-i ; j++ ) {
				System.out.print("   ");
			}
			for(j = 1 ; j <= i ; j++ ) {
				System.out.print(" * ");
			}
			for(j = 1 ; j <= i-1 ; j++ ) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	    //02. while문 이용(예제2)
		i = 1 ;
		while(i <= num) {
			j=1;
			while(j <= num-i) {
				System.out.print("   ");
				j++;
			}
			j = 1;
			while(j <= 2*i-1) {
				System.out.print(" * ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
