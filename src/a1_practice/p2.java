package a1_practice;

public class p2 {	 

	
	
	public static void main(String[] args) {
		
		//비트연산자
		
		
		System.out.println("2 : " + Integer.toBinaryString(2));		// 10진수 2 를 2진수로 변환
		
		System.out.println("3 : " + Integer.toBinaryString(3));		// 10진수 3 을 2진수로 변환

		
		// 비트 논리 연산
		System.out.println("2&3 : " + (2 & 3));
		System.out.println("2|3 : " + (2 | 3));
		System.out.println("2^3 : " + (2 ^ 3));
		System.out.println("~3 : " + ~3);
		
		
		// 첫자리는 부호를 나타내는 비트를 포함하여 모든 비트를 반대로 변환
		System.out.println(" ~3을 이진수로 : " + Integer.toBinaryString(~3));
		
		
		//~3 의 2진수값의 길이
		// 첫자리는 부호를 나타내는 비트 나머지를 31자리로 정수자료형을 메모리에 저장
		System.out.println(Integer.toBinaryString(~3).length());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("1111111111111111111111111111100", 2)-Integer.MAX_VALUE-1);
	
		
		// 비트 쉬프트 연산
		
		// << 왼쪽 비트를 오른쪽 수만큼 이동 (빈자리는 0 으로 채움)
		// >> 왼쪽 비트를 오른쪽 수만큼 이동 (빈자리는 부호 비트로 채움)
		// >>> 왼쪽 비트를 오른쪽 수만큼 이동 ( 빈자리는 0 으로 채움)
		
		// << 연산
		System.out.println(3 << 2);
		System.out.println("3의 이진수 : " + Integer.toBinaryString(3));
		System.out.println(" 12의 이진수 : " + Integer.toBinaryString(12));
		
		
		// >> 연산
		System.out.println(8 >> 2);
		System.out.println("8의 이진수 : " + Integer.toBinaryString(8));
		System.out.println("2의 이진수 : " + Integer.toBinaryString(2));
		
		// >>> 연산
		System.out.println(-8 >>> 3);
		System.out.println(" -8의 이진수 : " + Integer.toBinaryString(-8));
		System.out.println(" 3의 이진수 : " + Integer.toBinaryString(3));
		
		System.out.println(Integer.toBinaryString(536870911));
		
		
//***********************************************************************************		
		// 삼항연산
		
		
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";		// int score 가 60 이상이라면 - 합격 ( 왼쪽항 )   그렇지 않다면(60이하라면) 불합격(오른쪽항)
		System.out.println(pass);

//***********************************************************************************	
		// 문자열 연산
		
		String name = "홍길동";
		System.out.println("안녕 나는" + name + "이다");
		
		int height = 190;
		System.out.println("내 키는 " + height + "이다");
		
		String weight2 = 65.5 + "";
		double weight = 75.5;
		System.out.println("제 몸무게는 " + weight + "입니다.");
		System.out.println("네 몸무게는" + weight2 + "입니다.");
		
		int ageInt = 30;		//정수타입의 변수
		String ageStr = "30";	//문자타입의 변수
		
		
	}

}
