package obj.objectclass;

import obj.inheritance.Person;

public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object();		// 최상위 객체
		obj.hashCode();					// 객체 동등 비교를 위해서
		obj.equals(obj);				// 객체 동등 비교를 위해서 재정의하여 사용한다. - 두개가 서로 같은지 비교하는거
		obj.toString();					// 기본적으로 클래스명@hashcode 값으로 출력
										// 재정의해서 객체 내의 정보를 확인하는 용도로 사용된다.
		
		Person p1 = new Person(20, "HongGilDong");
		Person p2 = new Person("HongGilDong", 20, 185.1f, 0);
		System.out.println("p1의 hashCode 값 : " + p1.hashCode());
		System.out.println("p2의 hashCode 값 : " + p2.hashCode());
		System.out.println("p1과 p2의 비교 결과 : " + (p1.hashCode() == p2.hashCode()));
		
		
		
		
		Person o1 = new Person("HongGilDong", 20);
		Person oto1 = o1;
		Person o2 = new Person(20, "HongGilDong");
		System.out.println("o1의 해쉬값 : " + o1.hashCode());
		System.out.println("o2의 해쉬값 : " + oto1.hashCode());
		System.out.println("o1과 o2의 비교 결과 : " +(o1.hashCode() == o2.hashCode()));
		System.out.println("o1과 oto1의 비교 결과 " + (o1.hashCode() == oto1.hashCode()));
		System.out.println("o1과 o2의 equals 사용 : " + o1.equals(o2));
		
		Person p3 = new Person();
		System.out.println(new String("hello").hashCode());
		System.out.println("hello".hashCode());

		
		
//		System.out.println("p1의 equals값 : " + p1.equals(obj));
//		System.out.println("p2의 equals값 : " + p2.equals(obj));
//		System.out.println("p1과 p2의 비교 결과 : " + (p1.equals(obj) == p2.equals(obj)) );
		
	}
	

}