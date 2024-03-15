import obj.inheritance.Person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

public class C08_polymorphism2 {

	public static void main(String[] args) {
		
		Student s = new Student("HongGilDong", 16, "20240315", "JAVA");
		printPersonInfo(s);
		
		Teacher t = new Teacher("TcHong", 23, "Java Programming");
		printPersonInfo(t);
		
		Employee e = new Employee("CwHong", 27,	 "교무처");
	}

	// 다형적 인자별로 출력하는 메서드
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("******************** Student Info ********************");
		}else if(p instanceof Teacher) {
			System.out.println("******************** Teacher Info ********************");
		}else if(p instanceof Employee) {
			System.out.println("******************** Employee Info *******************");
		}else {
			System.out.println("******************** Person Info ********************");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("********************************************************************************");
		}
}
