package obj.inheritance.badcase;

public class Employee {
	
	//	이름, 나이, 사번, 부서
	String name;
	int age;
	String companyID;
	String department;
	
	public String getDetalils() {
		return "[이름: " + name + "\t나이: " + age + "\t사번 : " + companyID + "\t부서 : " + department + "]";
	}
}
