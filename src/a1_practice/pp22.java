package a1_practice;

public class pp22 {


		
	public static void main(String[] args) {
		
//				     열
//			0.0		0.1		0.2
//
//		행	1.0		1.1		1.2
//
//			2.0		2.1		2.2
//				3 X 3 의 행렬
		
		int[][] matrix = new int[3][3];

		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
//	  			     열
//			 1		 2		 3
//			0.0		0.1		0.2
			 
//			 4       5       6
//		행	1.0		1.1		1.2

//			 7       8       9
//			2.0		2.1		2.2
//				3 X 3 의 행렬
		

		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrix3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
	// matrix2 와 matrix3 은 완전히 동일한 값을 가지는 배열 변수이다.
		};
	}

}
