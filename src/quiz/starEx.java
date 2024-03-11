
package quiz;

public class starEx {

	public static void main(String[] args) {
		// 
		int dan = 5;
		
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < dan - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int dan2 = 4;
		
		for (int o = 0; o < dan2; o++) {
			for (int p = 0; p < o + 1; p++) {
				System.out.print(" ");
		}
			for (int p = 0; p < 2*dan2 - (2*o) - 1; p++) {
				System.out.print("*");
		}
			System.out.println();
	}

	}
}
