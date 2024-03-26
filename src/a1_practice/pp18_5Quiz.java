package a1_practice;

public class pp18_5Quiz {
	
	// 제5장 연습문제
	
	public static void main(String[] args) {
		//1번
//		int  sum = 0;
//		int sum2 = 0;
//		for (int i=0; i <= 100; i++) {
//			if (i % 5 == 0) {
//				sum += i;
//			
//			}
//		}
//		
//		for (int j = 5; j <= 100; j+=5) {
//			sum2 += j;
//		}
//
//		System.out.println("5의 배수의 합계는 : " + sum);
//		System.out.println("5의 배수의 합계는 : " + sum2);
		
		//2번
//		int evenSum = 0;
//		int oddSum = 0;
//		
//		for (int i =1; i <= 100 ; i++) {
//			if (i % 2 == 0 ) {
//				evenSum += i;
//			}
//		}
//		System.out.println("짝수의 합계는 " + evenSum);
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				oddSum += i;
//			}
//		}
//		System.out.println("홀수의 합계는 " + oddSum);
		
		//3번
//		for (int x =1; x <= 6; x++) {
//			for (int y = 1; y <= 6; y++) {
//				if (x + y == 6) {
//					System.out.println("( " + x + ","+ y + " )");
//				}
//			}
//		}
		
		//4번
//		for (int i = 1; i <= 5; i++) {
//			
//			for (int j = 1; j <= i; j++) {
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println("");
//		}
//		
//		System.out.println();
//		
//		// 5번
//		for (int a = 0; a < 5 ; a++) {
//			
//			for (int b = 5; b > a; b--) {
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println("");
//		}	
//
//		System.out.println();
		
		// 6번
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for (int z = 1; z <= i*2 -1; z++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		// 7번
		int count = 0;
		while (true) {
			int  dice = (int)(Math.random()*6)+1;
			
			System.out.println("(" + dice + ")");
			count++;
			if (dice == 6) {
				break;
			}
		}
		System.out.println(count);
	}
}
