import java.util.Arrays;

public class B09_ArrayExample1 {

	public static void main(String[] args) {
		// 배열
		// 같은 타입의 변수를 한번에 여러개 선언하는 방법이다.
		
		// 배열의 선언 방법
		// 1. 타입 [] 변수명 = new 타입명[배열의 길이];
		// 2. 타입 [] 변수명 = { 데이터들 };
		// 3. 타입 [] 변수명 = new 타입명 [] { 데이터들 };
		
		
		int[] numbers = new int[10]; 		// 정수 10개의 변수를 저장할 수 있는 배열을 의미한다. 변수가 들어 있지않다 .기본값은 10개 전부 0
		boolean[] win = {false, false, true, true, true, true, true, false};		// 불린 boolean 타입의 변수 5개 지정 및 초기화
		String[] welcome = new String[] {
				"오늘 뭐 드셨어요?", //인덱스0
				"오늘 저녁에 비 온대요 근데 우산이 없어요 여기서 더 수정을 하면 문자열의 길이가 늘어나는건가", //인덱스 1
				"졸리죠?" //인덱스 2 
		};

		// 배열의 인덱스 : 배열에 저장된 값을 불러올 때에 인덱스 값을 사용한다.
		//				인덱스의 시작값은 0부터 시작된다.  // 정수 실수 불린 캐럽 참조(배열문자)
		
		System.out.println(welcome[0]);
		System.out.println(welcome[1]);
		System.out.println(welcome[2]);

		System.out.println("welcome 배열의 길이 : " + welcome.length);  	// length : 요소의 개수 문자열의 길이
		System.out.println("numbers 배열의 길이 : " + numbers.length);
		System.out.println("win 배열의 길이 : " + win.length);
		System.out.println("문자열의 길이 : "+welcome[1].length());

		
		
		// 문자열의 배열
		char[] s;		//배열 선언
///		char[5] s;		//배열 선언시 오류가 발생함  - [5] 괄호속 숫자의 의미는 배열의 길이로 생각하고 쓸수 없다.
						//배열 선언시 크기를 명시 하지 못한다.
		
		s = new char[5];	// 배열의 길이로 선언시 초기화 값이 없는 경우 char는 "\0000"값으로 초기화된다. 
		s[0] = 'A'; s[1] = 'B'; s[2] = 'C'; s[3] = 'D'; s[4] = 'E';
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		
		//문자열은 문자의 배열과 비슷하다.
		System.out.printf("%s", Arrays.toString(s));
		
		System.out.println();
		
		System.out.printf("%s", String.valueOf(s));
		
		// *** Enchanced For문(강화된 for문)
		/*
		 *	(형식)
		 *	for (타입 변수명 : 배열명) {	** 배열명으로 불러오는 배열의 타입은 : 이전의 타입과 같아야 한다.
		 *		반복시 실행할 명령문
		 *	}
		 */
		System.out.println("\n강화된 for를 이용한 반복 처리 ");
		for (String str : welcome) {	// welcome은 String[] 타입의 배열이기 때문에 String str 로 받게 된다.
			System.out.println(str);
		}
		
		for (boolean result: win) {
			System.out.println("승률 : "+(result ? "승":"패"));
		}
		
		for (int i = 0; i < win.length; i++) {
			if(win[i]) {
				System.out.println(i+1 +"번째 전적 : 승리");
			}else {
				System.out.println(i+1 +"번째 전적 : 패배");
			}
 		}
		
		System.out.println("배열의 내용 출력 : Arrays.toString() 메서드를 사용한다.");
///		System.out.println(welcome);	//[Ljava.lang.String;@5cbc508c <-- 해쉬값이라고 부른다. 해당하는 내용이 어떤 위치에 있는지 보여주는것
		System.out.println(Arrays.toString(welcome));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(win));
		
		//	배열 선언시 자동적으로 기본값으로 초기화된다.
		//	정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null(비어있음)
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));

		//	배열의 복사
		//	 배열의 얕은 복사(shallow copy), 깊은 복사(deep copy) 가 있다.
		String[] byeMessage2 = new String[] {"good bye" , "bye bye" , "See you"};
	
		// 0o : 8진수   0x : 16진수  0b : 2진수
		
		//	1. 얕은 복사는 byeMessage 변수에 byeMessage2의 주소값을 대입	
///		byeMessage = byeMessage2;	// 얕은 복사
///		byeMessage[1] = "hello bye bye";
///		System.out.println(Arrays.toString(byeMessage));
///		System.out.println(Arrays.toString(byeMessage2));		// 원본데이터인 bM2 도 바뀌는것으로 보아 bM = bM2 를 선언하면 두 값은 동일한 값 동일한 위치가 된다.
		
		
		//	2. 깊은 복사 (Deep copy)
		//	System.arraycopy( src, srcPos, dest, destPos, length)
		//	src		: 원본 배열의 이름
		//	srcPos	: 복사를 시작할 원본의 위치(index를 가르킨다.)
		//	dest	: 붙여넣기 할 배열의 이름
		//	destPos	: 붙여넣기를 시작할 위치를 설정한다.(index) 
		//	length	: 복사를 몇개나 할 것인지 결정한다.
		
		System.out.println("복사 전 : "+Arrays.toString(byeMessage));
		System.arraycopy(byeMessage2, 1, byeMessage, 5, 2);
///						원본의배열bM2	시작위치	복사할위치bM	0부터시작해서5의해당자리	복사할갯수2개		\\\
		System.out.println("복사 후 : "+ Arrays.toString(byeMessage));
		System.out.println("복사 후 : "+ Arrays.toString(byeMessage2));
		
		System.out.println();
		
		byeMessage[0] = "Good bye!!!";
		
		System.out.println("복사 후 : "+ Arrays.toString(byeMessage));
		System.out.println("복사 후 : "+ Arrays.toString(byeMessage2));
		
		System.out.println();
		
		//	깊은 복사를 통해서 byeMessage에 byeMessage2에 있는 배열의 값을 모두 복사하려고 한다면  
		System.arraycopy(byeMessage2, 0, byeMessage, 0, byeMessage2.length);
		System.out.println("모두 복사 :"+Arrays.toString(byeMessage));
		

		
	}

}
