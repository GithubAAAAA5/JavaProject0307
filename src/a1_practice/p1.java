package a1_practice;

public class p1 {

	public static void main(String[] args) {
		
		Param p = new Param();
		p.add(10,5);
		//p.add("10", "5"); //err
		
		p.add2(10, 5);
		
		p.add3(1,2,3,4,5,6,7,8,9,10);

	}

}

class Param {
	
	void add(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}
	
	void add3(int ... x) {
		int sum = 0;
		for (int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
}
