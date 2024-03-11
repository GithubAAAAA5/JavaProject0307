package quiz;

public class Quiz_240305_5EverLand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 놀이공원가지 11개 지하철 역을 지남.
		// 출발역에서 도착역까지 37분 소요.
		// 한 역을 지나는데 걸리는 시간은? (소수점 2자리까지 출력)
		
		double stat = 11;
		int min = 37;
		
//		double result = min/stat 
//		system.out.println("한 역을 지나는데 걸린 시간은 "+result+"분이 소요되었다.");      
//										--->   3.36363636363636363636분 소요 로 결과값이 도출됨
		
		double result = (int)((min/stat)*100)/100.0;
		System.out.println("한 역을 지나는데 걸린 시간은 "+result+"분이 소요되었다.");
		

		
	}

}
