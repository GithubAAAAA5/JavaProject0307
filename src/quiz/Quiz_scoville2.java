package quiz;

import java.util.PriorityQueue;

public class Quiz_scoville2 {

	public static void main(String[] args) {

		int[] scoville2 = {1, 2, 3, 4, 5, 6, 7};
		int H = 10;
		
		System.out.println("양념을 최소 몇번섞었을때 원하는 맵기가 될까? " + solution(scoville2, H));
		

	}
	
	public static int solution(int[] scoville2, int H) {
		int answer = 0;
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (int o : scoville2) {
			que.add(o);
		}
		System.out.println(" PriorityQueue 내용 " + que);
		
		while (true) {
			answer ++;
			int result = que.poll() + (que.poll()*2);
			que.add(result);
			System.out.println(answer + "번째 que" + que);
			
			if(que.peek() >= H) return answer;
			
			if(que.size() == 1) return -1;
		}
	}

}
