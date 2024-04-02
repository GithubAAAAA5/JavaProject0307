package G;

public class G01_lambdaFunctionEx {

	// 람다식이란? (간결한 코드를 위해서 사용하는것)
	// 고전적인 방식인 객체지향적인 프로그램 방식이 아닌 함수적 프로그래밍을 위한 기법이다.
	// 람다는 익명함수를 위한 방식이다. 람다는 기존방식보다 자바코드를 간결하게 표현할 수 있다는 장점을 가지고 있다.
	// 다만, 처음에는 익숙하지 않아 혼란스러울 수 있다.
	
	// 람다식은 함수적 인터페이스를 자료형으로 사용한다.
	// 함수적 인터페이스란? 추상 메서드가 한개만 존재하는 인터페이스를 의미한다.
	
	// 람다식의 표현
	// (타입 매개 변수) -> {실행문 작성}
	// 매개변수가 없는 경우에는 () -> {} 식으로 표현이 된다.
	// 매개변수가 한개라면 ()를 생략하여 표현하는 것도 가능하다. 매개변수 -> {}
	
	// 람다식은 함수적 인터페이스를 사용하여 											//함수적 인터페이스란 추상메서드 딱 하나만 존재하는것.
	// (함수적)인터페이스 변수 = 람다식; 같은 구조로 처리된다.
	
	
	static int sum(int x, int y) { // 다른 메서드
		return x + y;
	}
	
	
	public static void main(String[] args) {
		
		// 첫번째 람다식
		InterfaceEx ie = (int x, int y) -> x + y;
		System.out.println(ie.sum(10, 20));

		// 함수적 인터페이스
		LambdaInterface li = () -> {
			String str = "메서드 출력";
			System.out.println(str);
		};
		li.print();
//		Runnable ru = () -> System.out.println("출력");
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
//		LambdaInterface3 li3 = (name) -> {
//			System.out.println("제 이름은 " + name + " 입니다.");
//		};
//		
		// String
//		LambdaInterface3 li3 = (String name) -> {
//			System.out.println("제 이름은 " + name + " 입니다.");
//		};
//		
		// () 생략 - 하나의 매개변수일 경우
//		LambdaInterface3 li3 = name -> {
//			System.out.println("제 이름은 " + name + " 입니다.");
//		};
		
		// {}는 하나의 실행문으로 처리될 때
		LambdaInterface3 li3 = (name) -> System.out.println("제 이름은 " + name + " 입니다.");
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		li3.print("홍길동");
		
		LambdaInterface4 li4 = (x, y) -> {
			return x*y;
		};
		System.out.println("두수의 곱" + li4.cal(3, 2));
		
		li4 = (x, y) -> x+y;		
		System.out.println("두수의 합" + li4.cal(3, 2));
		
		li4 = (x, y) -> {return x/y;};
		System.out.println("두수의 몫 : " + li4.cal(5 , 2));
		
		li4 = (x, y) -> x%y;
		System.out.println("두수의 나머지 : " + li4.cal(5, 2));
		
		li4 = (x, y) -> sum(x, y);					// {return(x, y)
		System.out.println("두수의 합 : " + li4.cal(10, 20));
		
		// 람다식에서 사용되는 this 
		// 람다식은 내부 클래스의 익명 객체로 인식하므로, 내부에 this 는 람다 객체 그 자신을 의미한다.
		// 즉, 내부 클래스와 같이 람다 표현식 내에서 지역변수 접근시 지역변수는 상수화 해야한다.
		
		Outer o = new Outer();
		o.method();
		
	}
	
}

@FunctionalInterface
interface LambdaInterface5 {
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		final int iv = 40;											// 지역변수 선언
		LambdaInterface5 f5 = () -> {								// 람다는 익명객체이다 함수적 인터페이스를 사용하는.
//			this.iv: int - Outer
			System.out.println("Outer.this.iv " + Outer.this.iv);	// 아우터 클래스에 있는 iv
			System.out.println("this.iv " + this.iv);				// this.iv => public iv outer로부터 iv값을 받음
			System.out.println("iv : " + iv);						// 상수값은 final 로받아야 값이 변화가 없다. 
		};
		f5.method();
	}
}

@FunctionalInterface
interface LambdaInterface4 {
	int cal(int x, int y);
	
}

@FunctionalInterface			// 함수적 인터페이스가 된다.
interface LambdaInterface3 {
	void print(String name);	// 매개변수는 있고, 반환타입은 없는 경우.
}



interface InterfaceEx {
	public int sum(int x, int y);
	
}
@FunctionalInterface			// 해당 인터페이스가 함수적 인터페이스임을 알린다.
interface LambdaInterface {
	void print();
//	void print2();	// 오류 발생 the target type of this expression bust be a functional interface
}


