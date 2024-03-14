package obj.inheritance.badcase;

public class Teacher {
	
	//	이름, 나이, 교번, 담당 과목
	String name;
	int age;
	String techerID;
	String subject;
	
	public String getDetalils() {
		return "[이름: " + name + "\t나이: " + age + "\t교번 : " + techerID + "\t과목 : " + subject + "]";
	}
	
}
