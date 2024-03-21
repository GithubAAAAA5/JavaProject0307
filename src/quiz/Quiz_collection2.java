package quiz;

import java.util.HashMap;

public class Quiz_collection2 {

	public static void main(String[] args) {
		// 참가자 명단
		String[] first_participant = {"박지성", "안정환", "이영표"};
		String[] second_participant = {"손흥민", "이동국", "이천수", "이운재", "박주영"};
		String[] third_participant = {"이강인", "기성용", "김민재", "조현우"};
		
		// 완주자 명단
		String[] first_completion = {"박지성"};
		String[] second_completion = {"이동국", "박주영"};
		String[] third_completion = {"이강인"};
		
		System.out.println("첫번째 조 결과 : " + solution(first_participant, first_completion));
		System.out.println("두번째 조 결과 : " + solution(second_participant, second_completion));
		System.out.println("세번째 조 결과 : " + solution(third_participant, third_completion));
		
		
		

	}

	
	public static String solution(String[] participant, String[] completion) {
		String answer = "  ";
		HashMap<String, Integer> player = new HashMap<String, Integer>();
		
		for (String member : participant) player.put(member, player.getOrDefault(member, 0) + 1);
		System.out.println(" 도전자 결과 = " + player);
		
		for (String member : completion) player.put(member, player.get(member) - 1);
		System.out.println(" 통과자 결과 = " + player);
		
		for (String key : player.keySet()) {
			if(player.get(key) != 0) {
				answer = key + " , ";
			}
		}
		
		if (!answer.isEmpty()) {
			answer = answer.substring(0, answer.length() - 2);
		}
		return answer;
	}
}
