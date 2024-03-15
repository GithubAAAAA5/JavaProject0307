import obj.inheritance.Person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

public class C09_HeteroCollection {

	public static void main(String[] args) {
		Person[] pArr = new Person[4];
		
		pArr[0] = new Person("홍", 19);
		pArr[1] = new Student("홍군", 18, "20240315", "구름타기");
		pArr[2] = new Teacher("홍쌤", 28, "도사란 무엇인가");
		pArr[3] = new Employee("홍조교", 33, "대학원");
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
		
		for (Person p : pArr) {
			System.out.println(p.getDetails());
		}
	}

}
