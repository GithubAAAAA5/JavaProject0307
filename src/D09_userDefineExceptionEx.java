

class Member {
	String name;
	String phone;
	String address;
	
	
	public Member(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	
}




public class D09_userDefineExceptionEx {

	public static void main(String[] args) {
		D09_userDefineExceptionEx memberManger = new D09_userDefineExceptionEx();
		try {
			memberManger.insert(new Member("홍길동", "010-1234-5678", "서울시 마포구"));
		} catch (DuplicateKeyException e) {
			System.out.println(e.toString());
		}

	}

	public void insert(Member member) throws DuplicateKeyException{
		System.out.println("고객 정보를 저장 합니다.");
		System.out.println(member.name + "님의 정보");
		// DB에 홍길동 / 010-1234-5678 정보가 있다고 간주
		if ("홍길동".equals(member.name) && "010-1234-5678".equals(member.phone)) {
				// 이 경우에 DB는 이미 정보가 있는 경우가 된다.
				// 이때 예외를 발생 시켜서 insert 메서드를 호출한 곳으로 데이터가 중복됨을 알린다.
			throw new DuplicateKeyException("데이터가 중복됩니다.");
		}else { 
			System.out.println("데이터베이스에 저장되었습니다.");
		}
	}
}


@SuppressWarnings("serial")		//시리얼 검사 하지 마 라는 명령
// 사용자 정의 예외 
class DuplicateKeyException extends Exception {
	
	public DuplicateKeyException(String message) {
		super(message);
	}
}













































