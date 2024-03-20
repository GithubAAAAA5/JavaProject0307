package b;

public class B07_labeldeLoopExample {

	public static void main(String[] args) {
		// Labeled Loop
		// 루프 앞에 이름을 지정후 ":"를 사용한다.  /// for while 다 사용 가능하다. 지금 작성된 코드의 for을 while로 바꾸어도 동작한다.
		outer : for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				if(j == 2) {
///					break outer;	// 레이블이  outer 인 반복문을 종료한다.  /// break 만 적었을때는 하위포문인 if(j ==2) 가 해당되어 j의 값이 2가 되는순간 프로그램이 멈추는데 break outer 로 상위포문인 outer 에 제어를 걸어
///																	  ///  outer 가 2가 되는 순간 코드가 멈춘다.
					continue outer;									/// if(j == 2) 인 경우 continue outer 로 인해 0-2/1-2/2-2 의 값은 출력되지않는다.
				}
				System.out.println(i + "\t" + j);
			}
		}

	}

}
