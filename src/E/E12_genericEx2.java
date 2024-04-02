package E;
import java.util.ArrayList;

import generic.Person;

public class E12_genericEx2 {

	public static void main(String[] args) {
		Wallet<Card, Money> card_wallet = new Wallet<>("파란색");
		Wallet<CreditCard, Money> card_wallet2 = new Wallet<>("검은색");
		
//		Wallet<String, Integer> card_wallet3 = new Wallet<>("하늘색"); //경계를 넘었다.err
		card_wallet.pouch.add(new CreditCard());
		card_wallet.pouch.add(new CheckCard());
		card_wallet.pouch.add(new BusCard());
		card_wallet.pouch.add(new StudentCard());
//		card_wallet2.pouch.add(new CheckCard()); 위에서 CreditCard 를 지정했기에 CheckCard는 err
		card_wallet2.pouch.add(new CreditCard());
		
		card_wallet2.pouch2.add(new Dollar());
		card_wallet2.pouch2.add(new Won());
		card_wallet2.pouch2.add(new Wian());
		card_wallet2.pouch2.add(new En());
//		wallet2 에서 Money 를 지정했기때문에 Money를 상속받는 객체는 전부 가능		
		
		
		//
		ArrayList<Integer> int_list = new ArrayList<>();
		ArrayList<String> str_list = new ArrayList<>();
		ArrayList<Object> obj_list = new ArrayList<>();
		
		str_list.add("제네릭 때문에 문자열만 들어갑니다.!");
		str_list.add("이유는? 문자열 제네릭 컬렉션으로 지정되기 때문이죠.!");
		int_list.add(100);
		int_list.add(new Integer(20));
		obj_list.add(new Person<String>("홍길동", 11));
		
		usingArrayListMethod(obj_list);
		usingArrayListMethod(str_list);
		usingArrayListMethod(int_list);
		
		usingArrayListMethod(card_wallet);
		usingArrayListMethod(card_wallet2);
		
	}

	// 제네릭이 다른 것만으로 오버로딩은 할 수 없다는 것.
//	static void usingArrayListMethod(ArrayList<Inter> list) {
//		System.out.println(list);
//	}
	
//	static void usingArrayListMethod(ArrayList<String> list) {
//		System.out.println(list);
//	}
	
	// <?> : 와일드 카드. 제네릭으로 오버로드를 구현하고 싶을 때 사용한다.
	static void usingArrayListMethod(ArrayList<?> list) {
		System.out.println(list);
	}
	 
	static void usingArrayListMethod(Wallet<? extends Card, ? extends Money> w) {
		System.out.println(w);
	}
}

// 제너릭에서 extends는 타입 범위를 제한하는 역할을 하게 된다.
//	- One extends Card : 첫번째 타입으로 Card를 상속 받는 클래스만 허용한다.
	//부모가 Card 인 객체들만 One 에 들어갈 수 있다.
//	- Two extends Money : 두번째 타입으로 Money를 상속 받는 클래스만 허용한다.
	// 부모가 Money 인 객체들만 Two 에 들어갈 수 있다.
class Wallet<One extends Card , Two extends Money>	{
	
	ArrayList<One> pouch;
	ArrayList<Two> pouch2;
	String color;
	
	//생성자
	
	public Wallet(String color) {
		this.pouch = new ArrayList<>();
		this.pouch2 = new ArrayList<>();
		this.color = color;
	}
	
	public One get(int index) {
		return pouch.get(index);
	}
	
	@Override
	public String toString() {
		return "지갑의 내용물을 출력합니다.";
	}
	
}


class Card {}
class CreditCard extends Card {}
class CheckCard extends Card {}
class BusCard extends Card {}
class StudentCard extends Card {}

class Money {}
class Won extends Money {}
class Dollar extends Money {}
class Wian extends Money {}
class En extends Money {}



