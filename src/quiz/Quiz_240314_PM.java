package quiz;

import java.util.Scanner;

class Airplane {
	
	//변수
	private String name;
	
	//생성자
	public Airplane(String name) {
		this.name = name;
	}
	
	//메서드
	public void takeoff() {
		System.out.println(name + " 이륙합니다.");
	}
	public void fly() {
		System.out.println(name + " 비행합니다.");
	}
	public void land() {
		System.out.println(name + " 착륙합니다.");
	}
}

class SuperSonicAp extends Airplane {
	/*
	 *  Airplane은 멤버 변수로 name을 가지고 있습니다. 
	 *  
	 *  생성자로 이름을 입력받아 초기화 받게 설정하고, 
	 *  
	 *  메서드는 takeOff(), fly(), land() 3가지를 가지고 있습니다.
	 * 
	 *  1. Airplane을 생성 상속 받습니다. 생성자는 이름을 받아서 초기화
	 *  2. flyMode는 int형 변수로 선언합니다.
	 *  3. fly() 메서드를 오버라이딩 합니다.
	 *     fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다." 출력
	 *     	flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */
	
	private int flyMode;
	
	public SuperSonicAp(String name) {
		super(name);
	}
	public void setFlymode(int flyMode) {
		this.flyMode = flyMode;
	}
	
	@Override
	public void fly() {
		if (flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		} else {
		super.fly();
		}
	}
}
	


public class Quiz_240314_PM {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("모드를 선택 하세요 (0 : 일반 모드 , 1 : 고속 모드): ");
		
		Airplane airplane = new Airplane("일반");
//		airplane.setFlymode(0);
		airplane.takeoff();
		airplane.fly();
		airplane.land();
		
		
		
		int flyMode = scan.nextInt();
		
		SuperSonicAp superSonicAp = new SuperSonicAp("고속");
		superSonicAp.setFlymode(1);
		superSonicAp.takeoff();
		superSonicAp.fly();
		superSonicAp.land();
		
		scan.close();
	}

}


