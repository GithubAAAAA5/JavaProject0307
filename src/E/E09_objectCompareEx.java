package E;
import java.util.TreeSet;

import compare.DogComparator;
import obj.Dog;

public class E09_objectCompareEx {

	public static void main(String[] args) {
		// 비교 객체 확인..
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈", "삐삐", 5);
		Dog d3 = new Dog("진돗개", "뽀삐", 15);
		
		// Dog d3와 d1의 비교
		System.out.println(d1 == d3);			// 저장된 위치가 같아야 한다.	-> 내용은 같지만 저장된 위치가 다르기때문에 false
		System.out.println(d1.equals(d3));		// equals는 저장된 객체의 내부 값을 보고 비교 -> 같기때문에 true 
		System.out.println(d1);
		System.out.println(d3);
		
		// Comparable 인터페이스를 구현한 경우
		TreeSet<Dog> treeTest = new TreeSet<Dog>();	// 크기를 비교하여 정렬해야하한다. 
		// public class Dog implements Comparable<Dog> 에서 컴페어를 사용하지 않는 경우 비교할수있는 수단? 이없어 err가 나온다.
		System.out.println(treeTest.add(d1));
		System.out.println(treeTest.add(d2));
		for (Dog dog : treeTest) {
			System.out.println(dog);
		}
		
		TreeSet<Dog> treeTest2 = new TreeSet<Dog>(new DogComparator());			
		// Class Dog 에서  public class Dog implements Comparable<Dog> 가 아닌  public class Dog 로 코드를 작성했을때 err 가 발생하는데 
		// 이 부분을  new TreeSet<Dog>(new DogComparator()); 로 net TreeSet<Dog>뒤에 new DogComparator 을 붙여 해결할 수 있다.
		System.out.println(treeTest2.add(d1));
		System.out.println(treeTest2.add(d2));
		for (Dog dog : treeTest2) {
			System.out.println(dog);
		}
		
	}

}
