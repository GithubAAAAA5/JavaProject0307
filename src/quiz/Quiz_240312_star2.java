package quiz;

import java.util.Scanner;

public class Quiz_240312_star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		
		int dan = scan.nextInt();
		
		int sp = dan/2;
		
		int st = 1;
		
		boolean flag = true;
		
		
		// 별그리기 (가운데 비우고 달러 채우기
		
					for (int i = 0; i < dan; i++) {
					
					//여백처리하는법
					for (int j = 0; j < sp; j++) {
						System.out.print(" ");
					}
					
					//별찍는법
					for (int j = 0; j < st; j++) {
						if(j == 0 || j == st -1)
							System.out.print("*");
						else {
							if (j%2 == 0) System.out.print("$");
							else System.out.print(" ");
						}
					}
					System.out.println();
					if(i == (dan/2)) flag = false;		//반전
					if(flag) {
						sp -= 1; st += 2;
					}else {
						sp += 1; st -= 2;
					}
					
				}
		
					scan.close();
					
	}

}
