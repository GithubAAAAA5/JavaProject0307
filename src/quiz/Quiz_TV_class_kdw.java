package quiz;

public class Quiz_TV_class_kdw {

	public static void main(String[] args) {
		// TV 테이트
		Tv tv1 = new Tv(); 		//tv객체가 만들어짐
		
		tv1.getTvInfo();
		tv1.channelUp();
		tv1.powerOnOff();
		tv1.getTvInfo();
		tv1.channelUp();
		tv1.getTvInfo();
		tv1.moveChannel(20);
		tv1.moveChannel(999);
		tv1.channelDown();
		tv1.prevChannel();
		tv1.channelDown();
		tv1.moveChannel(234);
		tv1.moveChannel(11);
		tv1.getTvInfo();
		tv1.powerOnOff();
		tv1.getTvInfo();
		
		
	}

}


class Tv {
	// tv 클래스 멤버 변수
	int channel;
	int prevChannel;
	int volume;
	
	boolean isPowerOn;
	
	// tv 클래스의 상수(final)
	
	static final int MAX_VOL = 100;
	static final int MIN_VOL = 0;
	static final int MAX_CH = 300;
	static final int MIN_CH = 1;
	
	// 기본 생성자  //디폴트
	public Tv() {
		channel = 7;
		volume = 20;
	}
	
	// TV 기능 전원온오프
	// 전원 : isPowerOn 값이 true면, false / false면 true
	void powerOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	// # 채널업다운(1씩 채널값 증감) 볼륨업다운  이전채널이동(이전 채널 정보를 기준으로 이동)
	//   채널입력, tv정보확인(전원 채널 볼륨 저장된이전채널)
	// # 정보 확인 제외 모두 전원이 있어야 구동가능하기 때문에 온오프와 관련
	void volumeUp() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져 있습니다.");
			return; // void에서 return을 만나면 함수 종료가 된다.
		}else if(volume == MAX_VOL) {	//볼륨 정보 확인	//볼륨이 최대이면 볼륨 업 동작X
			System.out.println("현재 볼륨이 최대 입니다.");
			return;
		}
		
		volume ++;
		System.out.println("현재 볼륨은 "+ volume +"입니다.");
	}
	
	void volumeDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져 있습니다.");
			return; // void에서 return을 만나면 함수 종료가 된다.
		}else if(volume == MIN_VOL) { //볼륨 정보 확인	//볼륨이 최소이면 볼륨 다운 동작X
			System.out.println("현재 볼륨은 0 입니다.");
			return;
		}
		
		volume --;
		System.out.println("현재 볼륨은 "+ volume +"입니다.");
	}
	
	void channelUp() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}			//채널은 300번 이후 올린경우 한계가 있는것이 아니라 1번으로 돌아가기때문에 else if 로 한계를 지정해주지않아도된다.
		
		//이전 채널 가기
		prevChannel = channel;
		
		if(channel == MAX_CH) {
			channel = MIN_CH;		//채널이 맥스(300)인경우 민(1)로 돌린다
		}else {
			channel ++;
		}
		
		System.out.println(channel + "CH");
	}
	
	void channelDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}
		
		prevChannel = channel;
		
		if(channel == MIN_CH) {
			channel = MAX_CH;		//채널이 민(1)인경우 맥스(300)로 돌린다
		}else {
			channel --;
		}
		
		System.out.println(channel + "CH");
	}
	
	boolean moveChannel(int ch) {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return false;
		}
		
		if(ch >= MIN_CH && ch <= MAX_CH) {		// 채널은 최소와 최대를 벗어날 수 없다.
			prevChannel = channel;
			channel = ch;
			System.out.println(ch + "CH");
			return true;
		}else {
			System.out.println("존재하지 않는 채널을 입력 했습니다.");
			return false;
		}
		
	}
	
	void prevChannel() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}else if(prevChannel == 0) {
			System.out.println("이전 채널이 존재하지 않습니다.");
			return;
		}
		
		int temp = channel;
		channel = prevChannel;
		prevChannel = temp;			//스위칭
		
		getTvInfo(); 	// TV의 현재 상태 정보 확인
	}
	
	void getTvInfo() {
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("저장된 이전 채널 : " + prevChannel);
	}

}


























