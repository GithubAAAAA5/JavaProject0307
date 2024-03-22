/*
 * 	Usage Modifier
 * 	 - Usage Modifier는 Acces Modifier를 제외한 모든 Modifier를 의미한다.
 * 	 - 여기 Usage Modifier(사용 제한자) 중 static, final, abstract를 볼 예정
 * 	 - 이외에 transient, synchronized, volatile, native 등이 있다.
 * 	## static의 의미
 * 	 - 일반적으로 각 인스턴스들은 서로 독립적으로 객체 내에서 변수값을 서로 각각 다룬다.
 * 	 - Person p1, Person p2 가 있는 경우에 각각의 p1.getName(), p2.getName()은 다른 값을 가질 수 있다.
 * 	 - static이 변수 앞에 붙으면 모든 인스턴스에 대해 공유가 된다. 이때 변수는 인스턴스 변수가 아닌 클래스 단위로 바뀌게 되고, 이 때문에 static이 붙은 멤버 변수를 클래스변수라고 합니다.
 * 		그리고, static 이 붙지 않는 변수를 인스턴스 변수라고 하며 구분 합니다.
 * 	 - 메서드 sttic이 붙는다면 해당 메서드는 인스턴스와 무관하기 때문에 인스턴스를 생성하지 않아도 호출이 가능하게 된다.
 * 
 *	-- static 관련 된 자바 문법
 *	 > static 메서드 안에서는 non-static 멤버를 객체 생성 없이 직접 참조할 수 없음.
 *	 > 반대로 static이 붙지 않은 메서드에서는 static 멤버를 사용할 수 있다.
 *
 * 	 - 주로 모든 인스턴스가 공통된 변수값을 가져야 하는 경우가 있는데 이때 static 변수를 사용한다.
 *		static 변수와 관련된 작업을 하거나 어떠한 인스턴스 변수도 사용하지 않고, 매개변수로만 작업을 처리하는 메서드는 static 메서드로 정의해 준다.
 *		ex) Math 클래스의 메서드 * 
 * 
 */
package c;


import obj.Count;

public class C06_static {

	public static void main(String[] args) {

		Count c1 = new Count();
		c1.a++;
		c1.b++;		// 경고 : The static field Count.b should be accessed in a static way
		System.out.println("Non-static a : " + c1.a);
		System.out.println("static b : " + c1.b);		// static 의 값을 변경 시키면 전체의 static 값이 변경된다.
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("Non-static a : " + c2.a);
		System.out.println("static b : " + c2.b);		// 고로 위에서 한번 사용한값이 아래로 내려옴
		
		System.out.println(c2.b);
		
		Count c3 = new Count();
		c3.b++;
		
		System.out.println("c1.b : " + c1.b);
		System.out.println("c2.b : " + c2.b);
		System.out.println("Count.b : " + Count.b);
		System.out.println("c3.b : " + c3.b);
		
//		c1.b++;
//		c2.b++;
//		c3.b++;
//		
//		System.out.println(c3.b);
//		
//		c1.b--;
//		System.out.println(c1.b);
		
		// static method
		System.out.println("Count.doIt () : " + Count.doIt());
		System.out.println("Count.doIt () : " + Count.doIt());
		System.out.println("Count.doIt () : " + Count.doIt());
		
	}

}































