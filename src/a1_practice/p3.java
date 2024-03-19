package a1_practice;

public class p3 {

	public static void main(String[] args) {
		
		int price = 187000;
		int oman = price / 50000;
		int ilman = price % 50000 / 10000;
		int ochun = price % 10000 / 5000;
		int ilchun = price % 5000 / 1000;
		
		System.out.println("5만원권 : " + oman + "장");
		System.out.println("만원권 : " + ilman + "장");
		System.out.println("오천원권 : " + ochun + "장");
		System.out.println("천원권 : " + ilchun + "장");
				
				
		int number = 12134;
		int result = number / 1000 * 1000;
		System.out.println(result);
		int result2 = number - number%1000;
		System.out.println(result2);
		
	}

}
