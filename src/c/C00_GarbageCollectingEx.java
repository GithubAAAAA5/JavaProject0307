package c;
import obj.Pen;

public class C00_GarbageCollectingEx {

	public static void main(String[] args) {
		// Garbage Collecting
		//	- 객체 생성에 사용하는 new 키워드는 존재하지만, 생성된 메모리에서 해제하는 키워드는 존재하지 않는다.
		//	- 없는 이유는 자바에서 자바 가상 머신(JVM)이 알아서 메모리를 관리하기 때문인데, 이를 가비지 컬렉팅이라고 한다.
		//	- 객체가 더 이상 프로그램에서 사용되지 않으면 가비지 컬렉터가 스스로 판단하여 메모리를 해체하여 수거한다.
		
		Pen p;
		for (int i =0; i <= 10_0000_0000; i++) {
			p = new Pen();
		}

	}

}