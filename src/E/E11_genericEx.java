package E;
import generic.Person;

public class E11_genericEx {

	public static void main(String[] args) {

		Person<Character> p1 = new Person<Character>('딸', 8);
//	Person<Character> p1 = new Person<>('딸', 8);
//		Java 7부터는 다이아몬드 연산자(< >)에 대해 타입 인자를 생략할 수 있게 되었다.
//		컴파일러가 타입 인자를 추론하여 대체하기 때문에 문제가 없다.		
		System.out.println(p1.getName());
		
		Person<String> p2 = new Person<String>("아빠", 45);
		System.out.println(p2.getName());
		
		System.out.println(p1.test(4.8));	// 자료 타입이 double
		System.out.println(p1.test("4.8"));	// 자료 타입이 String
		System.out.println(p1.test(5));		// 자료 타입이 int
		System.out.println(p1.test('5'));	// 자료 타입이 char
	}
	

}
