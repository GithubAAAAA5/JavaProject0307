


/*
 * 		Uage Modifier final
 * 		 의미 
 * 		- 일반적으로 final 은 그 값이 변하지 않음을 의미한다.
 * 		- 변수에 final 이 붙으면 그 값은 변경할 수 없다. 때문에 static하고 같이 사용시 상수로 사용한다.
 * 		- 메서드에 final이 붙으면 그 메서드는 재정의 할 수 없다. 재정의 될 필요가 없는 메서드일떄 사용한다.
 * 			개발자가 재정의를 허용하지 않기 위해 사용한다.
 * 		- 클래스에 final 이 붙으면 그 클래스는 자식 클래스를 가질 수 없다
 */

class MyDate {
	int year = 2024;
	int month = 3;
	int day = 15;
	
	public String toString() {
		return "[" + year + "-" + month + "-" + day + "]";
	}
	
	public void doIt(final int a) {
//		a++; 	// The final local variabe a cannot be assigned. it must be blank and not using a compound assignment
	}
}

final class Parent {
	public final void method() {
		System.out.println("Parent - method()");
	}
}


//class Child extends Parent {	// extends의 주체인 parent가 final 을 사용하여 자식인 child 가 상속을 할수없다.(final 하면 대상 클래스는 자식을 가질수 없다.)
//	
//	// 부모가  final 로 정의한 메소드는 Override 가 불가능하다.
////	public void method() {}	// Cannot override the final method from Parent
//		
//	
//	
//}

class FinalInit {
	final int a;		// 1번 방법
	
	// final int a = 10;  2번 방법 선언과 동시에 초기화
	
//	{
//		a = 10; 	//인스턴스 초기화자를 사용  1번방법
//	}
	
//	FinalInit () {		//3번 방법  생성자를 이용
//		a = 10;
//	}

	FinalInit(int a) {
		this.a = a; 		// 초기화자를 이용한 방식이 아니다.
	}
	
}


public class C07_finalExample {

	static final MyDate date = new MyDate();	
	
	public int data = 100;
	
	public static void main(String[] args) {

//		date = new MyDate();		// date 라는 변수로 새로운 객체 생성이 불가능하다.
		
		System.out.println(date.toString());
		date.year = 2025;
		System.out.println(date.toString());
		
		//Local 변수 사용
		new C07_finalExample().doIt("GillDong");
		
		System.out.println(new FinalInit(100).a);
		
	}

	public void doIt(final String name) {
		final int age = 38;			// 내부 클래스에 전달되어야 할 지역변수는 final을 꼭 붙여 사용해야 한다.
		class InnerLocal {			// 내부 클래스 중 하나.
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data : " + data);
				System.out.println("외부 클래스의 파라미터 변수 name : " + name);
				System.out.println("외부 클래스의 지역변수 age : " + age);
			}
		}
		new InnerLocal().innerDoIt();
	}
}


































