package a1_practice;

public class p8 {

	public static void main(String[] args) {
//		MethodEx me = new MethodEx();
//		
//		me.one();	//메서드 실행
//
//	}
//
//}
//
//class MethodEx {
//	void one() {		// 1
//		two();
//		System.out.println("one");
//	}
//	
//	void two() {		// 	2
//		three();
//		System.out.println("two");
//	}
//	
//	void three() {		// 3
//		System.out.println("three");
//	}
//}
		
		System.out.println(divide(pow(add(3,3))));
	}
	
	static int add(int x , int y) {
		return x+y;
	}
	static int pow(int x) {
		return x * x ;
	}
	static int divide(int x) {
		return x / 2;
	}

}