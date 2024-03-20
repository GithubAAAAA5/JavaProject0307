package b;
import java.util.Scanner;

public class B06_whileExample {

	public static void main(String[] args) {
		// while문
		// for 문 보다 좀 더 자유도가 높은 반박문을 말한다
		// 왜? for문 (for(초기값;조건;증감값))과 달리 while문은 조건이 참인지 여부만 확인한다..  // 주어진 갯수 횟수가 명확하면 for문을 사용하고 그렇지않다면 while을 사용하면 된다.
		
		/*
		 * 	(형식)
		 * 	while (condition) {
		 * 		조건이 참일 떄에 실행할 명령문들
		 * 	}
		 * 
		 */
		
		//	증가값의 위치에 따라서 결과값의 차이가 존재할 수 있다.
///		int i = 0;	//시작값
		
///		while (i < 10) {	//조건
//			i ++;					// 1부터 10 까지 나온다
///			System.out.println(i);
///			i ++;					// 0부터 9 까지 나온다
///		}

		// while의 무한 루프
///		while (true) {
///			System.out.println(i += 10000);
///			if (i % 20000 ==0)
///				continue;
///			if (i < 0)		//	반복 종료 시점을 잡아준다.
///				break;		
///		}
		
		//	do - while 구문 : 거의 사용하지 않는다.
		// 반복할 때에 무조건 한번 이상 실행해야 하는 경우
		int c = 0;
		
		Scanner scan = new Scanner(System.in);
		
///		while((c = scan.nextInt()) != 0) {
///			System.out.println("c가 0이 아닙니다.");
///		}														// 입력값 0 이 나오기 전까지 문구가 반복되며 0 을 입력하면 스캐너가 종료된다.
		
		do {
			System.out.println("> ");
			c = scan.nextInt();
			System.out.println("c가 0 이어도 일단 한번은 실행한다");
		}while(c !=0);
		
		scan.close();
		
	}

}
