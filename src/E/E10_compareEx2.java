package E;
import java.util.Comparator;
import java.util.TreeSet;

public class E10_compareEx2 {

	public static void main(String[] args) {
		// TreeSet, TreeMap 은 이진 검색 트리를 구현한 컬렉션
		//  - 순서가 있기 때문에 정렬이 가능하다.
		//  - 정렬 방법은 Comparator, Comparable 인터페이스를 이용하여 지정/사용
		//  - Comparator는 class(객체)를 변경하지 않고 사용한다.
		//	- Comparable은 class(객체)에 값을 지정하여 사용해야 한다.
		
		
		// 이진 검색 트리란?
		//	- 모든 노드는 최대 두개의 자식 노드를 가질 수 있다.
		//	- 왼쪽 자식 노드의 값은 부모 노드의 값보다 작다.
		//	- 오른쪽 자식 노드의 값은 부모 노드의 값보다 크다.
		//	- 노드의 추가/삭제가 오래 걸린다.
		//	- 검색/정렬이 빠르다.
		
		TreeSet<GymMember> gym = new TreeSet<>();
		gym.add(new GymMember("박지성", 1000));
		gym.add(new GymMember("김연아", 1001));
		gym.add(new GymMember("싸이", 1002));
		gym.add(new GymMember("봉준호", 1003));
		gym.add(new GymMember("조현우", 1004));
		gym.add(new GymMember("BTS", 1005));
		gym.add(new GymMember("박찬호", 1006));
		System.out.println(gym);
		System.out.println("=============================");

		// 2. Comparator 을 이용			
		TreeSet<GymMember> gym2 = new TreeSet<>(new Comparator<GymMember>() {		// 익명 클래스
			@Override
			public int compare(GymMember o1, GymMember o2) {
				// compare 메서드 사용법
				//	- o1 과 o2의 자리를 바꾸고 싶다면 1을 return
				//	- o1 과 o2의 자리를 유지하고 싶다면 -1을 return
				//	- o1 과 o2가 같은 값임을 나타내고 싶다면 0을 return
				if (o1.name.charAt(0) < o2.name.charAt(0)) {
					return -1;
				}else if (o1.name.charAt(0) > o2.name.charAt(0)) {
					return 1;
				}else {
				return 0;	// Set인 경우에는 0이 리턴되면 중복으로 간주한다.
				}
			}
		});
		gym2.add(new GymMember("박지성", 1000));
		gym2.add(new GymMember("김연아", 1001));
		gym2.add(new GymMember("싸이", 1002));
		gym2.add(new GymMember("봉준호", 1003));
		gym2.add(new GymMember("조현우", 1004));
		gym2.add(new GymMember("BTS", 1005));
		gym2.add(new GymMember("박찬호", 1006));
		System.out.println(gym2);
		// charAt 에서 name값의 첫부분 (박 김 싸 봉 조 B 박) 을 비교한 후 박의 값이 중복되어 박찬호의 값이 사라짐.
		// o1.name.charAt(0) o2.name.charAt(0) 을 비교했을때 박 박 이기때문에 중복 return 값이 0 이됨
		// o1.name.charAt(1) o2.name.charAt(1) 인 경우 (지 연 이 준 현 T 찬) 의 값을 비교하기 때문에 박찬호는 사라지지 않음
		// o1.name.charAt(2) o2.name.charAt(2) 인 경우 싸이 는 해당하는 값이 없기때문에 err발생
		//  위의 경우 if (o1.name.length() > 2 && o2.name.length() > 2)  문을 추가해주면 문자열에서 걸러주기때문에 제시값보다 적은 값을 가지는 변수는 불러오지않아 err가 발생하지 않는다.
		
	}

}

class GymMember implements Comparable<GymMember> {
	
	// 멤버 변수
	String name;
	double height;
	double weight;
	int age;
	int memberNumber;
	
	
	// 생성자
	public GymMember(String name, int memberNumber) {
		this.name = name;
		this.memberNumber = memberNumber;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s [%d]", name, memberNumber); //%s는 문자열을, %d는 정수를 대체하는데 사용
		
	}
	
	@Override
	public int compareTo(GymMember o) {
		// compareTo 메서드는 매개변수 o를 통해서 비교 대상을 전달 받고,
		//  - 현재 인스턴스와 o의 자리를 바꾸고 싶은 경우 1을 리턴합니다. // 10(현재인스턴스) - 8(o) = 2(양수값) -> 1(양수값)리턴
		//  - 현재 인스턴스와 o의 자리를 그대로 유지하고 싶은 때는 -1을 리턴합니다. 8(현재인스턴스) - 10(o) = -2(음수값) ->(음수값)리턴
		//  1 2 3 5 4 6 7 8 9 의 경우 현재 인스턴스 5와 매개변수o (4) 를 비교했을때 양수가 나오면 5가 더 큰값이므로 순서를 바꿔준다.
		//  4와 6을 비교했을때 음수가 나오면 6이 더 큰 값이므로 자리의 변화가 일어나지 않는다.
		//  - 현재 인스턴스와 o가 같은 값임을 나타내고 싶다면 0을 리턴합니다.
		int next = o.memberNumber;
		System.out.println(memberNumber + " vs " + next);
		if (memberNumber < next) {
			return -1;  		// 음수 양수 정수 를 대표해서 -1 1 0 을 사용하는것일뿐 -2 -3 -4 사용해도 무방하다.
		}else if (memberNumber > next) {
			return 1;
		}else {
			return 0;
		}
	}
	
//	@Override		//return 값을 반대로 입력한 경우 ( 1 , - 1 ) 출력값을 내림차순으로 만들수 있다.
//	public int compareTo(GymMember o) {
//		int next = o.memberNumber;
//		System.out.println(memberNumber + " vs " + next);
//		if (memberNumber < next) {
//			return 1;  
//		}else if (memberNumber > next) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
	
}
