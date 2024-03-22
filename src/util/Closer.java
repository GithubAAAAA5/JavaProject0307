package util;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Closer {

	// 생성자 를 private로 만들면 생성자를 사용할수없지만 메소드만 가져다 사용하는것은 가능하다.
	private Closer() {}
	
	public static void closer(Writer w) {
		try {
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void closer(Reader r) {
		try {
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
