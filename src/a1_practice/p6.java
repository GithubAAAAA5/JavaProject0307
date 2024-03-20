package a1_practice;

public class p6 {

	public static void main(String[] args) {
//		Return obj = new Return();
//		String name  = obj.getName();
//		int age = obj.getAge();
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(obj.getName());
//		System.out.println(obj.getAge());
//		
//	}
//
//}
//
//class Return {
//	String getName() {
//		return "홍길동";
//		
//		
//	}
//	int getAge() {
//		return 30;
//	}
//}

		
		Return2 obj = new Return2();
		 
		obj.getTest(0);
		obj.getTest(1);
		
		System.out.println(obj.getName(0));
		System.out.println(obj.getName(1));
		
		
	}
	
}


class Return2 {
	void getTest(int type) {
		System.out.println("getTest() 메서드 시작");
		
		if (type == 1 ) {
			return;
		}
		System.out.println("getTest() 메서드 끝");
	}
	
	String getName(int type) {
		if (type == 1) {
			return "";
		}
		return "홍길동";
	}
}
