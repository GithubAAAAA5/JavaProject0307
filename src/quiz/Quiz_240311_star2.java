package quiz;

public class Quiz_240311_star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan = 5;
		
		//피라미드
		
		for (int i = 0; i < dan; i++) {
				// space 출력
			for (int j = 0; j < dan -i -1; j++) {
				System.out.print(" ");
			}
				// 별 찍기
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
//		System.out.println();
		
		// 역삼각형
		for (int o = 0; o < dan; o++) {
			// space 출력
			for (int p = 0; p < o; p++) {
				System.out.print(" ");
		}
			// 별 찍기
			for (int p = 0; p < 2*dan - (2*o) - 1; p++) {
				System.out.print("*");
		}
			System.out.println();
			
		}	
		

	}

}
