package G;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class G02_ConsumerEx {

	
	/*
	 * 	자바의 표준 API 에서 한개의 추상 메서드를 가진 인터페이스들은 모두 람다식으로 사용할 수 있다.
	 * 람다에 사용되는 함수적 인터페이스를 java.util.function 패키지에 설정해서 허용하고 있다.
	 * 인터페이스 종류는 크게 5가지가 있다.
	 * 	- Consumer	: 매개변수가 있고, 리턴값이 없는 경우
	 * 	- Supplier	: 매개변수가 없고, 리턴값이 있는 경우
	 * 	- Function	: 매개변수가 있고, 리턴값도 있는 경우
	 * 	- Operator	: 매개변수가 있고, 리턴값도 있는 경우 ( 연산 결과 )
	 * 	- Predicate	: 매개변수가 있고, 리턴값은 boolean인 경우
	 * 	
	 */
	
	// 인터페이스			
	// Consumer<T> 		- 추상 메서드가 void accept(T t)			// t type 매개변수 타입
	// BiConsumer<T,U> 	- 추상 메서드가 void accept(T t, U u)
	// xxxConsumer		- 각 데이터 타입에 따른 Consumer(IntConsumer, LongConsumer, DoubleConsumer
	// objxxxConsumer	- T객체와 기본 데이터타입의 매개변수를 받는 Consumer
	
	public static void main(String[] args) {
		// Consumer 인터페이스
		Consumer<String> c1 = name -> System.out.println(" 제 이름은 " + name + " 입니다. ");
		c1.accept("홍길동");
		
		BiConsumer<String, Integer> c2 = (name, age) -> {
			System.out.println("제 이름은 " + name + " 이고 , 나이는 " + age + " 입니다. ");
		};
		c2.accept("홍길동", 20);
		
		DoubleConsumer c3 = (score) -> System.out.println("제 점수는요 " + score + "점 입니다. ");
		c3.accept(98.6);
		
		ObjIntConsumer<String> c4 = (lecture, i) -> {					//ObjInt 의 뜻은 (x,y) 에서  x 는 지정해주지않았고 y 는 int 값이 온다는 뜻
			System.out.println("제 " + lecture + " 의 점수는 " + i + " 점입니다.");
		};
		c4.accept("자바프로그래밍", 90);
	}

}
