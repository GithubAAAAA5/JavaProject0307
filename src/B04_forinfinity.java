import java.util.Scanner;

public class B04_forinfinity {

	public static void main(String[] args) {
		// for 문의 무한 루프
///		for (int i = 0; true; i++) { //condition 부분이 항상 참이 되는 경우
///			System.out.println(i);
///		}
		
		
///		for (;;) {
///			System.out.println('a');
///		}
		// 이러한 무한 루프문은 항상 빠져나올 코드를 만들어 놓아야 한다.
		
		// break 문
		// 반복문을 사용할수있다.
		// 반복문에서 break를 만나면 반복문을 종료한다. - 탈출문
		// 다중 반복문 내부에 속해 있더라도 break 를 만나면 해당 break 가 속한 반복문은 하나는 탈출한다.
		
///		for(int i = 0; true; i++) {
///			System.out.println(i);
///			for (int j = 0; true ; j++) {
///				System.out.println("j반복");
///				if(j == 58) {
///					break;
///				}
///			}
///		}
		
		//무한반복 활용의 예
///		String answer = "자동차";
///		Scanner scan = new Scanner(System.in);
///		
///		for(;;) {
///			System.out.print("> ");
///			String attempt = scan.nextLine();
///			if(answer.equals(attempt)) {		//문자열 비교는 "=="를 사용하지 않는다. equals() 메서드 사용한다.
///				System.out.println("정답");
///				break;
///			}
///		}
		
		Scanner scan = new Scanner(System.in); 
		String answer = "자동차";
		String attempt = "";
		for (;!attempt.contentEquals(answer);) {
			System.out.println("> ");
			attempt = scan.nextLine();
		}
		System.out.println("정답");
		
		scan.close();
		
		
	}

	
}
