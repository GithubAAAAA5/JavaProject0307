package compare;

import java.util.Comparator;

import obj.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {		//compare 라는 메소드가 override 되었다.
		// TODO Auto-generated method stub
		return o1.getWeight() - o2.getWeight();
		
	}

}
