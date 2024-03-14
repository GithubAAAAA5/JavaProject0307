
/*
 * 	캡슐화(은닉)
 * 	접근 제한자를 이용하여 접근을 제한하는 경우로 
 * 	 - 외부에서 변수에 직접 접근 하지 못하게 막는다.
 * 	 - 직접 접근이 안되기 때문에 메서드를 통하여 변수의 값을 변경하거나 참조한다.
 * 
 * 	 왜 이러한 방식을 사용할까?
 *	 - 잘못된 값(데이터)이 변수의 값이 되는것을 방지하기 위해서.
 *	 - 접근 권한이 없는 사용자에 의한 데이터 접근을 방지하기 위해서.(보안)
 *
 *	 어떻게?
 *	 변수 선언 앞에 private
 *	 메서드 선언 앞에는 public (getter/setter)
 *
 *	 기억할 것은 변수만 아니라 클래스 안에서만 사용하는 메서드들에 대해서도 private설정이 가능하고 
 *	 이를 외부에서 사용할 때도 동일한 방식을 사용할 수 있다.
 */


public class C05_encapsulation {

	public static void main(String[] args) {
		//badcase
		MyDate_badCase myBirth = new MyDate_badCase();
		myBirth.day = 32;
		System.out.println("My Birth day is " + myBirth.day);
		
		//goodcase
		MyDate_goodCase myBirMyDate_goodCase = new MyDate_goodCase();
//		myBirMyDate_goodCase.day = 32;	//접근 제한자 private으로
		myBirMyDate_goodCase.setDay(32);
		System.out.println("My birth day is " + myBirMyDate_goodCase.getDay());
		
	}
	
}

// badCase
class MyDate_badCase {
	public int day;
	public int month;
	public int year;
}

// goodCase
class MyDate_goodCase {
	private int day;
	private int month;
	private int year;
	
	//getter
	public int getDay() {
		return day;
	}
	
	//setter : 입력값 검증
	public void setDay(int day) {
		if((day < 1) || (day > 31)) {
			System.out.println("잘못된 날짜 입니다.");
			this.day = 1;
		}else {
			this.day = day;
		}
	}
}
