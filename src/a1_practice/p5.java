package a1_practice;

public class p5 {

	public static void main(String[] args) {
		int score = 60;
		System.out.println("시작");
		if (score > 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		int score2 = 70;
		String grade = "";
		
		System.out.println("학점부여시작");
		if (score >= 95) {
			System.out.println("A입니다.");
		} else if (score >= 85 ) {
			System.out.println("B입니다.");
		} else if (score >= 75 ) {
			System.out.println("C입니다.ㅂ");
		} else if (score >= 65) {
			System.out.println("D입니다.");
		} else {
			grade = "F";
		}

	}

}
