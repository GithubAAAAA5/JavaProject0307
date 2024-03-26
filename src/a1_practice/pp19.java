package a1_practice;

public class pp19 {

	public static void main(String[] args) {
		
		//줄반복
		
		for (int e=5; e >= 1; e--)   {
			for (int g =1; g < e; g++) {
			System.out.print(" ");	
			}
			for (int f =1; f <= 6-e; f ++) {
			System.out.print("*");
			}   
			System.out.println("");
			
		}
		
		for (int i=5; i >= 1; i--)   {
			for (int k =0; k < 5- i; k++) {
			System.out.print(" ");	
			}
			for (int j =1; j <= i; j ++) {
			System.out.print("*");
			}   
			System.out.println("");
			
		}
		
		for (int i=1; i <= 5; i++)   {
			for (int k =5-i; k > 0; k--) {
			System.out.print("k");	
			}
			for (int j =1; j <= i*2-1 ; j ++) {
			System.out.print("j");
			}   
			System.out.println("i");
			
		}
	}

}
