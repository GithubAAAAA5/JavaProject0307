package a1_practice;

public class pp23 {
//다차원 배열
	public static void main(String[] args) {
		//첫번째
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = 1;
		matrix[0][1]= 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		//두번째
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//세번째
		int[][] matrix3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("[첫번째]");
		
		for(int i =0; i<matrix.length; i++) {
			for (int j =0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		
		
		// int [][] 가 [3][3] 을 선언 하여서
//		matrix[0][0] = 1;
//		matrix[0][1]= 2;
//		matrix[0][2] = 3;
//		matrix[1][0] = 4;
//		matrix[1][1] = 5;
//		matrix[1][2] = 6;
//		matrix[2][0] = 7;
//		matrix[2][1] = 8;
//		matrix[2][2] = 9; 이게 나왔고.args
//		0일때 3개 1일때 3개 2일때 3개의 값을 가지고 이는 .length 3
//		그리하여 i 값 을 구할때 나오는 m.length -> 0 1 2 로 .length 3
//		그런데 각각 0  1  2  는 3개의 값을 가지고 있으니 .length 3
//		그리하여 j 값은 0 1 2 
//		고로 식의 출력값은 
//		00 01 02
//		10 11 12
//		20 21 22 이고 이에 해당하는 값을 넣어줬기때문에 
//		123
//		456
//		789가 나오게 된다.
	}

}
