//
//public class Account_Example {
//
//	public static void main(String[] args) {
//		// Account 클래스를 테스트하기 위한 메인 메서드 ^
//		
//		Account acc1 = new Account("홍길동", "010-1234-5678-999", null, 100000);
//		System.out.println("잔액 확인 : " + acc1.getBalance());
//		// 입금 : 10000원
//		acc1.saveMoney(10000);
//		System.out.println("10000원 입금 후 잔액 확인 :" + acc1.getBalance());
//		acc1.withdrawMoney(70000);
//		System.out.println("70000원 출금 후 잔액 확인 :" + acc1.getBalance());
//		
//	}
//
//}
//
//
//class Account {
//	
//	/*	
//	 * 	클래스 명 : Account
//	 * 	속성(명사적 특성을 가진다) : 이름 계좌번호 패스워드 예금 이자
//	 * 	기능(동사적 특성을 가진다) : 입금 출금 예금 확인
//	 * 	생성자 : 이름 계좌번호 패스워드 예금 을 이용한 오버로딩
//	 */	
//	
//	// 필드, 속성, 멤버변수
//	public String name;
//	public String accountNum;
//	public String pw;
//	public long balance;
//	public float interest;
//
//	
/////	Alt shift s
//	//생성자  //어떠한 값을 입력할 때에 그 값이 들어갈 자리에 대한 예시를 만들어두는것인가
//			//이름 계좌번호 비밀번호 잔액 에 대한 값을 보고자 할때
//			//생성자에서 이름 계좌번호 비밀번호 잔액 을 띄울수 있는 집?을 만들어주는것 같다.
//	
//	public Account(String name, String accountNum, String pw, long balance) {
//		this.name = name;
//		this.accountNum = accountNum;
//		this.pw = pw;
//		this.balance = balance;		
//	}
//
//	/// 메서드
//	
//	// 예금하다
//	public void saveMoney(long amount) {
//		balance = balance + amount; // balance += amount;
//	}
//	
//	// 출금하다	 - 패스워드를 입력하도록 만들어야 한다. 패스워드가 맞을때, 틀릴때
//	public void withdrawMoney(long amount) {
//		balance = amount;
//	}
//	
//	// 잔액 확인
//	public long getBalance() {
//		return balance;
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
