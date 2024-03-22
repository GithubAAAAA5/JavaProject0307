package d;
import java.io.IOException;

public class D07_checkedException {

	public static void main(String[] args) {
		// checkedException 은 예외처리해야 한다.	잘못된 값이 들어와서 예외가 발생가능하기 때문이다.
		System.out.println("값을 입력받는 프로그램입니다.");
		
		byte[] data = new byte[100];	// 한번에 100바이트씩 처리할 공간.
//		System.in.read(data);	//제어가 되어야 하는데 제어가 되지 않았기에 오류 발생
		try {
			System.in.read(data);
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("입력할 문자열은 : ");
		System.out.println(new String(data).trim());	// 100byte넘어가면 짤림
	}

}
