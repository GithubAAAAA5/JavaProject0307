package d;

class University {
	
	int num;
	static String name;
	
	//	static 내부 클래스 - static이 붙은 멤버와 동일하게 사용이 가능하다.
	// 	이 내부 클래스는 static이 붙어 있기 때문에 static이 붙은 멤버에만 접근이 가능하다. 
	//	접근 방식에 의해서 객체 생성 방법에서 차이가 생기게 된다.
	//	static이 없는 멤버 이너 클래스는 외부 객체를 생성한 후에 내부 클래스에 접근이 가능하다.
	//	static이 있는 경우에는 외부 클래스 객체 생성 없이 바로 호출이 가능하다.
	
	static class Student{
		
	}
}

class HighSchool {
	//	멤버 이너 클래스
	class Student {
		
	}
}
public class D04_staticinner {

	public static void main(String[] args) {
		// static 이 있는 경우
		University.Student us = new University.Student();
		
		// static이 없는 경우
//		HighSchool.Student high = new HighSchool.Student();		//  안됨. 그 이유는
		HighSchool high = new HighSchool();						// 외부 객체 생성을 먼저 하고
		HighSchool.Student hs = high.new Student();				// 내부 객체 생성을 해야 하기 때문
	
		System.out.println(us);
		System.out.println(hs);
	}
}
