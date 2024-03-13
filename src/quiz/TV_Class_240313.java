package quiz;

public class TV_Class_240313 {

	public static void main(String[] args) {

		TvCheck tv1 = new TvCheck();
		
		tv1.getTvInfo();
		tv1.powerOnOff();
		tv1.getTvInfo();
		tv1.channelUp();
		tv1.getTvInfo();
		tv1.moveChannel(86);
		tv1.getTvInfo();
		tv1.volumeMute();
		tv1.volumeUp();
		tv1.getTvInfo();
		
		
	}

}


class TvCheck {
	
	// 변화될수 있는 값들을 정리
	
	int channel;
	int prevChannel;
	int volume;
	
	boolean isPowerOn;		//boolean은 true, false 두가지중 하나의 값을 가지기 때문에 on off 를 대입시킬수 있다.
	
// 채널 클래스의 기본 생성시 채널과 볼륨은 채널7과 볼륨20 이다.
// 최대 볼륨 100, 최소 볼륨 0, 채널의 최대 300, 채널의 최소 1, 
// 이전 채널이 동작시 저장되어 있던 이전 채널로 이동
// 채널 이동은 채널 정보를 입력 받아서 채널 이동을 하는것, 전원이 off일때는 동작하지 않는다
// 속성(멤버변수) : 채널, 볼륨, 전원, 이전채널
// 기능 : 전원on/off, 볼륨업/다운, 채널업/다운. 이전 채널이동, 
// 채널이동(번호입력), TV현재 상태 정보확인(전원, 채널, 볼륨, 저장된 이전채널).

	static final int MAX_VOL = 10;
	static final int MIN_VOL = 0;
	static final int MAX_CH = 999;
	static final int MIN_CH = 1;
	
	// 기본 생성자 - 디폴트값
	public TvCheck() {
		channel = 1;
		volume = 30;
	}
	
	void powerOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(!isPowerOn) {
			System.out.println("전원을 켜고 실행해주세요");
			return;
		}else if(volume == MAX_VOL) {
			System.out.println("최대 볼륨입니다.");
			return;
		}
		
		volume ++;
		System.out.println(volume);
	}
	
	void volumeDown() {
		if(!isPowerOn) {
			System.out.println("전원을 켜고 실행");
			return;
		}else if(volume == MIN_VOL) {
			System.out.println("최소 볼륨입니다.");
			return;
		}
		
		volume --;
		System.out.println(volume);
	}

	void volumeMute() {
		if(!isPowerOn) {
			System.out.println("전원을 켜고 실행");
			return;
		}
		volume = 0;
		System.out.println("음소거");
	}
	
	void channelUp() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		
		prevChannel = channel;
		
		if(channel == MAX_CH) {
			channel = MIN_CH;
		}else
			channel ++;
		System.out.println(channel + "CH");
	}
	
	void channelDown()	{
		if(!isPowerOn)	{
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		prevChannel =channel;
		
		if(channel == MIN_CH) {
			channel = MAX_CH;
		}else {
			channel --;
		}
		
		System.out.println(channel+ "CH");
	}
	
	boolean moveChannel(int ch)	{
		if(!isPowerOn)	{
			System.out.println("전원이 꺼져있습니다.");
			return false;
		}
		if(ch >= MIN_CH && ch <= MAX_CH) {
			prevChannel = channel;
			channel =ch;
			System.out.println(ch + "CH");
			return true;
		}else {
			System.out.println("잘못된 채널입력 입니다.");
			return false;
		}
	}
	
	void prevChannel() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있다.");
			return;
		}else if(prevChannel == 0) {
			System.out.println("이전 채널이 존재하지 않다.");
			return;
		}
		
		int temp = channel;
		channel = prevChannel;
		prevChannel = temp;
		
		getTvInfo();
	}
	
	void getTvInfo() {
		System.out.println("전원 : " + isPowerOn);
		System.out.println("현재 채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("이전 채널 : " + prevChannel);
	}
	
}




















