package c;
import obj.inheritance.Person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

/*
 * 		다형성
 * 
 * 		 - 여러가지 형태를 가지는 성질을 의미한다.
 * 
 * 		 - 다형성은 상속을 전제조건으로 한다.
 * 
 * 		 - 동일한 메시지라도 어떤 객체에 전달되느냐에 따라서 다양한 동작을 발생하게 된다.
 * 		  이것은 프로그램에서 유연성을 부여하는 역할을 한다.
 * 
 * 		 - 다형성은 존재하지 않았던 클래스를 기존 시스템에 수정없이, 시스템에 추가하도록 한다.
 * 			(다형성 인자 예제)
 * 
 * 		 - 다형성을 적용하는 방법은 부모클래스의 객ㄹ체를 선언하고, 자식클래스의 객체를 할당하는것. 반대의 경우에는 불가능하다.
 * 
 * 		 - 다형적 객체의 경우 부모 클래스에 있는 메서드만 사용이 가능하다.
 * 			자식클래스에 재정의 되어 있다면 실행은 자식클래스에 있는 메서드로 실행된다.
 * 			자식클래스의 메서드가 실행된다고 해서 부모 클래스에 있는 해당 메서드를 지우면 안된다.
 * 			이유는 컴파일 시에는 부모의 메서드를, 실행시에는 자식의 메서드를 사용하기 때문이다.
 * 
 * 		 - 선언시 자료형은 반드시 구현된 클래스일 필요는 없다. 추상클래스나 인터페이스도 가능하고, 이런 특성을 이용하여 개발자는 인터페이스를 통해서 명세를 제공할 수 있다.
 * 
 */



public class C08_polymorphism {

	public static void main(String[] args) {
		//	다형성 테스트
		Person p = new Student("HongGilDong", 17, "20240315", "도술");	// preson 이라는 부모 클래스에 자료를 집어넣었다 이를 업캐스팅이라 한다.
		
		// 오버라이드 된 메서드의 실행
		System.out.println(p.getDetails()); 	// 오버라이드 된 내용은 자식의내용을 출력한다.
		Person pO = new Person("LeeSoonSin", 40);
		System.out.println(pO.getDetails());

		
		p.walk();
		p.ages();
//		p.study();	// p는 다형적 객체 이기 때문에 부모 클래스에 있는 메소드만 사용한다.
		
		Student casting = (Student)p;									// 다운캐스팅
		// study() 를 사용해야 하는 경우에는  Student로 캐스팅이 되어야 가능하다.
		
		casting.study();
		
		/////
		
		Person p2;
		
		p2 = new Teacher("홍선생", 22, "Java Programming!!!");
		
		// instanceof 연산자는 좌항의 객체와 우항의 클래스를 비교!
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Teacher);
		System.out.println(p2 instanceof Student);
		System.out.println(p2.getDetails());

		

		p2 = new Employee("홍사원", 22, "교무처");
		
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Employee);
		System.out.println(p2.getDetails());
		
		
		p2 = new Student("홍학생", 18, "20240315", "도사");
		
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Student);
		System.out.println(p2.getDetails());
			
		
		
		
	}

}











