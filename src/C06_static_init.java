
class InstanceInit {
	
//	public final int DATA;			// The blank final field DATA may not hbe been initalized
//	public final int DATA = 0;		// 값을 지정해주게 되면 경고가 사라진다.
	
	public final int DATA;
	
	//	Instance Initializer
	//	- 생성자가 호출되기 전에 호출된다.
	//	- 인스턴스 변수 초기화에 사용한다.
	//	- 생성자를 이용하여 인스턴스 변수 초기화가 가능하기 때문에 사용할 기회는 많지 않다.
	

	{
		DATA = 10;						// 초기화자.
		System.out.println("InstanceInit 실행 !!!");
	}
	
	
}	
//	===========================================================================================
	
/*
 * 	# static
 * 	 - 변수, 메서드, static{}, 클래스에서 사용가능하다.
 * 	 - static 제한자는 지정된 변수와 메서드를 인스턴스와 무관하게 만들어 주기 때문에 this를 가질 수 없다.
 * 	 - static 메서드는 non-static 메서드로 재정의 될 수 없다.
 * 	 - 변수
 * 		> 정적변수, 여러개의 인스턴스가 모두 동일한 장소를 참조한다.
 * 		> final과 같이 사용되어 상수가 된다.
 * 		> 객체 생성 없이 참조 가능
 * 	 - 메서드
 * 		> 객체 생성 없이 참조 가능(자주 사용하는 메서드들)
 * 		> Math 클래스의 메서드가 대표적인 예시이다.
 * 		> static 블럭에는 non-static 멤버를 직접 참조할수 없다.
 * 		> 객체를 생성해 사용 가능
 * 	 - 클래스
 * 		> 내부 클래스(클래스 안에 클래스)인 경우 사용.
 * 	 - static {} - static initializer
 * 		> 형식은 static {} 형태
 * 		> 클래스가 로딩 될 때 딱 한번만 호출, 생성자 호출되기 전에
 */
	
// static 초기화자 클래스
class StaticInit {
	
	static {	// 생성자가 실행되기 전에 static 변수 초기화. 객체 여러번 생성해도 한번만..!
		System.out.println("static initializer가 수행됨");
	}
	
	public StaticInit() {
		System.out.println("Constructor 호출됨");
	}
}
	
	
	
	
	
	



public class C06_static_init {

	public static void main(String[] args) {
		// Test Check
		StaticInit s1 = new StaticInit();
		System.out.println(s1);
		StaticInit s2 = new StaticInit();
		System.out.println(s2);
		
		System.out.println("main() 종료!!");
		
		InstanceInit i1 = new InstanceInit();
		System.out.println(i1.DATA);
		InstanceInit i2 = new InstanceInit();
		System.out.println(i2.DATA);
		System.out.println("main()  두번째 종료!!");

	}

}
 




















