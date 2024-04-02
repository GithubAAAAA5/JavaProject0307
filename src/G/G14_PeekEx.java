package G;
import java.util.Arrays;
import java.util.List;

public class G14_PeekEx {

	/*
	 * 	요소 전체를 반복하는 반복자는 forEach()와 peek()가 있다.
	 * 	 forEach()는 최종 단계에서 반복하는 반복자이다. - 출력 결과 마무리
	 * 	 peek()은 중간 단계에서 처리하는 반복자이다. peek() 메서드는 중간 단계에서 전체 요소를 반복하며 추가 작업을 하기 위해 소용된다.
	 */
	
	public static void main(String[] args) {
		
		
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		list.parallelStream().mapToDouble(a -> a.area()).peek(a -> System.out.println(a)).sum();
		// peek()은 중간 반복자이기 때문에 최종 처리 메서드가 있어야만 동작이 가능합니다.   위 코드에선 sum이 최종처리메서드의 역할
		

	}

}
