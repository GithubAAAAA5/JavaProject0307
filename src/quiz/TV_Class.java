package quiz;

import java.util.Scanner;

public class TV_Class {

	public static void main(String[] args) {
		
	}

}


class TvCheck {
	
// 채널 클래스의 기본 생성시 채널과 볼륨은 채널7과 볼륨20 이다.
// 최대 볼륨 100, 최소 볼륨 0, 채널의 최대 300, 채널의 최소 1, 
// 이전 채널이 동작시 저장되어 있던 이전 채널로 이동
// 채널 이동은 채널 정보를 입력 받아서 채널 이동을 하는것, 전원이 off일때는 동작하지 않는다
// 속성(멤버변수) : 채널, 볼륨, 전원, 이전채널
// 기능 : 전원on/off, 볼륨업/다운, 채널업/다운. 이전 채널이동, 
// 채널이동(번호입력), TV현재 상태 정보확인(전원, 채널, 볼륨, 저장된 이전채널).

	static final int MAX1 = 100;
	static final int MIN1 = 0;
	static final int MAX2 = 300;
	static final int MIN2 = 1;
	
	static int[] chList = new int[MAX2];
	static int[] volList = new int[MAX1];
	
	static int index = -1;
	
	static int count = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
///			System.out.printf("\n[INFO] 채널 : "+ch, 볼륨 : ");
		}
	}
	
	public int ch;
	public int vol;
	boolean status;
	
}