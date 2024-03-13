
public class Monitor {

	public static void main(String[] args) {
		// 모니터를 테스트하기 위한 메인 메서드

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

	// 멤버 변수 - 속성
	
	public int resolution;
	public int size;
	public int bright;
	boolean status;
	
	// 생성자 constructors
	
	public MonitorCheck() {
		this.resolution = MAX;
		this.size = MAX;
		this.bright = MAX;
		this.status = false;
	}
	
	//전원 메서드
	
	public void pressPowerButton() {
		status = !status;
	}

	
	
}