package a1_practice;

public class pp14 {

	public static void main(String[] args) {

		int math = 50;
		int eng = 65;
		
		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("pass");
			}
		} else {
			System.out.println("out");
		}
		
		if (eng >= 60) {
			if (math >= 60) {
				System.out.println("pass");
			}
		} else {
			System.out.println("out");
		}
	}

}
