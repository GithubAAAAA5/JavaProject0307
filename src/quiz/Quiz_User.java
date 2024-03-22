package quiz;

///*1. User 클래스를 생성해 주세요. User클래스는 이름과 나이를 멤버변수로 가지고 있는 클래스입니다. 
//  toString작업까지 완료해주세요~!~~
//
//2. 다음 코드의 비어 있는 부분을 완성하여 프로그램이 동작하게 만들어 주세요. 
//public class ArrayListQuiz {
//
//	public static void main(String[] args) {
//		
//		//1. User를 저장하는 List를 선언하세요
//
//
//		Scanner scan = new Scanner(System.in);
//
//		while(true) {
//
//			System.out.println("메뉴를 입력하세요.");
//			System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 종료 ]");
//			System.out.print(">>> ");
//			int menu = scan.nextInt();
//
//			if(menu == 1) {
//				/*
//				Scanner를통해 이름과, 나이를 입력받고 User객체에 저장합니다.
//				그리고 User객체를 list에 추가하세요.
//				*/
//
//			}else if(menu == 2) {
//				
//				System.out.println("====== 모든 회원 정보 ======");
//				/*
//				 * people의 길이만큼 회전하면서 people의객체를 꺼내 저장합니다. (객체의 타입에 유의)
//				 * 꺼낸 하나의 객체에서  공개된 메서드를 통해 이름, 나이를 출력하세요.
//				 * 
//				 */
//				
//				System.out.println("==========================");
//
//
//			}else if(menu == 3) {
//				System.out.println("찾을 이름을 입력하세요.");
//				System.out.print(">>> ");
//				String name = scan.next();
//				
//				for(int i=0; i<people.size(); i++) {
//					User p = people.get(i);
//					String pName = p.getName();
//					
//					if(pName.equals(name)) {
//						System.out.println("이름: " + name + ", 나이: " + p.getAge());
//						break;
//					} 
//					//people List의 인덱스는 size -1이 됩니다.
//					if (i == people.size() -1) {
//						System.out.println(name +"님은 목록에 없습니다.");

public class Quiz_User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
