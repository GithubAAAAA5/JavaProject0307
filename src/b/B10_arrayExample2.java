package b;

public class B10_arrayExample2 {

	public static void main(String[] args) {
		// 다차원 배열
		// 1차원 배열 : 데이터 타입이 int 로 구성되어 있는 배열
		int[] numbers = { 1, 2, 3, 4, 5};
		
		//	배열의 요소는 length - 1번 공간(방, 저장공간) 까지 존재한다.
		System.out.println(numbers[numbers.length - 1]);
		
		//	2차원 배열 : 데이터 타입이 int[]로 구성되어 있는 배열이다.
		int[][] arr2 = {
				{1,2,3},		// index 0
				{4,5,6},		// index 1
				{7,8,9},		// index 2
				numbers			// index 3		//1차원 배열
		};
		
		System.out.println("1 : "+ arr2[1][2]);		// 앞에있는 []는 1 4 7 의 위치 뒤에있는 []는 1 2 3 에 해당하는 위치를 말하며 / index는 0부터 시작임을 잊지말아야 한다.
		System.out.println("2 : "+ arr2[2][1]);
		System.out.println("3 : "+ arr2[2][2]);
		System.out.println("4 : "+ arr2[3][arr2[3].length - 1]);
		System.out.println("int[]의 갯수" + arr2.length);
		
		//	3차원 배열 : int[][]을 요소로 가지고 있는 배열입니다.
		//	int[][][] arr3 = { arr2, arr2, arr2, arr2}
		
		int[][][] arr3 = new int[4][][];		//	2차원 배열을 4개 가지고있는 배열이라고 선언
		arr3[0] = arr2;
		arr3[1] = arr2;
		arr3[2] = arr2;
		arr3[3] = arr2;
		
		System.out.println("5: "+arr3[0][3][2]);
		
		//	4차원 배열 : int[][][]를 요소로 가지고 있는 배열이다.
		int[][][][] arr4  = { arr3, arr3, arr3, arr3 };
		
		//	n차원 배열 : 배열의 요소로 (n - 1)차원 배열을 가지고 있는 배열이다.
		//	n차원 배열에 대한 모든 요소는 n중복 반복문을 이용하여 탐색할 수 있다.
		
		// arr2의 요소들의 값을 알아오는 반복분 작성하기
		
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
	}

		
		//	arr3의 요소 값을 알아와서 출력하는 반복문 작성하기
		
		for (int a = 0; a < arr3.length; a++) {
			for(int b = 0; b < arr3[a].length; b++) {
				System.out.print("[");
				for(int c = 0; c < arr3[a][b].length; c++) {
					System.out.print(arr3[a][b][c]);
					if (c != arr3[a][b].length - 1) System.out.print(" ");
				}
				System.out.print("]");
			}
			System.out.println();
		}
}
	
}
