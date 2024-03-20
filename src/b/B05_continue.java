package b;

public class B05_continue {

	public static void main(String[] args) {
		// continue
		// 반복문 내부에서만 사용이 가능하다.
		// 반복문에서 continue를 만나면 아래의 내용을 실행하지 않고, 다음 반복 회차로 이동한다.
		
		// 1에서부터 100까지 수 중 짝수만 출력하시오.
///		for (int i = 1;i <= 100;i++) {
//			if(i % 2 == 0) 컨티뉴를 사용하지 않은 방법
///			if(i % 2 == 1)		// i 의 초기값이 0 인경우 - i == 0 인 경우도  if조건에 넣어야 한다.
///				continue; 		// i 를 1에서부터 100까지 출력하는 도중 i를 2로 나누었는데 1이 떨어질 경우 continue 로 해당하는 출력값을 출력하지않고 다음 숫자로 넘어간다.
///			System.out.println(i);
//		}
		
		//continue로 5의 배수만 출력하시오
		for (int z = 1;z <= 100;z++) {
			if(z % 5 == 1)
				continue;
			if(z % 5 == 2)
				continue;
			if(z % 5 == 3)
				continue;
			if(z % 5 == 4)
				continue;
			System.out.println(z);
			
		//강사님 방법	
		System.out.println(" -- 5의 배수만 출력 --");
		for (int y = 0; y <= 100; y++) {
			if (y % 5 != 0 || y == 0)
				continue;
			System.out.println(y);
		}
		
		System.out.println("6");
		for (int x = 1;x <= 100; x++) {
			if(x % 6 == 1)
				continue;
			if(x % 6 == 2)
				continue;
			if(x % 6 == 3)
				continue;
			if(x % 6 == 4)
				continue;
			if(x % 6 == 5)
				continue;
			System.out.println(x);
		}
		}
	}

}
