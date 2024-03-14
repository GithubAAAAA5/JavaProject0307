import obj.inheritance.Person;
import obj.inheritance.goodcase.Student;

public class C03_inheritanceExample {

	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.name = "HongGilDong";
//		p.age = 25;
//		p.height = 178.5f;		// person Package에서 height 를 protectde 로 처리하여 현package가 상속을받는 경우를 제외하고는 사용이 불가능 하다.
//		p.weight = 100.0f;			->   person에서만 사용하도록 되어있어 현 class에서는 출력되지 않는다 default
		Person p = new Person("HongGilDong", 25, 178.5f, 100.0f);
		System.out.println(p.getDetails());
		
//		Student s1 = new Student();
//		s1.name = "이순신";
//		s1.age = 30;
//		s1.studentID = "20240314";
//		s1.major = "해양학과";
		Student s1 = new Student("이순신", 30, "20240314", "해양학과");
		System.out.println(s1.getDetails());
	}

}
