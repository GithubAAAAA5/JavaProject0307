package a1_practice;

public class pp16 {

	public static void main(String[] args) {
//		//    변수의 초기화
//		//				조건식
//		//						증감식
//		int sum = 0;
//		for ( int i = 0; i <= 100 ; i++) {
//			
//			//      실   행   문
//			System.out.println("i = " + i);
//			sum += i;
//		}	
//		
//		System.out.println(sum);
////  i는 0 부터 증가 0 1 2 3 4 5 6 7 8 9 
//		// 10 이 되는 순간 i < 10 의 조건을 만족하지않아 for문이 종료된다.
		
//		int sum = 0;
//		int i = 1;
//		
//		while (i <= 100) {
//			sum += i;
//			i++;
//		}
//		System.out.println("합계 : " + sum);
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("합계 : " + sum);
		
		
		int a = 10;
		do {
			System.out.println("a = " + a);
		} while (a < 10);
	}
	
	

}
