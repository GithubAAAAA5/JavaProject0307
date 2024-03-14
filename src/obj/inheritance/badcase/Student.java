package obj.inheritance.badcase;

public class Student {
	
	//	이름, 나이, 학번, 전공
	String name;
	int age;
	String studentID;
	String major;
	
	public String getDetalils() {
		return "[이름: " + name + "\t나이: " + age + "\t학번 : " + studentID + "\t전공 : " + major + "]";
	}

}
