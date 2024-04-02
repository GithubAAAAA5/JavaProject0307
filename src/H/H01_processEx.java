package H;

public class H01_processEx {

	/*
	 * 	# 스레드 thread (동시에 여러 프로그램을 실행)
	 *	 프로세스 	- 실행중인 프로그램을 의미
	 *	 스레드 	- 프로세스 안에서 작업을 수행하는 것
	 *	 프로세스에는 반드시 하나 이상의 스레드가 존재한다.
	 *
	 *	* 멀티스레드의 장점
	 *	 - CPU, 메모리를 효율적으로 사용할 수 있다.
	 *	 - 사용자에 대한 응답성이 높아진다.
	 *	 - 작업을 스레드 단위로 분리해서 실행시간을 줄여 줄 수 있다.
	 *
	 *	* 단점
	 *	 - 동기화 공유 자원의 문제 ( 교착 상태 - deadlock )
	 *	 - 
	 *
	 */
	public static void main(String[] args) {
		// 프로세스 실행 (프로그램실행)
		try {
			// 메모장 실행
			Process p1 = Runtime.getRuntime().exec("notepad.exe");
			// 그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			p1.waitFor();	//	p1 프로세스가 종료될때까지 대기
			p2.destroy();	//	p1 프로세스가 종료되면 실행한다. destroy 종료를 실행한다. 
					// 메모장과 그림판이 실행되고, 메모장을 종료시키면 그림판도 같이 종료된다.
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}

	}

}
