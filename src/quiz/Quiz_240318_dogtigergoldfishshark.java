package quiz;

interface Eat {
	String getFood();
}

interface Sleep {
	String getSleep();
}

class Land {
	
}

class Marine {
	
}

class Dog extends Land implements Eat, Sleep {
	@Override
	public String getFood() {
		return "사료를 먹습니다.";
	}
	@Override
	public String getSleep() {
		return "잠을 잡니다.";
	}
}

class Tiger extends Land implements Eat, Sleep {
	@Override
	public String getFood() {
		return "고기를 먹습니다.";
	}
	@Override
	public String getSleep() {
		return "잠을 잡니다.";
	}
}

class GoldFish extends Marine implements Eat, Sleep {
	@Override
	public String getFood() {
		return "플랑크톤을 먹습니다.";
	}
	@Override
	public String getSleep() {
		return "잠을 잡니다.";
	}
}

class Shark extends Land implements Eat, Sleep {
	@Override
	public String getFood() {
		return "물고기를 먹습니다.";
	}
	@Override
	public String getSleep() {
		return "잠을 잡니다.";
	}
}

public class Quiz_240318_dogtigergoldfishshark {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		GoldFish goldfish = new GoldFish();
		Shark shark = new Shark();

	}

}
