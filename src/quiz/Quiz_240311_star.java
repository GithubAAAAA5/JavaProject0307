package quiz;

public class Quiz_star1_240311am {

	public static void main(String[] args) {
		// for문을 이용하여 다음과 같이 별찍기를 하시오
		/*
		 		*		*****   *	*****
		 		**		****   **	 ****
		 		***		***	  ***	  ***
		 		****	**	 ****	   **
		 		*****	*	*****	    *		 
		 */
		
///		for (int i = 1; i <= 5; i++) {
///			System.out.println("*");
///			for (int a = 0; a < i; a++) {
///				System.out.print("*");
///			}
///		}
///
///		System.out.println();
///		System.out.println();
///		
///		for (int i = 5; i >= 0; i--) {
///			System.out.println("*");
///			for (int a = 0; a <= i; a++) {
///				System.out.print("*");
///			}
///		}
///		
///		for (int i = 5; i > 0; i--) {
///			System.out.println("\t*");
///			for (int a = 5; a <= i; a--) {
///				if (a < 0)
///					break;
///				System.out.print("\t*");
///			}
///		}
	
		
		//#1
///		*		
///		**		
///		***		
///		****	
///		*****	
		int dan = 5;
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < i +1; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		System.out.println();	
		
		//#2
		int dan2 = 5;
		for (int a = 0; a < dan2; a++) {
			for (int b = 0; b < dan2 -a; b++) {
				//for (int b = dan2; b > 0; b--) {
////			}
				System.out.print("*");
			}
			System.out.println();	
		}
		
		System.out.println();
		
		//#3
		int dan3 = 5;
		for (int c = 0; c < dan3; c++) {
			// space를 먼저 찍고 그 뒤에 별을 찍어주면 된다.
			for (int d = 0; d < dan3 - c - 1; d++) 
				System.out.print(" ");
			// 별찍기
			for (int d = 0; d < c + 1; d++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		
		System.out.println();
		
		// #4
		int dan4 = 5;
		for (int q = 0; q < dan4; q++) {
			// 여백 찍기
			for (int w = 0; w < q ; w++)
				System.out.print(" ");
			// 별 찍기
			for (int w = 0; w < dan4 - q; w++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println();
		

		
	}

}
