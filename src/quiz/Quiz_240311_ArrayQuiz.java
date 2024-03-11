package quiz;

import java.util.Arrays;

public class Quiz_240311_ArrayQuiz {

	public static void main(String[] args) {
		// 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 
		//    랜덤 숫자로 채워보세요
		
		// 배열 선언 및 초기화
		int[] nums = new int[1000]; // int 는 4byte 이고 1000개 이기에 4000byte의 저장공간이 생성된다.
			
		// random 1 ~ 100 값으로 대입
		
		for (int i = 0; i < 1000; i++) {
			nums[i] = (int)(Math.random()*100) + 1;		// 0에서 부터 99까지의 숫자가 나오기때문에 +1을 해준다.
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(nums.length);
		
		
		// 2. 1000개의 램덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요 
		
		int[] cnt = new int[100];		//1부터 100까지 각숫자를 세기 위해 100개의 [] 저장공간을 만들어준다.
		
		for (int j = 1; j <= 100; j++) {	// 1 - 100 사이의 숫자의 횟차를 구함.
			for (int i = 0; i < nums.length; i++) {	// 0부터 999사이의 인덱스를 참조한다.
				if(j == nums[i]) {
					cnt[j - 1]++;			// 1000개의 값이지만 1-1000 이 아닌 0 - 999의 인덱스 값이기 때문에 -1을 해준다.
				}
			}
		}
		
		// 검증하기
		int check = 0;
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(i + 1 + " 이 나온 횟수 : " + cnt[i]);
			check += cnt[i];
		}
		System.out.println(check); 	// check 값은 1000이 되어야 한다. why? 1000개의 랜덤 숫자가 있고 1부터100의 숫자의 각 횟수를 더하면 1000이 나와야 하기 때문
		
	}

}