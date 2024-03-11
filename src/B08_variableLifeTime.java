
public class B08_variableLifeTime {
	
	static int c;	// 클래스 멤버변수					- 클래스에 직접 사용하는 변수로 객체 생성과는 상관이 없다.
	int b = 8;		// 인스턴스 멤버 변수 ( 필드, 속성 )	- 객체가 생성되어야 쓸 수 있다.
	

	public static void main(String[] args) {
		// 변수의 수명
		
		// {} 블럭 내부에서 선언된 변수는 '지역 변수' 이다. {}을 벗어나면 사라진다.
		// 변수가 살아 있는 범위를 변수의 영역(scope)이라고 부른다.
		// 변수의 영역만 겹치지 않는다면 같은 이름의 변수를 사용할 수 있다.
		
		int b = 5;	// 지역변수
		System.out.println("mian method의 b : "+ b);
		c = 10;
		System.out.println("Class 멤버변수 c :"+ c);
		
		
		// 객체 생성
		B08_variableLifeTime obj = new B08_variableLifeTime();	//객체 생성
		System.out.println("class의 b(인스턴스 멤버변수) : "+obj.b);
		System.out.println();
		B08_variableLifeTime obj2 = new B08_variableLifeTime();	//객체 생성
		obj2.b = 100;	// obj2 객체의 b인스턴스 변수에 값을 수정
		System.out.println("class의 b(obj 인스턴스 멤버변수) : "+obj.b);
		System.out.println("class의 b(obj2 인스턴스 멤버변수) : "+obj2.b);
		
		System.out.println();
		
		// 클래스 변수
		System.out.println(c);
		System.out.println("obj.c에 값을 대입하기 전 : " +obj.c);
		obj.c = 20;
		System.out.println("obj.c에 값을 대입한 후 : " +obj.c);
		System.out.println(obj.c); 
		System.out.println("obj2.c에 값을 대입한 후 : " +obj2.c);
		System.out.println(obj2.c); 
		B08_variableLifeTime.c = 200;
		System.out.println("대입한 후 obj.c: " +obj.c);
		System.out.println("대입한 후 obj2.c : " +obj2.c);
		
		if(true) {   // 무조건 실행하겠다. 항상 실행하겠다.
			int a = 10; //지역변수 설정
			System.out.println(a);
			a = 7;
			System.out.println("main 메서드의 b : "+b);   // 선언하지않아도 이미 어미문에서 선언을 했기때문에 {}안에서 다시 지정하지 않아도 b의 값이 나온다.
///			int b = 10;  								// {}안에 있어도 이미 어미문에서 선언을 했기때문에 중복이 될수없다.
		}
///		a = 7;  // if문에서 a가 지정이 되었지만 {} 밖으로 나온순간 a의 값을 지정해주어야 하기때문에 빨간줄로 성립할수없다고 경고창이 나온다.
		
		if(true) {
			int a = 20;
			System.out.println(a);  					// 위 아래 if문은 서로 별개의 {} 안의 내용이기 때문에 같은 int a 의 이름을 가져도 다른 값을 가지는게 가능하다.
			
		}
		
		for (int i = 0; i < 10; i++) {
			//for 문에서 사용되는 int i (초기값) {} 내에서 선언된 지역 변수 이다.
			//int i 의 값은 for문을 벗어 날 수 없다. 
		}
		
		
	}

}
