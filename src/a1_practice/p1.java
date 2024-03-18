package a1_practice;

public class p1 {
	

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 0;
		
		//AND연산
		System.out.println(a > b && a==10);		// 두가지의 값이 모두 맞기 때문에 true
		System.out.println(a > b && a==b);		// a==b의 값이 false 둘중 한가지 값이라도 true 가 아니라면 false
		
		// OR연산
		System.out.println(a> b || a == b);		// 둘중 하나 이상의 값이 true 라면 true a>b 가 true
		System.out.println(a < b || a == b);	// 두개의 값 모두 false 라 false
		
		// XOR연산
		System.out.println(a > b ^ a == 10);	// 둘중 하나의 값만 true 여야 하는데 둘다 true 여서 false
		System.out.println(a > b ^ a == b);		// 앞 true 뒤 false 둘중 하나의 값만 true 여야 true - true
		
		// NOT 연산
		System.out.println(!(a>b));				// 반대의 값이기 때문에 a>b 는 true -> ! 로 false
		System.out.println(!(a<b));				// 위와 같아서  a<b 는 false -> !로 true
		
		System.out.println(a == b && a > b);	// 두 식의 값 모두 false를 출력하지만 &&의 경우에는 만약 왼쪽항이 false라면 오른쪽 항의 값을 확인하지 않는다.
		System.out.println(a == b & a > b);		// 
		System.out.println(a == 10 || a < b);	// 반대로 or의 경우 하나만 true이면 결과가 true이기 때문에 왼쪽항이 true 이면 오른쪽항은 확인하지 않는다.
		
		System.out.println(a == b & test());	// 	test()는 true 이다 &의 경우 false 값이 출력되기 전 test가 발동하여 'test메서드실행됨'이 나오고 그뒤 false 값이 나온다
		System.out.println(a == b && test());	// 	&&의 경우 왼쪽항이 false 가 나오고 &&는 왼쪽항이 틀린경우 오른쪽항을 확인하지않기때문에 test가 발동하지않았다.
		
//		System.out.println(c > 0 & (a / c > 0 )); 	//Exception in thread "main" java.lang.ArithmeticException: / by zero
													//at a1_practice.p1.main(p1.java:36)

		
	}
	
	public static boolean test() {
		System.out.println("test()메서드 실행됨");
		return true;
	}
}