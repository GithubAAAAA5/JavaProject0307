
public class B00_format {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.printf("a의 값은 :%d",a);  //제어문자로 %d는 정수이다.
		/*
		 * 		정수 : %d
		 * 		실수 : %f
		 * 		한문자 : %c
		 * 		문자열 : %s
		 * 		각 제어문자와 대응하는 값을 지정해야한다.
		 */
		
		float b = 10.234f;
		char c = 'A';
		String str = "오늘 날씨는 미세먼지 많음 이다.";
		
		System.out.printf("\na의 값은 정수 %d, b의 값은 실수 %f \nc의 값은 문자 %c, str의 값은 문자열 %s",a,b,c,str);
		
		System.out.println();
		a = 100;
		System.out.printf("[%10d]",a);		//제어문자 앞에 숫자는 출력 값의 자릿수 ->[       100] 라고 출력되는데 %10d 는 10칸을 의미하고 10칸중 a(100)이 차지하는 3자리 제외 7자리가 공백을고 표시된다.
		System.out.println();
		System.out.printf("[%-10d]",a);
		
		System.out.println();
		b = 33.145f;
//		System.out.printf("[%10f]",b);	--> 출력문자는 [ 33.145000]
		System.out.printf("[%10.2f]",b);	//실수제어 문자의 자리수 지정은 ".숫자" 를 사용한다. --> 출력문자는 [     33.15] 로 끝자리가 반올림처리 되었다.
		System.out.println();
		System.out.printf("[%10.3f]",1000.123457);  // 투입값이 1000.123547 인경우 출력값은 1000.124 가나온다 고로 반올림된것을 알수있다.
		System.out.println();
		System.out.printf("[%7.3f]",1000.123655);
		System.out.println();
		System.out.printf("[%010d]",a);
		
	}

}
