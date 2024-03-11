package quiz;

public class Quiz_240311_while {

	public static void main(String[] args) {
		// while문을 이용하여 구구단을 다음과 같이 세로로 출력해 주세요
		
		// 2단		3단		4단
		// 2X1=2	3X1=3	4X1=4
		//
		//
		// 2X9=18	3X9=27	4X9=36
		
///		for(int a = 2; a <= 9; a++) {
///			for (int b = 1; b <= 9; b++) {
///				System.out.println(a + "X" + b + "=" + (a*b));
///			}
///		}
///
///		for(int c = 1; c <= 19; c++) {
///			for (int d = 1; d <= 19; d++) {
///				System.out.println(c+"X"+d+"="+(c*d));
///			}
///		}
		
///		for(int e = 2; e <= 9; e++) {
///			System.out.print(e+"단");
///			for (int f = 1; f <=9; f++) {
///				System.out.println(e+"X"+f+"="+(e*f));
				
///			}
///		}
		
		// 강사님 방법
		
		int gop = 0;		//초기값
		while (gop <=9) {	//조건식
			
			int dan = 2; // ** 반복시 원래의 2로 돌아와야 한다. 
			
			while (dan <= 9) {
				
				if(gop == 0) {
					System.out.print(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop,dan*gop);
				}
				
				dan ++ ;
			}
			System.out.println();
			
			gop ++;
		}
		
		
		
		
		
	}

}