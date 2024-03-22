package a1_practice;

public class pp13 {

	public static void main(String[] args) {
		int score = 80;
		String grade = "";
		
		System.out.println("학점 부여");
		if (score > 90) {
			grade = "A";
		} else if(score > 80) {
			grade = "B";
		} else if(score > 70) {
			grade = "C";
		} else if(score > 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
		System.out.println("종료");

}

	
}