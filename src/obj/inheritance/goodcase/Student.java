package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Student extends Person {

	public String studentID;
	public String major;
	
	
	
	/*
	 *  this 와 super
	 *   - this
	 *   	> this 는 현재 객체 (자기 자신)
	 *   	> this.
	 *   	 - 변수 또는 메서드를 참조
	 *   	 - this.name => 자기 자신의 name 멤버변수를 참조하겠다.
	 *   	 - this.go() => 자기 자신의 go() 메서드를 참조하겠다.
	 *   	> this()
	 *   	 - 자기 자신 클래스 내의 다른 생성자를 참조하겠다 라는뜻
	 *   	 - this(); => 기본 생성자를 참조
	 *   	 - this("hello");	=> 자신이 가지고 있는 생성자를 호출한다. 인자 값을 처리하는 생성자.
	 *   - super
	 *   	> super는 현재 객체의 부모 객체, 한단계 위 부모를 의미한다.
	 *   	> super.
	 *   	 - 부모의 변수 또는 메서드를 참조한다.
	 *   	 - super.name => 부모의 name 멤버변수를 참조하겠다.
	 *   	 - super.go() => 부모의 go() 메서드를 참조하겠다.
	 *		> super()
	 *		 - 부모 생성자를 참조한다.
	 *		 - super() => 부모의 기본 생성자를 참조
	 *		 - super(10, 20) => 부모의 해당 인자값을 처리하는 생성자를 참조
	 *		 - super("hello")
	 */
	
	public Student() {
		
	}

	public Student(String name, int age) {
		super(name, age);		// 부모생성자의 (name과 age 생성자)를 불러와서 처리하는
	}

	public Student(String name, int age, String studentID, String major) {
		this(name, age);		// 위 super(name, age)를 받아오는 this
		height = 179.6f;		// 부모의 멤버중 protected 멤버 변수이다. // studentclass가 personclass에게 상속을 받았기때문에 protected 여도 변수 가능
//		weight = 100.0f;		// default 로 참조가 되지 않는다.
		this.studentID = studentID;
		this.major = major;
	}
	
	
	public void study() {
		System.out.println(name + "은 공부합니다.");
	}
	
	// Overriding 이란?
	// 부모 클래스로부터 상속받은 메서드를 자식 클래스에서 행위 (Method)를 바꾸거나 보완하기 위해서 다시 정의해서 사용하는 것 ( 재 정 의 )	
	//
	// 재정의 규칙
	//	- 상속을 전제로 한다.
	//	- 리턴 타입, 메서드 이름, 파라미터 변수 선언이 일치해야 한다.
	//	- 접근 제한자는 같거나 more public 해야 한다.
	//	  private < default < protected < public
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름 : " + name + "\t나이 : " + age + "\t학번 : " + studentID + "\t전공 : " + major + "]";
	}
	
}
