
import obj.modifier.Super;

public class Sub extends Super {
	
	private int num5 = 50;
	
	public void print() {
		System.out.println("Super num1 = " + num1);
		System.out.println("Super num2 = " + num2);
//		System.out.println("Super num3 = " + num3);		// default 로 되어있는데, 이는 같은 패키지에서는 사용가능하지만 다른 패키지인 경우 사용할수없다.
//		System.out.println("Super num4 = " + num4);		// private 
		System.out.println("Super num4 = " + getNum4());
		System.out.println("Super num5 = " + num1);
	}

}
