package a1_practice;

import java.util.Scanner;

public class pp15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("주소를 입력해 주세요 :");
		String address = scanner.nextLine();
		
		
		switch (address) {
		case "서울":
		System.out.println("저희 집은 서울 입니다.");
		break;
		case "제주":
			System.out.println("저희 집은 제주 입니다.");
			break;
			default :
				System.out.println("주소 없음");
		
		}

	}

}
