package b;
import java.util.Scanner;

public class B02_ifExample1 {

	public static void main(String[] args) {
		// 단순 if 구문
		
		// if (조건문) 명령문 or {다중 실행문}
		// if문은 조건식이 true 인 경우에 실행문을 동작시킵니다.
		Scanner scan = new Scanner(System.in);  // System.in 입력관련 System.out 출력관련 System.err 에러
		System.out.print("정수입력 >> ");
		int num = scan.nextInt();
		
		if (num >= 10) System.out.println("입력한 정수는 10보다 크거나 같습니다.");
		if (num < 0) {
			System.out.println("입력한 정수 "+num+"는 입니다.");
		}
		System.out.println("프로그램 종료!!!");
		
		scan.close();
		
//		-----------------------
		// 정수입력 >> -100
		//입력한 정수 -100는 입니다.
		//프로그램 종료!!!
//		-----------------------
		//정수입력 >> 11
		//입력한 정수는 10보다 크거나 같습니다.
		//프로그램 종료!!!
//		-----------------------
		//정수입력 >> 9
		//프로그램 종료!!!
//		-----------------------
		
	}

}
