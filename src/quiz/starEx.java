
package quiz;

import java.util.Scanner;

public class starEx {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		//줄 수 입력 받는 부분
		System.out.println("줄 수를 입력해주세요 : ");
		int dan = scan.nextInt();

		for (int i = 0; i < dan; i++) {
			for(int j = 0; j < dan - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < dan - 1; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j< 2 * (dan - i - 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();
		
	}
	
}
