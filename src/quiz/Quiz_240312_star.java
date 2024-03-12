package quiz;

import java.util.Scanner;

public class Quiz_240312_star {

	public static void main(String[] args) {
		// 	별그리기 ( 가운데 비우기 )
		Scanner scan = new Scanner(System.in);
		
		
		int dan = scan.nextInt();
		
		int sp = dan/2;
		
		int st = 1;
		
		boolean flag = true;
		
		
		for (int i = 0; i < dan; i++) {
			
			//여백처리하는법
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			
			//별찍는법
			for (int j = 0; j < st; j++) {
				if(j == 0 || j == st -1)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			if(i == (dan/2)) flag = false;		//반전
			if(flag) {
				sp -= 1; st += 2;
			}else {
				sp += 1; st -= 2;
			}
			
		}

		System.out.println();
		
		scan.close();
		
	}

}
