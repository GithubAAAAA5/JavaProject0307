package d;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * ## 내부 클래스(inner Class)
 : 클래스안에 또 클래스를 선언하는 경우

>> 존재 유무에 따라서 4가지 형태로 나눔
 - 멤버 이너 클래스 : 클래스 안에 멤버로 존재하는 형태 
 - 로컬 이너 클래스 : 메서드 또는 블록 안에 존재하며 이름이 있는 형태
 - 익명 클래스 : 메서드 또는 블록 안에 존재하지만 이름이 없는 형태
 - 정적 중첩 클래스 : 멤버 이너 클래스에 static이 붙은 형태
 
 >> 사용하는 경우 
  - 코드 캡슐화 : 프로그램에는 수많은 클래스들이 필요. 일정 범위 이상의 역할을 하지 않는 클래스는 
           굳이 클래스 형태로 작성할 필요가 없음. 작성하게 된다면 많은 클래스로 인해 코드 파악, 유지 및 보수가 어렵다.
  - 클래스간의 의존성이 높은 경우 : B라는 클래스가 A라는 클래스에 의해 항상 호출되어야 하지만, 따로 클래스화하기
      애매한 코드일 경우 내부 클래스를 사용하면 깔끔한 코드 작성이 가능하다... 
 * 
 */



public class D04_innerLocalEx {

	private Frame f;
	
	public D04_innerLocalEx() {
		f = new Frame("Inner Local 테스트...");
	}
	
	public void lanchFrame() {
		final int a = 10;
		// Local inner클래스
		class MyWindowAdapter extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("launch 내 지역변수 a : " + a);
				System.out.println("X 버튼을 클릭했어요");
				System.exit(0);
			}			
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(640, 480);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		D04_innerLocalEx di = new D04_innerLocalEx();
		di.lanchFrame();
	}
	
	
}
