package H;

public class H03_ThreadEx2 {
	
	
	/*
	 *  [스레드 상태 제어]**
	 *   스레드 작업시 프로그램 중지 및 버그가 발생할 수 있는 부분 
	 *    - sleep() 		: 스레드를 원하는 시간만큼 멈추고 싶을 때 사용한다.
	 *    					InterruptedException 처리를 강제하기 때문에 try 구문을 사용한다..
	 *    - interrupt() 	: 스레드가 일시 정지 상태에 있을 때에 InterruptedException 예외를 발생시킨다.
	 *    					run() 메서드가 정상종료 시킬 수 있게 한다.
	 *    - join() 			: 다른 스레드의 실행이 완료될때까지 기다리는 메서드.
	 *    - yield() 		: 다른 스레드에게 실행 순서를 양보하는 메서드
	 *    
	 */

	
	
	public static void main(String[] args) {
		
		
		
		//sleep()
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 1;
				while(true) {
					//interrupt  확인
					System.out.println("t1 : " + i);
					i++;
					if (Thread.interrupted()) {		//interrupt 발생 여부 확인
						System.out.println(" 인터럽트가 발생했습니다. 반복문을 종료하겠습니다.");
						break; 	// 반복문 종료
					}
					
					// sleep  확인
//					try {
//						Thread.sleep(1000);	//1초
//					} catch (InterruptedException e) {
//						System.out.println(e.getMessage());
//						System.exit(0);
//					}
				}
				
				System.out.println("스레드 실행 종료");
			}
		});
		
		
		
		t1.start();
		
		// interrupt() 메서드			//interrupt 는 try catch 를 방지한다.. 이게무슨말일까
		try {
			
			Thread.sleep(1000);		// 메인에 sleep 동작
			
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		t1.interrupt();	// 스레드가 일시 정지 상태이면 예외 발생. sleep interrupted 출력

		
		
//		// join() 메서드
//		Sum t2 = new Sum();
//		Sum t3 = new Sum();
//		
//		t2.start();
//		t3.start();
//		
//		try {
//			t2.join();	// t2 스레드가 종료될때까지 대기한다.
//			t3.join();	// t3 스레드가 종료될떄까지 대기한다.
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(" 두 스레드의 Sum의 합계 : " + (t2.sum + t3.sum));
		
		
		
		// yield() : 다른 스레드에게 실행을 양보한다.
		YieldThread t4 = new YieldThread();
		YieldThread t5 = new YieldThread();
		
		t4.start();
		t5.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
		}
		t4.isContinue = false;		// t4 스레드 yield 가 동작한다. 즉, 양보한다.
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		t4.isContinue = true;		// t4 가 true 로 다시 실행된다.
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		// 스레드 종료
		t4.isBreak = true;
		t5.isBreak = true;
	}

}



class Sum extends Thread {
	int sum = 0;
	@Override
	public void run() {
		for (int i =1; i <= 100 ; i++) {
			sum += i;
		}
	}
}



class YieldThread extends Thread {
	boolean isBreak = false;
	boolean isContinue = true;
	
	@Override
	public void run() {
		while (!isBreak) {
			if(isContinue) {
				System.out.println(getName() + " 실행 중");
			}else {
				System.out.println("yield 실행");
				Thread.yield();			// 자원 양보 .-> 효율적인 자원 사용을 위해서 사용한다.
			}
		}
		System.out.println(getName() + " 종료");
	}
}