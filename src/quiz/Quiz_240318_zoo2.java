package quiz;

interface Feed {
	String getFood();
}

class Carnivore2 {		//육식
	
}

class Herbivore2 {		//초식
	
}

class Deer2 extends Herbivore2 implements Feed {		//사슴
	@Override
	public String getFood() {
		return "건초";
	}
}

class Lion2 extends Carnivore2 implements Feed {		//사자
	@Override
	public String getFood() {
		return "고기";
	}
}

class ZooKeaper2 {		//사육사
	public void feed(Feed feed) {
		System.out.println(feed.getFood() + " 를 줍니다.");
	}
}

public class Quiz_240318_zoo2 {

	public static void main(String[] args) {
		ZooKeaper2 zk2 = new ZooKeaper2();
		Lion2 lion2 = new Lion2();
		Deer2 deer2 = new Deer2();
		zk2.feed(deer2);
		zk2.feed(lion2);

	}

}
