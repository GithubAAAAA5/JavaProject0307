package b;
import java.util.Random;

public class B02_ifExample2 {

	public static void main(String[] args) {
		// 난수 생성 : 임의 값(Random)       무작위로 생성된 임의의 수를 말한다
		// 1. Math.random() : 0 ~ 1 미만의 임의 값을 출력한다. (double 타입)
		// 2. Random을 임포트 : import 를 사용하여 라이브러리에 있는 Random 클래스를 로드한다.
		// 	 	Random는 각 타입별로 난수를 발생시키는 메서드가 존재한다.
		//   	난수를 생성하기 위해서 Seed를 지정할 수 있음.  Seed값이 동일하면 동일한 값이 발생한다.
		//	 	컴퓨터는 랜덤을 만들어낼 수 없다. 그래서 time 을 활용 time 항상 변화하기 때문
		//		Random 클래스 매서드
		//			- nextFloat()	: 0.0 이상 1.0 미만의 float 형 난수 발생
		//  	   	- nextBoolean()	: true or false 중 임이의 값을 발생
		//  	   	- nextInt()		: int형 타입 이내의 모든 값에서 난수 발생
		//  	   	- nextInt(int)	: 0부터 생성자에 들어간 숫자 -1까지 int형 난수 발생
		
//		Random rand = new Random();					
//		float a = rand.nextFloat();					
//		boolean b = rand.nextBoolean();				
//		int c = rand.nextInt();						
//		int d = rand.nextInt(10);					
//		System.out.printf("%f, %b, %d, %d", a,b,c,d);   //%b 는 boolean 타입
		
		// if ~ else 문 : if 조건문이 true 이면 if 에 종속 실행문을 / 그렇지 않으면 else 에 실행문을 동작시킨다.
		
		// 정수에 난수를 발생시키기 ( 0 ~ 99 )                double 타입
		int jumsu = (int)(Math.random()*100);
		System.out.println("점수 : "+ jumsu);
		
		if (jumsu >= 60) {
			System.out.println("60이상인 점수입니다.");
			System.out.println("합격하셨습니다.");
		}else {
			System.out.println("60미만입니다.");
			System.out.println("불합격 하셨습니다.");
			
		}
		


	}

}
