package H;

public class H03_ThreadEx2_2 {

	public static void main(String[] args) {
		
		//sleep()
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("t1 : " + i);
					try {
						Thread.sleep(1000);	//1초
						if (Thread.interrupted()) { 	//interrupt 발생 여부 확인
							System.out.println(" 인터럽트가 발생했습니다. 반복문을 종료합니다.");
							break;				// 반복문 종료
						}
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
//						System.exit(0);		//예외가 발생해서 동작 -> 멈춤
					}
				}
				System.out.println("스레드 실행 종료");
			}
		});
		t1.start();
		
		// interrupt() 메서드			//interrupt 는 try catch 를 방지한다.. 이게무슨말일까
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		t1.interrupt();	// 스레드가 일시 정지 상태이면 예외 발생. sleep interrupted 출력

	}

}
