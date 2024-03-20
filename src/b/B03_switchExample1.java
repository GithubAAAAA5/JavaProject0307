package b;

public class B03_switchExample1 {

	public static void main(String[] args) {
		// switch(수식) ~ case 구문
		
		int jumsu = (int)(Math.random()*100);
		System.out.println("점수 : "+jumsu);
		
		switch(jumsu / 10) {
		case 9 :
			System.out.println("당신의 학점은 A입니다.");
			break; //switch case 구문에서 나가야 하기 때문에 break를 사용  // break가없으면 그 다음 케이스의 값까지 나온다.
		case 8 :
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7 :
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6 :
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
//		case 5,4,3,2,1 :
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자 입니다.");			
		}

	}

}
