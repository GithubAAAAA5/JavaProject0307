package obj.inheritance;

import customermanager.oop.Customer;

/*
 *  상속(inheritance)
 *	 - 상속은 기존의 클래스를 확장하여 새로운 클래스를 이끌어 내는것을 의미한다.
 *	 - 기존의 코드를 재사용함으로 필요한 코드 재작성을 줄여준다.
 *	 - 단일 상속만 가능하다( 상속은 하나의 부모 클래스만 가질 수 있다) -> 단, 인터페이스는 다중 상속이 가능하다.
 *	 - 키워드는 extends 를 사용하여 상속을 표현한다.
 *	 - 부모(super) 클래스의 멤버(	변수와 메소드를 의미한다.)를 자식(sub) 클래스에서 사용이 가능하다.
 *	 - 생성자는 상속이 안된다.
 *	 - Sub Class "is a" Super Class		// is a : ~에 속해있다. 자식클래스는 부모클래스에 속해있다.
 *		ex) 말 extends 포유류		-> 		말 is a 포유류				/많은 포유류 중 하나.
 *		** has a 관계?
 *			- 객체가 멤버를 가지고 있다 라는 의미
 *			- class NameCard {
 *				String name,
 *				int size;
 *				}일 경우에, NameCard has a name
 *	 - Object 클래스를 최상위 클래스로 둔다. 
 * 	 - final 클래스는 상속이 불가능하다.
 * 	 - abstract 클래스는 반드시 상속해서 사용해야 하는 클래스 이다.
 * 
 * 	 ** 상속 : Bad case 와 Good case 가 있다.
 *		
 *		- BAD CASE
 *		 > 개별 클래스들이 중복된 속성과 기능을 포함하는 경우
 * 
 * 		- GOOD CASE
 * 		 > 중복된 기능을 빼고, 새로운 클래스로 작성한 후 구체화 시킨 경우
 * 		 > 일반화 된 클래스는 부모 클래스
 * 		 > 구체화 된 클래스는 자식 클래스
 * 		 > extends 키워드를 사용하게 된다.
 */




public class Person {
	
	// 이름과 나이, 키, 몸무게, 성별
	public String name;
	public int age;
	protected float height;
	float weight;
	public Person() {}	// 기본 생성자
	
	public String getDetails() {
		return "[이름: " + name + "\t나이: " + age + "\t키: " + height + "\t몸무게 :" + weight + "]";
	}

	
	
	public Person(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	public void walk() {
		System.out.println(name + "는 걸어 간다.");
	}
	
	public void ages() {
		System.out.println(age + "살 이다.");
	}
	
	
	// object 메서드 오버라이드 hashCode()
	@Override
	public int hashCode() {
		// 특정 값을 기준으로 확인하기 위해서 메서드를 수정한다. (이름과 나이를 기준으로 한다)
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * ((name == null)? 0 : name.hashCode());
		return result;
		
	}
	
	
	//동일 객체 판단 .. 객체의 값을 이용
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {		// 동일한 객체
			return true;
		}
		if (obj == null) return false; // null값 확인하기
		if (getClass() != obj.getClass()) return false;		// 객체 생성 클래스 확인
		Person other = (Person)obj;
		if(age != other.age) return false; 	//객체 내에 age멤버의 값을 비교 확인한다.
		if(name == null) {
			if(other.name != null) {
				return false;  	// 객체 내의 이름 확인
			}
		}else if(!name.equals(other.name)) return false;
		
		return true;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stu
			return "Person [name=" + name + ", age =" + age +"]";
	}
	

}
