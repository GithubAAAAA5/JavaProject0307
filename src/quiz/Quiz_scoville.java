package quiz;

import java.util.PriorityQueue;

public class Quiz_scoville {

	public static void main(String[] args) {
		int[] scoville = {2, 3, 9, 10, 1, 12};
		int k = 7;
		System.out.println("음식을 최소 몇번 섞었을 때 원하는 맵기가 될까?" + solution(scoville, k));

	}

	public static int solution(int[] scoville, int K) {
		int answer = 0; 	// 시도 횟수
		
		
		// scoville 값을 저장한다 : 음식
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for (int i : scoville) {
			que.add(i);
		}
		System.out.println(" PriorityQueue 내용 :" + que);
		
		while (true) {					//반복을 돌려 값을
			answer ++;
			int result = que.poll() + (que.poll()*2);		// 변수의 순서와 상관없이 가장 작은값이 대입된다.
			que.add(result);
			System.out.println(answer + "번째 Que의 내용 : " + que);
			// 정해진 맵기 k 값을 넘어서는 섞은음식의 경우, 그 회차를 반환한다.
			if(que.peek() >= K) return answer;
			// K이상으로 만들 수 없는 경우 반환값은 -1
			if(que.size() == 1) return -1;
		}
				
//		return answer;
		
	}
}
