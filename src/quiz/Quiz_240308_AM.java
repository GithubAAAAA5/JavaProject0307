package quiz;

import java.util.Scanner;

public class Quiz_240308_AM {

	public static void main(String[] args) {
		// quiz1 
		// 1 ~ 101 미만의 임의의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요.(3항 연산식을 사용)
		
//		int num (int)(Math.random()*100)  // 이때 나오는 숫자는 0 부터 99가 나온다.
//		int num (int)(Math.random()*100) +1;  // 값에 1을 붙여줬기 때문에 1 부터 100의 숫자의 값을 얻을수 있다.
		
///		int num = (int)(Math.random()*100) +1;
///		System.out.println("랜덤 수는 : "+num);
///		System.out.println("3항 연산의 결과 : "+(num%2 == 0? "짝수" : "홀수"));
		
		// quiz2
		// -5 ~ 5 사이의 임의의 정수를 생성하고, 삼항연산식을 사용하여 절대값을 출력하세요.
		// 0 <= x <=10, y가 -5 <= y <= 5 의 식을 구하세요  5-x = y
///		int num2 = 5 - (int)(Math.random()*11);    // int num2 는 y       랜덤수를 구하기 위한 입력문구 는 (int)(Math.random); 이고 구해야하는 x값의 범위가 0 에서 10 이기 때문에 11을 넣어준다.
///		System.out.println("랜덤 수는 : "+num2);
///		int abs = (num2 >=0 ? num2 : -num2);       // -num2 => num2 * -1
///		System.out.println(num2+"의 절대값은 :"+abs);
		
		// quiz3 
		// 정수를 입력받아 그 수가 짝수인지 홀수인지 출력하는 프로그램을 작성하세요.(3항연산식을 사용)
///		Scanner scan = new Scanner(System.in);
///		System.out.print("정수를 입력하세요 : ");
///		int num3 = scan.nextInt();
///		String result = num3%2 == 0 ? "짝수" : "홀수";
///		System.out.println("입력받은 "+num3+" 는 : "+result);
		
		// quiz4
		// 키와 나이를 입력받아 놀이기구의 탑승 여부를 결정하는 프로그램을 작성하세요. / 스캐너를 통해 키와 나이를 입력 / 조건문을 사용하여 키 검사 / 나이 검사 / 두가지 모두 합격인 경우 통과
		// (조건 키 : 140 이상, 나이 : 8살 이상)
		
///		Scanner scan = new Scanner(System.in);
///		System.out.print("키를 입력하세요 : ");
///		int num4 = scan.nextInt();
///		Scanner scan2 = new Scanner(System.in);
///		System.out.println("나이를 입력하세요 : ");
///		int num5 = scan2.nextInt();
///		String result = num4 >= 140 ? "합격" : "불합격";
///		System.out.println("키 "+num4+" 는 :  "+result);
///		String result2 = num5 >= 8 ? "합격" : "불합격";
///		System.out.println("나이 "+num5+" 는 :"+result2);
		
		///강사님방법\\\
///		System.out.println("키와 나이를 입력하세요");
///		System.out.print("키 : ");
///		double height = scan.nextDouble();
///		System.out.print("나이 : ");
///		int age = scan.nextInt();
///		System.out.println("=============================");
///		if(height >= 140) {
///			if(age >= 8 ) {
///				System.out.println("놀이기구 탑승이 가능합니다.");
///			}else {
///				System.out.println("놀이기구 탑승 불가입니다.");
///			}
///		}else {
///			System.out.println("놀이기구 탑승 불가입니다.");
///		}
		
		
		// quiz5
		// 정수 두개를 입력받아서 큰 수를 출력. 같은 경우에는 같다고 출력하는 프로그램을 작성하세요. / a 와 b 를 두고 뺀값이 양수일경우는 a 가 큰 수 음수일 경우는 b가 큰 수 0이 나오는 경우는 동일
		
///		Scanner scan = new Scanner(System.in);
///		System.out.println("정수 두개를 입력하세요");
///		System.out.print("> ");
///		int num9 = scan.nextInt();
		
///		System.out.print("> ");
		
///		int num99 = scan.nextInt();
		
///		if (num9 == num99) {
///			System.out.println("같은 수 입니다.");
///		}else if(num9 > num99) {
///			System.out.println(num9 + "이 큰 수 입니다.");
///		}else {
///			System.out.println(num99 + "이 큰 수 입니다.");
///		}

		
		
		
		// quiz6
		// 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다를 출력, 음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요.
		
///		Scanner scan = new Scanner(System.in);
///		System.out.println("정수를 입력하세요");
///		System.out.println("> ");
///		int num10 = scan.nextInt();
///		if(num10 > 0) { //양의 정수
///			if (num10%2 == 0) System.out.println(num10 + "은(는) 짝수입니다.");
///			else System.out.println(num10 + "은(는) 홀수입니다.");
///		}else if(num10 == 0) { //0인경우
///			System.out.println("입력한 정수는 0 입니다.");
///		}else { //음의 정수
///			System.out.println(num10 + "은(는) 음의 정수 입니다.");
///		}
		
		
		// quiz7 
		// switch 를 사용하여 수박 사과 멜론 포도 귤 을 구매시 가격을 출력하는 프로그램을 작성하세요.
		// (switch를 사용) 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구매한 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.println("> ");
		String fruit = scan.next();
		
		switch(fruit) {
		case "수박":
			System.out.println(fruit +"의 가격은 2만원 입니다.");
			break;
		case "사과":
			System.out.println(fruit +"의 금액은 3만원 입니다.");
			break;
		case "멜론":
			System.out.println(fruit +"의 액수는 4만원 입니다.");
			break;
		case "포도":
			System.out.println(fruit +"의 정가는 5만원 입니다.");
			break;
		case "귤":
			System.out.println(fruit +"의 소비자가는 6만원 입니다.");
			break;
		default:
			System.out.println(fruit +"은(는) 판매하고 있지 않습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}

		scan.close();					//작업을 종료하여 할당메모리를 회수
	}

}
