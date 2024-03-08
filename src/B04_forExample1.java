
public class B04_forExample1 {

	public static void main(String[] args) {
		// 반복문(Loop) : for, while, do~while
		
		// for문 : 회차가 정해진 경우에 사용을 많이 한다.
		/*
		 * 	구문 : 
		 * 	 for (초기값; condition; 증가값) { 
		 * 		조건이 참인 경우에 반복할 문장들이 있음
		 * 	}
		 */

		//	기본
		//	초기값은 for문에 사용할 변수의 초기값을 의미한다.
///		for (int i = 0; i < 10; i++)  {// for문에서 사용할 i 값은 0 이다.    // i++  전치
///			System.out.println("i의 값 : "+i);
///		}
		
///		// 초기값과 증가값의 위치는 변경이 가능하다.(단, 보기 좋지는 않다)
///		int i = 0; //초기값
///		for (; i < 10 ;) {
///			//반복구문 내에서 증감값이 존재해야 한다.
///			System.out.println("i의 값 : "+i);
///			i++;
///		}
		
		
		//에제1) for문을 사용하여 1부터 10까지 숫자들의 합을 구하시오.
		int sum = 0;
		for (int z = 1;z <= 10;z++) {
			System.out.println(z);
			sum +=z;	// sum = sum + z;
		}
		System.out.println("합은 :"+ sum);
		
		
		//예제2) for 문을 사용하여 1부터 100까지 홀수들의 합을 구하시오.
		int odd = 0;
		for (int x = 1; x <= 100; x++) {
			if(x%2 == 0) {
				odd +=x;
			}
		}
		System.out.println("짝수의 합은 : "+ odd);
		
///		int eds = 0;
///		for (int y = 1; x <= 100; x++) {
///			if(y%2 == 1) {
///				eds +=y;
///			}
///		}
///		System.out.println("홀수의 합은 : "+ eds);
	}

}
