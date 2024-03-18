package quiz;

interface Animal {
	void sleep();
	void eat();
}

interface Pet {
	void play();
}

class LandAnimal2 {
	void run() {
		System.out.println("육지 동물은 뛸 수 있습니다.");
	}
}

class MarineAnimal2 {
	void swim() {
		System.out.println("해양 동물은 헤엄칠 수 있습니다.");
		
	}
}


class Dog2 extends LandAnimal2 implements Animal, Pet {
	
	@Override
	public void sleep() {
		System.out.println("개는 잠을 잡니다.");
	}
	@Override
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
	@Override
	public void play() {
		System.out.println("이 동물은 애완동물이 될 수 있습니다.");
	}
}

class GoldFish2 extends MarineAnimal2 implements Animal, Pet {
	
	@Override
	public void sleep() {
		System.out.println("금붕어는 잠을 잡니다.");
	}
	@Override
	public void eat() {
		System.out.println("금붕어는 플랑크톤을 먹습니다.");
	}
	@Override
	public void play() {
		System.out.println("이 동물은 애완동물이 될 수 있습니다.");
	}
}

class Tiger2 extends LandAnimal2 implements Animal {
	
	@Override
	public void sleep() {
		System.out.println("호랑이는 잠을 잡니다.");
	}
	@Override
	public void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}

class Shark2 extends MarineAnimal2 implements Animal {
	
	@Override
	public void sleep() {
		System.out.println("상어는 잠을 잡니다.");
	}
	@Override
	public void eat() {
		System.out.println("상어는 물고기를 먹습니다.");
	}
}

public class Quiz_240318_dogtigergoldfishsharkAS {

	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		GoldFish2 goldfish = new GoldFish2();
		Tiger2 tiger = new Tiger2();
		Shark2 shark = new Shark2();
		dog.run();
		dog.sleep();
		goldfish.sleep();
		goldfish.swim();
		goldfish.eat();
		tiger.eat();
		shark.eat();
		play(dog);

	}
	
	public static void play (Pet pet) {
		pet.play();
	}

}
