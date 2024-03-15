package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Teacher extends Person {		// 부모가 가지고 있는 name 과 age 를 가져옴

	public String teacherID;
	public String subject;
	
	public Teacher() {}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
			this.subject = subject;
	}
	
	
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름 : " + name + "\t나이 : " + age + "\t교번 : " + teacherID + "\t과목 : " + subject + "]";
	}
}
