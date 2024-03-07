
public class A06_operator {

	public static void main(String[] args) {
		// 연산자에 대해서 보겠습니다. 두번째 변경합니다.

		int a = 7, b = 3;
		System.out.println("*** 산술 연산자 ****");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);					// 나누기는 같은 타입인 경우 해당 타입으로 출력된다.
		System.out.println(a / 3.0);				// 실수 타입과 정수가 연산하게 되면, 실수타입으로 출력된다.
		System.out.println(a % b);					// 나머지 연산(mod)
//		System.out.println(a ^ b);					// 제곱승처리가 아닌 비트연산자이다.
		System.out.println((int)Math.pow(a, b));	// 제곱승처리
		System.out.println();
		
		// 비교연산자 (비교 연산자의 결과는 boolean 타입)
		System.out.println("*** 비교 연산자 ***");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);					// 같을 경우 true 다를 경우 false
		System.out.println(a != b);					// 다를 경우 true 같을 경우 false
		
		// 논리연산자
		// && : 둘 모두 true 인 경우 true 값이 나온다 ( 두가지 조건 모두 만족해야 true 둘 중 하나라도 만족하지 않으면 true 가 나오지 않는다)
		// || : 둘 중 하나만 true 여도 true 값이 나온다 ( 두가지 조건중 하나만 만족 시켜도 true 가 나온다)
		System.out.println("*** 논리 연산자 ***");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);		// 노란색 밑줄의 경우 빨간색과는 다르게 구동은 가능하지만 다른 방법을 사용해보라는 경고의 의미
		System.out.println(false && false);		// dead 코드의 경우 앞에서 이미 결과값이 도출되어 뒤에 값이 필요없어져서 구동되지 않는 경우
		System.out.println("결과 : " + (a > b && a / b == 2));
		System.out.println("결과 : " + (a > b && a / 3.0 == 2));
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// 대입연산자
		System.out.println("*** 대입 연산자 ***");
		a = 10;
		System.out.println(a);
		
		// 복합대입연산자
		a += 2;		// a = a + 2;
		System.out.println(a);
		a -= 5;		// a = a - 5;
		System.out.println(a);	// 7
		a *= 10;	// a = a * 10;
		System.out.println(a);	// 70
		a /= 7;		// a = a / 7;
		System.out.println(a);	// 10
		a %= 3;		// a = a % 3;
		System.out.println(a);	// 1
		
		// 삼항연산자
		// 비교 ? 참 : 거짓;
		a = 7;
		b = 4;
		
		String answer = a > b ? "a가 큽니다." : "b가 큽니다.";
		System.out.println(answer);
		
		int value = a > b ? 10 : 5;
		System.out.println(value);
		System.out.println();
		
		// 단항연산자
		a = 10;
		
		System.out.println("*** 단항 연산자 ***");
		a++;	// a의 값을 1 증가 시킵니다. (후치 - 값을 처리한 후 증가)  a = a + 1
		System.out.println(a);
		++a;	// a의 값을 1 증가 시킵니다. (전치 - 값을 처리하기 전에 증가)
		System.out.println(a);
		--a;	// a의 값을 1 감소 시킵니다. (전치
		System.out.println(a);
		a--;	// a의 값을 1 감소 시킵니다. (후치
		System.out.println(a);
		
		a = 7;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println();
		
		// ! : boolean 타입에서만 사용한다. 논리연산에 대한 반전
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(a > b);
		System.out.println(!(a > b));
		
		// ~ : 비트 연산에 대한 반전
		System.out.println(10);
		/// 0|000 0000 0000 0000 0000 0000 0000 1010 => 10
		/// 1|111 1111 1111 1111 1111 1111 1111 0101 => -11
		/// S| => signed bit(0이면 양수, 1이면 음수)
		System.out.println(~10);
		
		// 11 ~ 1111 1111(-1)
		//              +1
		
		// 비트연산
		// 이진법으로 계산하는 연산
		// &, |, >>, <<, ^ ...
		// ^ 베타적 논리학
		a = 7;	// 0000 0111
		b = 3;	// 0000 0011
		
		System.out.println("*** 비트 연산 ***");
		System.out.println(a & b);
		
		//		0000 0111
		//	&	0000 0011
		// ==============
		//		0000 0011
		System.out.println(a | b);
        //		0000 0111
		//	|	0000 0011
		// ==============
		//		0000 0111
		System.out.println(a ^ b);
        //		0000 0111
		//	^	0000 0011
		// ==============
		//		0000 0100
		System.out.println(a << b);
        //		0000 0111
		//	<<	        3
		// ==============
		//		0011 1000
		System.out.println(a >> b);
        //		0000 0111
		//	>>	        3
		// ==============
		//		0000 0000 (111)
		
	}

}
