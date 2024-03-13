
public class Monitor {

	public static void main(String[] args) {
		// 모니터를 테스트하기 위한 메인 메서드

		MonitorCheck mCheck = new MonitorCheck();
		
		mCheck.getMonitorInfo();
		mCheck.isOnOff();
		mCheck.moveBright(111);
		mCheck.moveBright(42);
		mCheck.getMonitorInfo();
		mCheck.moveSize(23);
		System.out.println();
		mCheck.moveResolution(35);
		System.out.println();
		mCheck.getMonitorInfo();
	}

	
}


class MonitorCheck {
	/*
	 * 	클래스명 : 모니터체크
	 * 	속성 : 해상도 크기 밝기 상태(on/off)
	 * 	기능 : ( 해상도 크기 밝기 )값은 100. 상태는 off
	 * 	생성자 : 
	 * 	모니터에는 버튼을 누르는 메서드, 즉 전원 on/off 기능이 존재한다.
	 * 	해당 메서드 실행시 전원이 켜져 있다면 꺼지고, 꺼져 있다면 켜져야 한다.
	 */
	
	// 해상도 크기 밝기의 고정값
	
	static final int MAX = 100;
	static final int MIN = 0;
	
	// 멤버 변수 - 속성
	
	public int resolution;
	public int size;
	public int bright;
	boolean status;
	
	// 생성자 constructors
	
	public MonitorCheck() {
		resolution = 60;
		size = 70;
		bright = 80;
	}
	
	// 전원 메서드
	
	void isOnOff() {
		status = !status;
	}
	
	
	void resolutionUp() {
		if(!status) {
			System.out.println("전원을 켠뒤 다시 입력해주세요.");
			return;
		}else if(resolution == MAX) {
			System.out.println("더는 올릴수 없습니다.");
			return;
		}
		resolution ++;
		System.out.println("현재 해상도는 " + resolution + "입니다.");
	}
	
	void resolutionDown() {
		if(!status) {
			System.out.println("전원을 켠뒤 다시 입력하시오");
			return;
		}else if(resolution == MIN) {
			System.out.println("더는 내릴수 없습니다.");
			return;
		}
		resolution --;
		System.out.println("현재 해상도는 " + resolution + "입니다.");
	}
	
	void sizeUP() {
		if(!status) {
			System.out.println("전원을 켠뒤 다시 입력해주세요.");
			return;
		}else if(size == MAX) {
			System.out.println("더는 올릴수 없습니다.");
			return;
		}
		size ++;
		System.out.println("현재 크기는 " + size + "입니다.");
	}
	
	void sizeDown() {
		if(!status) {
			System.out.println("전원을 켠뒤 다시 입력하시오");
			return;
		}else if(size == MIN) {
			System.out.println("더는 내릴수 없습니다.");
			return;
		}
		size --;
		System.out.println("현재 크기는 " + size + "입니다.");
	}
	
	void brightUp() {
		if(!status) {
			System.out.println("전원을 켠뒤 다시 입력해주세요.");
			return;
		}else if(bright == MAX) {
			System.out.println("더는 올릴수 없습니다.");
			return;
		}
		bright ++;
		System.out.println("현재 밝기는 " + bright + "입니다.");
	}
	
	void brightDown() {
		if(!status) {
			System.out.println("전원을 켠뒤 다시 입력하시오");
			return;
		}else if(bright == MIN) {
			System.out.println("더는 내릴수 없습니다.");
			return;
		}
		bright --;
		System.out.println("현재 밝기는 " + bright + "입니다.");
	}
	
	void getMonitorInfo() {
		System.out.println("해상도 : " + resolution);
		System.out.println("크기 : " + size);
		System.out.println("밝기 : " + bright);
	}
	
	boolean moveBright(int br) {
		if(!status) {
			System.out.println("전원을 켜주세요");
			return false;
		}
		
		if(br >= MIN && br <= MAX) {
			bright = br;
			System.out.println("밝기 : " + br);
			return true;
		}else {
			System.out.println("잘못된 입력입니다.");
			return false;
		}
	}
	
	boolean moveSize(int si) {
		if(!status) {
			System.out.println("전원을 켜주세요");
			return false;
		}
		
		if(si >= MIN && si <= MAX) {
			size = si;
			System.out.println("크기 : " + si);
			return true;
		}else {
			System.out.println("잘못된 입력입니다.");
			return false;
		}
	}
	
	boolean moveResolution(int re) {
		if(!status) {
			System.out.println("전원을 켜주세요");
			return false;
		}
		
		if(re >= MIN && re <= MAX) {
			resolution = re;
			System.out.println("해상도 : " + re);
			return true;
		}else {
			System.out.println("잘못된 입력입니다.");
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}